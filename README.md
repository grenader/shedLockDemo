# Demo Project to see ShedLock for Spring in action.

## Using the documentation:
https://github.com/lukas-krecan/ShedLock

## Following this article: 
https://www.baeldung.com/shedlock-spring

## Create a database table to store locks:

```CREATE TABLE shedlock (
name VARCHAR(64),
lock_until TIMESTAMP(3) NULL,
locked_at TIMESTAMP(3) NULL,
locked_by VARCHAR(255),
PRIMARY KEY (name)
)
```

## Build docker image:



