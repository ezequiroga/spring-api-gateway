#pull base image
FROM adoptopenjdk/openjdk11

EXPOSE 24501

#copy jar to docker image
ADD ./target/service1-0.0.1-SNAPSHOT.jar /data/service1-0.0.1-SNAPSHOT.jar

#default command
CMD java -jar -Derukaserver=${EUREKASERVER} /data/service1-0.0.1-SNAPSHOT.jar