package com.math012.padroes_projeto_spring.service.exchange;

import com.math012.padroes_projeto_spring.model.ExchangeRate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "exchangerate", url = "https://open.er-api.com/v6/latest")
public interface ExchangeRateService {
    @GetMapping("/{de}")
    ExchangeRate consultarCambio(@PathVariable("de")String de);
}


