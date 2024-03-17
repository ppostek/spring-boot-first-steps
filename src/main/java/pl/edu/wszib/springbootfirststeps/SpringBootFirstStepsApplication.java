package pl.edu.wszib.springbootfirststeps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.edu.wszib.springbootfirststeps.configuration.ConfiguredCommandLineRunner;
import pl.edu.wszib.springbootfirststeps.examplescanned.DiscoveredCommandLineRunner;

@SpringBootApplication
public class SpringBootFirstStepsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstStepsApplication.class, args);
    }

}
