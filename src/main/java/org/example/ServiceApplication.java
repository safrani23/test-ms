package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.store.LogMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceApplication.class);
        log.info(LogMarker.SYSTEM_MARKER, "The service application has been started successfully.");
    }
}
