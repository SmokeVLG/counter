package ru.gismu.counter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
@Setter
@Slf4j
public class ScheduledTasks {
    public static int i = 0;

    @Scheduled(fixedRate = 1000)
    public void doInc() {
        i++;
        log.debug("i={}", i);
    }
}