package io.jaams.configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.dropwizard.Configuration;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JaaMsConfiguration extends Configuration {
}
