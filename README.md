## How to run

### Run database container

```
docker run --rm -it --env POSTGRES_USER=telebot --env POSTGRES_PASSWORD=123456 -p 5433:5432 postgres
```

### Run application

```
./gradlew build
java -jar build/libs/telegram-bot-admin-0.0.1-SNAPSHOT.jar
```

Open in browser 

```
http://localhost:8090/messages
```
