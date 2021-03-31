# Eureka + Cloud Gateway

Simple project that implements Eureka for service discovery and Api Gateway.

## Structure

The project contains 4 services:

- eureka: Spring Boot project for Eureka Server
- gateway: Spring Boot project for api gateway
- service1: microservice with just a Greeting controller
- service2: microservice with just a Greeting controller

## Running

For running all services from command line use `docker-compose up --build -d`

## Key Point
The most important point is the **application.yml** file in the *gateway* service.
