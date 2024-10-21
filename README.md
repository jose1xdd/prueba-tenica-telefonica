# Documentación del Proyecto

## Especificación y Configuración

- **Especificación OpenAPI:**  
  Se deja la especificación **OpenAPI** para documentar los endpoints del servicio.

- **Docker Compose:**  
  Se proporciona un archivo `docker-compose.yml` para la configuración de la base de datos.

---

## Variables de Entorno

Para la conexión con la base de datos, se deben configurar las siguientes variables de entorno:

- **`JDBC_URL`**: URL de conexión JDBC.
- **`DB_USER`**: Usuario de la base de datos.
- **`DB_PASS`**: Contraseña del usuario de la base de datos.

---

## Instrucciones

1. Asegúrate de tener **Docker** y **Docker Compose** instalados en tu sistema.
2. Configura las variables de entorno en tu entorno local o en el archivo `.env`.
3. Ejecuta el siguiente comando para levantar la base de datos con Docker Compose:

   ```bash
   docker-compose up -d
