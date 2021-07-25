package com.vilth.matchfive.api.services;

import com.vilth.matchfive.domain.dtos.CardCreateDto;
import com.vilth.matchfive.domain.dtos.CardViewDto;
import com.vilth.matchfive.domain.dtos.IdViewDto;
import com.vilth.matchfive.domain.entities.Symbol;

import java.util.List;

public interface CardService {
    IdViewDto save(CardCreateDto card);

    List<CardViewDto> findAll();

    CardViewDto findRandomCardBySymbol(Symbol symbol);

}
