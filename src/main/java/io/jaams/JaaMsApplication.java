package io.jaams;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.jaams.configuration.JaaMsConfiguration;
import io.jaams.resources.JobResource;

public class JaaMsApplication extends Application<JaaMsConfiguration> {

    @Override
    public String getName() {
        return "jaams";
    }

    @Override
    public void initialize(Bootstrap<JaaMsConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(JaaMsConfiguration configuration, Environment environment) {
        final JobResource jobResource = new JobResource();

        environment.jersey().register(jobResource);
    }

    public static void main(String[] args) throws Exception {
        new JaaMsApplication().run(args);
    }
}
