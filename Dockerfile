FROM amazoncorretto:11
WORKDIR /app
ARG JAR_FILE=build/libs/batch-practice-0.0.1.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENV JOB_PARAMETERS='type=roses'
ENV JOB_NAME='prepareFlowersJob'
ENTRYPOINT exec java -jar -Dspring.batch.job.names="${JOB_NAME}" app.jar "${JOB_PARAMETERS}"