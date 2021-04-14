FROM openjdk

VOLUME /tmp
ARG RELEASE_VERSION
ADD maven/spring-boot-docker-${RELEASE_VERSION}.jar myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]
