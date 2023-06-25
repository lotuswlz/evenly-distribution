FROM adoptopenjdk/openjdk8:ubi
RUN mkdir /opt/app
COPY target/cathy-test.jar /opt/app
CMD ["java", "-Xms256m", "-Xmx512m","-jar", "/opt/app/cathy-test.jar"]