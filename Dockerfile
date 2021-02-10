FROM tomcat:latest

EXPOSE 8085

COPY Webapp/target/swagger-jaxrs-server-1.0.0.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "-run"]