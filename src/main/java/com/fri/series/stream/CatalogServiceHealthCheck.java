package com.fri.series.stream;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@Health
@ApplicationScoped
public class CatalogServiceHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {

        if (true) {
            return HealthCheckResponse.named(CatalogServiceHealthCheck.class.getSimpleName()).up().build();
        } else {
            return HealthCheckResponse.named(CatalogServiceHealthCheck.class.getSimpleName()).down().build();
        }

    }

}
