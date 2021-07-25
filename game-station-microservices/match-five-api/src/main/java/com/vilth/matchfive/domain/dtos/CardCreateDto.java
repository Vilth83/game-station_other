package com.vilth.matchfive.domain.dtos;

import com.vilth.matchfive.domain.entities.Symbol;

public class CardCreateDto {

    private String content;
    private Symbol symbol;

    protected CardCreateDto() {
        // empty no arg constructor for jackson
    }

    public CardCreateDto(String content, Symbol symbol) {
        this.content = content;
        this.symbol = symbol;
    }

    public String getContent() {
        return content;
    }

    public Symbol getSymbol() {
        return symbol;
    }

}
