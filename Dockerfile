FROM jetty:latestf

COPY Swagger_doc/target/swagger-jaxrs-server-1.0.0.war /swagger-jaxrs-server-1.0.0.war

CMD ["java", "-war", "swagger-jaxrs-server-1.0.0.war"]