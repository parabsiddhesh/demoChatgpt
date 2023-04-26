FROM openjdk:8
ADD ./target/demot-0.0.1-SNAPSHOT.jar demot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demot-0.0.1-SNAPSHOT.jar"]
