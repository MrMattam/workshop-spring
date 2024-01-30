package fr.mbo.workshop.core;

public class Pizza {

    private String name;
    private Float price;

    public Pizza(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }


}
