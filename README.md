# mi-primer-api-rest

Este proyecto esta creado con fines de práctica, para el aprendizaje y conocimiento de las API REST, dentro de este proyecto se creo un pequeño CRUD con las siguientes tecnologías

- Java 17
- Spring Boot
- Swagger
- MySql


<img width="40px" alt="Java" src="https://github.com/RodrigoBaltazarDuran/mi-primer-api-rest/assets/66747394/8fc3052f-b67d-4fed-b0fc-481d95e7268d"/>
<img width="40px" alt="Spring Boot" src="https://github.com/RodrigoBaltazarDuran/mi-primer-api-rest/assets/66747394/672eb127-ca2c-44b4-b958-8e1001ec08bb"/>
<img width="40px" alt="Swagger" src="https://github.com/RodrigoBaltazarDuran/mi-primer-api-rest/assets/66747394/227fae80-1c91-4932-9ea3-9a6f7e00942b"/>
<img width="40px" alt="MySql" src="https://github.com/RodrigoBaltazarDuran/mi-primer-api-rest/assets/66747394/a9c54452-acde-44ef-ac8f-ae18ec6e855b"/>

## Hacer pruebas con la API
Si se desea clonar el proyecto para poder hacer pruebas del mismo, se recomienda usar inteliJ pero se puede utilizar cualquier otro, una vez abiero el proyecto se debe de correr el siguiente archivo:

`src/main/java/com/std/ec/miprimerapirest/MiPrimerApiRestApplication.java`

esto correrá el proyecto en tu puerto local 8092 ya sea que hagas las pruebas desde POSTMAN o si deseas debido a que el proyecto tiene SWAGGER puedes agregar a la ruta de entra la siguiente dirección:

`/swagger-ui-custom.html`

con esto se abrira una ventana en el navegador con la interfaz de swagger y los endpoint para poder hacer las pruebas de la API directamente en el navegador sin tener que usar POSTMAN

## Nota:

Para esto se deberá crear una base de datos dentro de tu propia base de datos MySql, de lo contrario te marcará errores, la base de datos que se debe crear debe ser la siguiente:

- Base de datos -> "db_springboot_dev"
- Tabla -> "clientes"
- columnas ->
  - "id_cliente int auto_increment not null"
  - "nombre varchar(45)"
  - "apellido varchar(45)"
  - "correo varchar(45)"
  - "fecha date"
