package pl.edu.wszib.springbootfirststeps.configurationproperties;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "myapplication.tasks")
public record TaskConfigurationProperties(Boolean enabled, String name) {

}
