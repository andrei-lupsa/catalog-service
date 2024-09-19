package com.polarbookshop.catalogservice.testcontainers;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

import java.time.Duration;

public interface TestContainers {

    @Container
    @ServiceConnection
    PostgreSQLContainer<?> postgreSQLContainer =
            new PostgreSQLContainer<>("postgres:16.4")
                    .withDatabaseName("polardb_catalog")
                    .withUsername("user")
                    .withPassword("password")
                    .withMinimumRunningDuration(Duration.ofSeconds(5));

}
