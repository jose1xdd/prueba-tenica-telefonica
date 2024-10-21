package com.prueba.telefofica.exception;


import com.prueba.telefofica.model.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<String> errorMessages = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error -> ((FieldError) error).getField() + ": " + error.getDefaultMessage())
                .toList();

        String message = String.join(", ", errorMessages);
        ResponseDto response = createResponse(message);

        log.error("Validation error: {}", message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler({PruebaEstudianteException.class, Exception.class, IOException.class, DateTimeParseException.class})
    public ResponseEntity<Object> internalErrorException(Exception e) {
        log.error(e.toString());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseInternalServer(e.getMessage()));
    }

    private ResponseDto createResponse(String message) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setTimestamp(LocalDateTime.now().toString());
        responseDto.setMessage(message);
        return responseDto;
    }

    ResponseDto responseInternalServer(String message) {
        String defaultMessage = "Internal Server Error";
        return createResponse(Objects.requireNonNullElse(message, defaultMessage));
    }


}
