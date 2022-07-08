package com.grenader.shedLockdemo;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "2m")
public class ShedLockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedLockDemoApplication.class, args);
	}

}
