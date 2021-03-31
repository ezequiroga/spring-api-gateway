#pull base image
FROM adoptopenjdk/openjdk11

#maintainer 
MAINTAINER angel.quiroga@hospitalitaliano.org.ar

EXPOSE 24499

#copy jar to docker image
ADD ./target/eureka-0.0.1-SNAPSHOT.jar /data/eureka-0.0.1-SNAPSHOT.jar

#default command
CMD java -jar -Derukaserver=${EUREKASERVER} /data/eureka-0.0.1-SNAPSHOT.jar