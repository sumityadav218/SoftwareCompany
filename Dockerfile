FROM openjdk:17
EXPOSE 8080
ADD target/SoftwareCompany.jar SoftwareCompany.jar
ENTRYPOINT ["java","jar","/SoftwareCompany.jar"]