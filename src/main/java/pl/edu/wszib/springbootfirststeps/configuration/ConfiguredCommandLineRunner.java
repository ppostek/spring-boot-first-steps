package pl.edu.wszib.springbootfirststeps.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import pl.edu.wszib.springbootfirststeps.examplescanned.DiscoveredCommandLineRunner;

/**
 * 2. Second example of Spring IoC - using @Configuration and @Bean annotation
 */
public class ConfiguredCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(ConfiguredCommandLineRunner.class);
    private final DiscoveredCommandLineRunner discoveredCommandLineRunner;

    public ConfiguredCommandLineRunner(DiscoveredCommandLineRunner discoveredCommandLineRunner) {

        this.discoveredCommandLineRunner = discoveredCommandLineRunner;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello from configured.");
    }
}
