# reto-tecnico
Creacion de Servicios ,, implementado con  Base de Datos de tipo local H2
Tutorial 
Para poder realizar las pruebas al proyecto, se necesitara  como requisito tener instalado:
-MAVEN
-Java 8
Luego tenemos que descargar las fuentes del git, realizando un git clone en consola, líneas abajo esta la url:
https://github.com/anderson6466/reto-tecnico.git
 
 
Luego cargar las fuentes en un IDE de su preferencia, en mi caso estoy usando el STS4:
 


Luego para instalar las dependencias Clic Derecho   e ir a :  RUN AS ->   MAVEN INSTALL
Pasos para ejecutar el proyecto.
Clic Derecho   e ir a :  RUN AS ->   Spring Boot
 

Una vez que esta iniciado, podemos ir a url de Swagger:   http://localhost:8085/api/v3/swagger-ui/#/user/addUser   donde puede realizar las pruebas del caso.










Tambien se puede realizar las pruebas en el Postman, consumiendo esta URL:
http://localhost:8085/api/v3/create-user

 
Respecto a la Base de Datos , podrá acceder mediante  esta url:
http://localhost:8085/api/v3/h2-console
Asegúrese de que tenga estos valores, no se preocupe por la contraseña no lo necesitara, y podrá realizar todos los querys del caso , como ver la data guardada.


