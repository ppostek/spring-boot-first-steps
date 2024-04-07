package pl.edu.wszib.springbootfirststeps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 1. First example of Spring IoC - using @Component annotation
 */
@Component
@Service
@Repository
public class ComponentCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(ComponentCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello world from spring-boot");
    }

    public void example() {
        log.info("Example called");
    }
}
