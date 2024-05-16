 # renovate: datasource=github-releases depName=microsoft/ApplicationInsights-Java
ARG APP_INSIGHTS_AGENT_VERSION=3.5.1

FROM hmctspublic.azurecr.io/base/java:21-distroless
USER hmcts

COPY lib/applicationinsights.json /opt/app/
COPY build/libs/st-cron-trigger.jar /opt/app/

EXPOSE 8080
CMD [ "st-cron-trigger.jar" ]
