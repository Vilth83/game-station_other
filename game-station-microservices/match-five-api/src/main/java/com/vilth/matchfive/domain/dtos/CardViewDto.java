package com.vilth.matchfive.domain.dtos;

import com.vilth.matchfive.domain.entities.Card;
import com.vilth.matchfive.domain.entities.Symbol;

public class CardViewDto {

    private Symbol symbol;
    private String content;

    protected CardViewDto() {
        // empty no arg constructor for jackson
    }

    public CardViewDto(Symbol symbol, String content) {
        super();
        this.symbol = symbol;
        this.content = content;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getContent() {
        return content;
    }

    public static CardViewDto of(Card card) {
        return new CardViewDto(card.getSymbol(), card.getContent());
    }
}
