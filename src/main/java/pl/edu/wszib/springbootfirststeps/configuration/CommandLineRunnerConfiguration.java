package pl.edu.wszib.springbootfirststeps.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springbootfirststeps.examplescanned.DiscoveredCommandLineRunner;

@Configuration
public class CommandLineRunnerConfiguration {

    @Bean
    ConfiguredCommandLineRunner configuredCommandLineRunner(final DiscoveredCommandLineRunner discoveredCommandLineRunner) {
        return new ConfiguredCommandLineRunner(discoveredCommandLineRunner);
    }
}
