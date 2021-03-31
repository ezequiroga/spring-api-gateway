#pull base image
FROM adoptopenjdk/openjdk11

EXPOSE 24502

#copy jar to docker image
ADD ./target/service2-0.0.1-SNAPSHOT.jar /data/service2-0.0.1-SNAPSHOT.jar

#default command
CMD java -jar -Derukaserver=${EUREKASERVER} /data/service2-0.0.1-SNAPSHOT.jar