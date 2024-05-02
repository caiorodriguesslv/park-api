package com.caiorodrigues.demoparkapi.config;


import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {

    @PostConstruct //Após a classe ser inicializada, o método construtor também.
    public void timeZoneConfig() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

}
