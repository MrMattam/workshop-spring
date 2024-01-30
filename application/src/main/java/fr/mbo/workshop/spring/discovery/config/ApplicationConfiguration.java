package fr.mbo.workshop.spring.discovery.config;


import fr.mbo.workshop.core.Menu;
import fr.mbo.workshop.core.Pizza;
import fr.mbo.workshop.core.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    Menu menu(){
        var menu = new Menu();
        menu.add(new Pizza("Margherita", 11.0f));
        menu.add(new Pizza("Savoyarde", 15.0f));
        return menu;
    }

    @Bean
    Restaurant restaurant() {
        return new Restaurant(menu());
    }
}
