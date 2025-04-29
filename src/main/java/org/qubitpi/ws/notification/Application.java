// Copyright 2025 Paion Data. All rights reserved.
package org.qubitpi.ws.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main JAR for running the entity WS.
 */
@SpringBootApplication
public class Application {

    /**
     * Entry point.
     *
     * @param args  Not used
     */
    @SuppressWarnings("UncommentedMain")
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
