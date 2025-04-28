Notification Webservice
=======================

__Notification Webservice__ is a full-fledged Spring Boot application that lets us set up, with minimal effort, a
webservice that sends real-time notifications to various client. It, currently, supports the notifications to

- DingTalk (阿里钉钉)

Documentation
-------------

```console
 git clone git@github.com:QubitPi/notification-ws.git
 cd notification-ws
 mvn clean package
 java -jar target/notification-ws-0.0.1-SNAPSHOT.jar
 ```

- Healthcheck: http://localhost:8080/actuator/health

Development
-----------

Running tests:

```console
mvn clean verify
```
