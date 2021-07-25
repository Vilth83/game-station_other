package com.vilth.matchfive.domain.entities;

import com.vilth.matchfive.domain.dtos.CardCreateDto;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('SQUARE', 'CIRCLE', 'TRIANGLE', 'HEXAGON', 'STAR')")
    private Symbol symbol;

    @Column(nullable = false, unique = true, length = 40)
    private String content;

    protected Card() {
        // empty protected constructor
    }

    private Card(Symbol symbol, String content) {
        this.symbol = symbol;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getContent() {
        return content;
    }

    public static Card of(CardCreateDto cardDto) {
        return new Card(cardDto.getSymbol(), cardDto.getContent());
    }
}
