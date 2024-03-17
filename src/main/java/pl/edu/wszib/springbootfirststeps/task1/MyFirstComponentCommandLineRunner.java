package pl.edu.wszib.springbootfirststeps.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponentCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(MyFirstComponentCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("My first run");
    }

    public void example() {
        log.info("example");
    }
}
