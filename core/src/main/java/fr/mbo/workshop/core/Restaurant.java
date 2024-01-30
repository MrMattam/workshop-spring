package fr.mbo.workshop.core;

public class Restaurant {

    private Menu menu;

    public Restaurant(Menu menu){
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }
}
