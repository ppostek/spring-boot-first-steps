package pl.edu.wszib.springbootfirststeps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.edu.wszib.springbootfirststeps.configuration.ConfiguredCommandLineRunner;
import pl.edu.wszib.springbootfirststeps.configurationproperties.TaskConfigurationProperties;
import pl.edu.wszib.springbootfirststeps.examplescanned.DiscoveredCommandLineRunner;

@SpringBootApplication
@EnableConfigurationProperties(TaskConfigurationProperties.class)
public class SpringBootFirstStepsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstStepsApplication.class, args);
    }

    /**
     * Utwórz nowy pakiet o nazwie "task1", umieść w nim klasy o następującej strukturze:
     * MyFirstComponentCommandLineRunner (klasa implementuje interfejs CommandLineRunner i loguje do konsoli "My first run")
     * MyFirstConfiguredCommandLineRunner, klasa posiada zależność wstrzykiwaną przez konstruktor do klasy MyFirstComponentCommandLineRunner
     * i loguje do konsoli "My first configured run" oraz wywołuje metodę "example" w klasie MyFirstComponentCommandLineRunner
     * MyFirstCommandLineRunnerConfiguration - klasa konfiguracyjna, tworząca instancję MyFirstConfiguredCommandLineRunner i przekazująca ją do kontenera Spring IoC (za pomocą adnotacji @Bean)
     */

}
