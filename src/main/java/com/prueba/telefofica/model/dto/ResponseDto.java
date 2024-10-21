package com.prueba.telefofica.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto {
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("message")
    private String message;
}