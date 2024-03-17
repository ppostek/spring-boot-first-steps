package pl.edu.wszib.springbootfirststeps.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class MyFirstConfiguredCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(MyFirstConfiguredCommandLineRunner.class);

    private final MyFirstComponentCommandLineRunner myFirstComponentCommandLineRunner;

    public MyFirstConfiguredCommandLineRunner(MyFirstComponentCommandLineRunner myFirstComponentCommandLineRunner) {
        this.myFirstComponentCommandLineRunner = myFirstComponentCommandLineRunner;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("My first configured run");
        myFirstComponentCommandLineRunner.example();
    }
}
