package com.raysoft.micro;

import com.raysoft.micro.resources.HaloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class KitMainApplication extends Application<KitMainConfiguration> {

    public static void main(final String[] args) throws Exception {
        new KitMainApplication().run(args);
    }

    @Override
    public String getName() {
        return "KitMainApplication";
    }

    @Override
    public void initialize(final Bootstrap<KitMainConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final KitMainConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HaloResource());
    }

}
