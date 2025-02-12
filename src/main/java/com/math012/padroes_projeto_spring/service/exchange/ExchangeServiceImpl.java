package com.math012.padroes_projeto_spring.service.exchange;

import com.math012.padroes_projeto_spring.model.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExchangeServiceImpl implements ExchangeService{

    @Autowired
    private ExchangeRateService exchangeRateService;

    @Override
    public String consultarCambio(String de, String para) {
        ExchangeRate exchangeRate = exchangeRateService.consultarCambio(de);
        Map<String, Double> rates = exchangeRate.getRates().listaDeMoedasDisponiveis();
        return "A moeda " + de + " convertida para a moeda: " + para + ", tem o valor de: " + rates.get(para)+"\n"+"data: "+exchangeRate.getTimeLastUpdateUtc();
    }
}
