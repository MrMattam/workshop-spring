package fr.mbo.workshop.spring.discovery.api;

import fr.mbo.workshop.core.Menu;
import fr.mbo.workshop.core.Pizza;
import fr.mbo.workshop.core.Restaurant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/v1")
public class PizzaController {

    private static Logger LOGGER = LoggerFactory.getLogger(PizzaController.class);

    private Restaurant restaurant;

    PizzaController(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @RequestMapping(value = "/pizzas", produces = "application/json", method = GET)
    public Menu getPizzas() {
        LOGGER.info("On demande le menu ?");
        return this.restaurant.getMenu();
    }

    @RequestMapping(value = "/pizzas/add", produces = "application/json", method = POST)
    public Menu addPizza(@RequestBody Pizza pizza) {
        LOGGER.info("On ajoute la pizza : {} ", pizza);
        this.restaurant.getMenu().add(pizza);
        return this.restaurant.getMenu();
    }

    @RequestMapping(value = "/pizzas/delete", produces = "application/json", method = DELETE)
    public Menu removePizza(String name) {
        this.restaurant.getMenu()
                .getPizzas()
                .stream()
                // TODO. finish this!
                .filter(pizza -> pizza.getName().equals(name));
        return this.restaurant.getMenu();
    }


}
