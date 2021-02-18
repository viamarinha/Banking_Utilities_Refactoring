FROM maven:3.6.3-jdk-8

RUN mkdir /opt/app

WORKDIR /opt/app

COPY ./ /opt/app
RUN mvn install

WORKDIR /opt/app/BankingUtilities_Webapp

EXPOSE 8085

CMD ["mvn", "jetty:run-war"]

