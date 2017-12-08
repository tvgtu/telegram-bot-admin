FROM openjdk:8u151-jdk-alpine
MAINTAINER Roman Gordeev <roma.gordeev@gmail.com>

RUN mkdir /usr/share/telegram-bot-admin
WORKDIR /usr/share/telegram-bot-admin/

ENV TELEGRAM_BOT_ADMIN_VERSION 0.0.1-SNAPSHOT

COPY build/libs/telegram-bot-admin-${TELEGRAM_BOT_ADMIN_VERSION}.jar /usr/share/telegram-bot-admin/telegram-bot-admin.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "telegram-bot-admin.jar"]
