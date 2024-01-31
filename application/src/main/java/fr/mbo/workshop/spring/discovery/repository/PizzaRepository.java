package fr.mbo.workshop.spring.discovery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<PizzaEntity, String> {
}
