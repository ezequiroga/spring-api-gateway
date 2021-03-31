#pull base image
FROM adoptopenjdk/openjdk11

#maintainer 
MAINTAINER angel.quiroga@hospitalitaliano.org.ar

EXPOSE 24500

#copy jar to docker image
ADD ./target/servicesgateway-0.0.1-SNAPSHOT.jar /data/servicesgateway-0.0.1-SNAPSHOT.jar

#default command
CMD java -jar -Derukaserver=${EUREKASERVER} /data/servicesgateway-0.0.1-SNAPSHOT.jar