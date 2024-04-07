package pl.edu.wszib.springbootfirststeps.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mytask")
public record MyTaskConfigurationProperties(String prefix, String suffix) {

}
