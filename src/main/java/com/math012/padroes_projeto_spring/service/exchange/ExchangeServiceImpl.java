package com.math012.padroes_projeto_spring.service.exchange;

import com.math012.padroes_projeto_spring.exception.CambioException;
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
        try {
            ExchangeRate exchangeRate = exchangeRateService.consultarCambio(de);

            Map<String, Double> rates = exchangeRate.getRates().listaDeMoedasDisponiveis();
            return "A moeda " + de + " convertida para a moeda: " + para + ", tem o valor de: " + rates.get(para)+"\n"+"data: "+exchangeRate.getTimeLastUpdateUtc();
        }catch (Exception e){
            throw new CambioException("Selecione as moedas disponíveis: MXN, EUR, BRL, BOB, CLP, CNY, COP, UYU, VEF, ARS, USD");
        }
    }
}
