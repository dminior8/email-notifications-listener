# Email Notifications Listener

Spring Boot application that listens to the ```emailQueue``` on RabbitMQ and processes messages for email notifications.

## Technologies Used
- Java 21 (JDK 21)
- Maven 3.8.x or higher
- Docker

### Clone the repository
```bash
git clone git@github.com:dminior8/email-notifications-listener.git
```
```bash
cd email-notifications-listener
```

### Build and Run with Docker
To build and run the project using Docker, follow these steps:

```bash
docker build -t email-notifications-listener .
docker run -p 8081:8080 email-notifications-listener
```
The service will be accessible at http://localhost:8081.

## Related

To correctly run the entire system, make sure you also have the main repository running, which can be found here: [Notifications Service](https://github.com/dminior8/notifications-service).

Make sure both services are up and running to ensure correct message consumption from RabbitMQ.