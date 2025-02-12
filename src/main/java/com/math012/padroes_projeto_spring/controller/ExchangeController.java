package com.math012.padroes_projeto_spring.controller;


import com.math012.padroes_projeto_spring.service.exchange.ExchangeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conversor")
public class ExchangeController {

    @Autowired
    private ExchangeServiceImpl exchangeService;

    @GetMapping("/moedas/{de}/{para}")
    public ResponseEntity<String> conversorDeMoedas(@PathVariable("de")String de, @PathVariable("para")String para){
        return ResponseEntity.ok(exchangeService.consultarCambio(de,para));
    }
}
