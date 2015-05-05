# gradle-docker-poc

## what is this?
POC for demonstrating gradle's docker plugin capabilities.

## what does it do?
Takes a simple Spring Boot app and:
* builds it into a jar
* create a docker image file (Dockerfile) and includes the jarified app
* builds the docker image
* fires up the docker container

## things needed to be taken into account when building/running the project

* The SSL cert of the docker host is selfsigned (created by boot2docker during installation), thus it needs to manually be added to Java's cacerts keystore.
`sudo keytool import -alias $DOCKER_HOST -file $DOCKER_CERT -keystore $JAVA_HOME/jre/lib/security/cacerts`
