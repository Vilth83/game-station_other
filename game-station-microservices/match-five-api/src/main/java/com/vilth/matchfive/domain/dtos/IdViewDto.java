package com.vilth.matchfive.domain.dtos;

import com.vilth.matchfive.domain.entities.Card;

public class IdViewDto {

    private Long id;

    protected IdViewDto() {
        // Empty protected constructor
    }

    private IdViewDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public static IdViewDto of(Card card) {
        return new IdViewDto(card.getId());
    }
}
