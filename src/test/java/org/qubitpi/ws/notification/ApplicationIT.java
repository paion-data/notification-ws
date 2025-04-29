// Copyright 2025 Paion Data. All rights reserved.
package org.qubitpi.ws.notification;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

/**
 * The entity webservice integration tests.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationIT {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * Make sure the context is creating controller.
     */
    @Test
    void contextLoads() {
    }

    /**
     * Make sure actuator is working properly.
     */
    @Test
    void testHealthcheck() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + this.port + "/actuator/health", String.class))
                .isEqualTo("{\"status\":\"UP\"}");
    }
}
