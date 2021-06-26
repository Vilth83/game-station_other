package com.vilth.matchfive.api.services;

import com.vilth.matchfive.domain.dtos.CardCreateDto;
import com.vilth.matchfive.domain.dtos.CardViewDto;
import com.vilth.matchfive.domain.dtos.IdViewDto;
import com.vilth.matchfive.domain.entities.Card;
import com.vilth.matchfive.domain.entities.Symbol;
import com.vilth.matchfive.domain.repositories.CardJpaRepository;
import com.vilth.matchfive.domain.utils.RandomUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CardServiceImpl implements CardService {

    private final CardJpaRepository repository;

    public CardServiceImpl(CardJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public IdViewDto save(CardCreateDto cardDto) {
        Card card = Card.of(cardDto);
        return IdViewDto.of(repository.save(card));
    }

    @Override
    public List<CardViewDto> findAll() {
        List<Card> cards = repository.findAll();
        return mapCardsToDto(cards);
    }

    @Override
    public CardViewDto findRandomCardBySymbol(Symbol symbol) {
        List<CardViewDto> cards = findBySymbol(symbol);
        return cards.get(RandomUtil.randomId(cards));
    }

    private List<CardViewDto> findBySymbol(Symbol symbol) {
        List<Card> cards = repository.findBySymbol(symbol);
        return mapCardsToDto(cards);
    }

    private List<CardViewDto> mapCardsToDto(List<Card> cards) {
        return cards.stream().map(CardViewDto::of).collect(Collectors.toList());

    }
}
