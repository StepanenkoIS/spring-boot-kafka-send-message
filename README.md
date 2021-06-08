# spring-boot-kafka-send-message

Тестовое приложение для отправки сообщений в Kafka


1. Запустить докер контейнер

$ docker run --rm --net=host lensesio/fast-data-dev

(подборонее см. https://github.com/lensesio/fast-data-dev/blob/fdd/main/README.md )

2. Проверить Kafka, перейдя в браузере по следующему адресу

http://localhost:3030

3. Выполнить запуск приложения:

3.1. Перейти в каталог приложения и выполнить сборку проекта

$ mvn clean package

По завершению сборки выполнить запуск приложения

$ java -jar target/spring-boot-kafka-send-message-0.0.1-SNAPSHOT.jar

3.2. Запуск приложения Spring Boot можно выполнить с использованием плагина Maven

$ mvn spring-boot:run

4. Отправка сообщений в Kafka

Ожидаемые параметры
String message;
Integer age;

http://localhost:8090/setmsg?message=${MessageText}&age=${1}

5. Чтение сообщений из Kafka

http://localhost:8090/getmsg
