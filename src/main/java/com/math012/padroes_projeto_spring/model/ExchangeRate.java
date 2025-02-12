package com.math012.padroes_projeto_spring.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRate {
    private String provider;
    @JsonProperty("time_last_update_utc")
    private String timeLastUpdateUtc;
    private Rates rates;

    public ExchangeRate(String provider, String timeLastUpdateUtc, Rates rates) {
        this.provider = provider;
        this.timeLastUpdateUtc = timeLastUpdateUtc;
        this.rates = rates;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }


    public String getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
        this.timeLastUpdateUtc = timeLastUpdateUtc;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
