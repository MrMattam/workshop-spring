package fr.mbonnot.workshop.wsspring.config;

import fr.mbo.workshops.solution.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    Restaurant restaurant() {
        return new Restaurant();
    }
}
