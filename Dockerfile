FROM openjdk:17
EXPOSE 8080
ADD target/SoftwareCompany-0.0.1-SNAPSHOT.jar SoftwareCompany-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","jar","/SoftwareCompany-0.0.1-SNAPSHOT.jar"]