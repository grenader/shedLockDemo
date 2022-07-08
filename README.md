# Demo Project to see ShedLock for Spring in action.

## The documentation used:
https://github.com/lukas-krecan/ShedLock

## The article to follow: 
https://www.baeldung.com/shedlock-spring

# How to run

## Create a database table to store locks:

```
CREATE TABLE shedlock (
        name VARCHAR(64),
        lock_until TIMESTAMP(3) NULL,
        locked_at TIMESTAMP(3) NULL,
        locked_by VARCHAR(255),
        PRIMARY KEY (name)
        )
```

## Run the application
SERVER_PORT environment variable should be specified. 
This is to be able to run several instance of the application on a one host.

## Optional. Build docker image:
```
mvn spring-boot:build-image
```




