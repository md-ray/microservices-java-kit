package com.raysoft.micro;

import com.raysoft.micro.resources.HaloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TrialMainApplication extends Application<TrialMainConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TrialMainApplication().run(args);
    }

    @Override
    public String getName() {
        return "TrialMain";
    }

    @Override
    public void initialize(final Bootstrap<TrialMainConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TrialMainConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HaloResource());
    }

}
