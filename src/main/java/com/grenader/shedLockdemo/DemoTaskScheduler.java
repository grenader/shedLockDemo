package com.grenader.shedLockdemo;


import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@Component
@Slf4j
public class DemoTaskScheduler {

    @Scheduled(cron = "0 0/1 * * * ?")
    @SchedulerLock(name = "TaskScheduler_scheduledTask",
            lockAtLeastFor = "2m",
            lockAtMostFor = "2m")
    public void scheduledTask() throws UnknownHostException {
        executeWork();
        log.info("Running ShedLock task. Instance: {}, Time: {}",
                InetAddress.getLocalHost().getHostName(),
                LocalDateTime.now());

    }

    private void executeWork() {
        try {
            log.info("Work executions has started. Instance: {}", InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        // Sleep for 30 seconds
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
