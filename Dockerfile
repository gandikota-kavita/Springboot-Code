FROM openjdk:11
LABEL maintainer ="aws"
ADD target/AWS-Deply-0.0.1-SNAPSHOT.war AWS-Deply-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","AWS-Deply-0.0.1-SNAPSHOT.war"]