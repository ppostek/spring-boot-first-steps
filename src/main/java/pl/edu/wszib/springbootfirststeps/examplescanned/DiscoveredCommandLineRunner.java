package pl.edu.wszib.springbootfirststeps.examplescanned;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.edu.wszib.springbootfirststeps.ComponentCommandLineRunner;

@Component
public class DiscoveredCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DiscoveredCommandLineRunner.class);

    private final ComponentCommandLineRunner componentCommandLineRunner;

    public DiscoveredCommandLineRunner(final ComponentCommandLineRunner componentCommandLineRunner) {
        this.componentCommandLineRunner = componentCommandLineRunner;
    }

    @Override
    public void run(String... args) throws Exception {
        log.warn("Should be triggered.");
        componentCommandLineRunner.example();
    }
}
