package com.vilth.matchfive.api.restcontrollers;

import com.vilth.matchfive.api.services.CardService;
import com.vilth.matchfive.domain.dtos.CardCreateDto;
import com.vilth.matchfive.domain.dtos.CardViewDto;
import com.vilth.matchfive.domain.dtos.IdViewDto;
import com.vilth.matchfive.domain.entities.Symbol;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cards")
public class CardController {

    private final CardService service;

    protected CardController(CardService service) {
        this.service = service;
    }

    @PostMapping
    protected IdViewDto save(@RequestBody CardCreateDto card) {
        return service.save(card);
    }

    @GetMapping
    protected List<CardViewDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{symbol}")
    protected CardViewDto findRandomCardBySymbol(@PathVariable Symbol symbol) {
        return service.findRandomCardBySymbol(symbol);
    }
}
