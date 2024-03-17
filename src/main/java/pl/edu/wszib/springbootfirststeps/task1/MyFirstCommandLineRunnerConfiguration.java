package pl.edu.wszib.springbootfirststeps.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFirstCommandLineRunnerConfiguration {

    // First solution - by parameter
    @Bean
    MyFirstConfiguredCommandLineRunner myFirstConfiguredCommandLineRunner(MyFirstComponentCommandLineRunner myFirstComponentCommandLineRunner) {
        return new MyFirstConfiguredCommandLineRunner(myFirstComponentCommandLineRunner);
    }

    // second solution - by configuration constructor
//    private final MyFirstComponentCommandLineRunner myFirstComponentCommandLineRunner;
//
//    public MyFirstCommandLineRunnerConfiguration(MyFirstComponentCommandLineRunner myFirstComponentCommandLineRunner) {
//        this.myFirstComponentCommandLineRunner = myFirstComponentCommandLineRunner;
//    }
//
//    @Bean
//    MyFirstConfiguredCommandLineRunner myFirstConfiguredCommandLineRunner() {
//        return new MyFirstConfiguredCommandLineRunner(myFirstComponentCommandLineRunner);
//    }
}
