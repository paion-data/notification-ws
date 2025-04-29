// Copyright 2025 Paion Data. All rights reserved.
package org.qubitpi.ws.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * Swagger UI metadata configuration.
 */
@Configuration
public class SwaggerConfig {

    /**
     * Configures the Swagger UI metadata.
     *
     * @return the complete configuration to be injected into the Spring context
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Notification Webservice")
                                .version("0.0.1")
                                .description("Notification Webservice REST API Interface")
                                .contact(
                                        new Contact()
                                                .name("Paion Data")
                                                .url("https://paion-data.com")
                                                .email("jiaqiliu@paion-data.dev")
                                )
                                .license(
                                        new License()
                                                .name("Apache License, Version 2.0")
                                                .url("https://www.apache.org/licenses/LICENSE-2.0")
                                )
                );
    }
}
