package com.ldclrcq.vertx.guice.examples.launcher.business;

import com.google.inject.AbstractModule;

public class BusinessModule extends AbstractModule {
    @Override
    protected void configure() {
        this.bind(Dependency.class).to(DependencyImpl.class);
    }
}
