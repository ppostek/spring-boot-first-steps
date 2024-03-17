package pl.edu.wszib.examplenotscanned;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotDiscoveredCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(NotDiscoveredCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        log.warn("Should not be triggered.");
    }
}
