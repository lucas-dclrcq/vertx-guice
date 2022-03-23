package com.ldclrcq.vertx.guice.examples.serviceproxy.business;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.junit.jupiter.api.BeforeEach;

public class BusinessModule extends AbstractModule {
    @Override
    protected void configure() {
        this.bind(BusinessService.class).toProvider(BusinessServiceProvider.class).in(Singleton.class);
    }
}
