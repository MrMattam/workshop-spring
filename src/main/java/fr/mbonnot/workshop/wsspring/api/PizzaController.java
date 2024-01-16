package fr.mbonnot.workshop.wsspring.api;


import fr.mbo.workshops.solution.Menu;
import fr.mbo.workshops.solution.Pizza;
import fr.mbo.workshops.solution.Restaurant;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/v1")
public class PizzaController {

    private Restaurant restaurant;

    PizzaController(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @RequestMapping(value = "/pizzas", produces = "application/json", method = GET)
    public Menu getPizzas() {
        return this.restaurant.getMenu();
    }

    @RequestMapping(value = "/pizzas/add", produces = "application/json", method = POST)
    public Menu addPizza(@RequestBody Pizza pizza) {
        this.restaurant.getMenu().add(pizza);
        return this.restaurant.getMenu();
    }



}
