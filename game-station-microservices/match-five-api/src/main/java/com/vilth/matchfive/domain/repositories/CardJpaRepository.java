package com.vilth.matchfive.domain.repositories;

import com.vilth.matchfive.domain.entities.Card;
import com.vilth.matchfive.domain.entities.Symbol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardJpaRepository extends JpaRepository<Card, Long> {

    List<Card> findBySymbol(Symbol symbol);

}
