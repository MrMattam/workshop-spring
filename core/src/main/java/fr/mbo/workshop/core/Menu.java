package fr.mbo.workshop.core;

import java.util.ArrayList;
import java.util.List;

public class Menu{

    private final List<Pizza> pizzas = new ArrayList<>();

    public void add(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
