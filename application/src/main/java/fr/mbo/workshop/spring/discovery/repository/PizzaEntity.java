package fr.mbo.workshop.spring.discovery.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "pizza")
public class PizzaEntity {

    @Id
    private UUID id = UUID.randomUUID();
    private String name;

    public PizzaEntity(String name) {
        this.name = name;
    }

    public PizzaEntity() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
