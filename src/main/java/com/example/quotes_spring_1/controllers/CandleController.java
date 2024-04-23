package com.example.quotes_spring_1.controllers;

import com.example.quotes_spring_1.model.Candle;
import com.example.quotes_spring_1.services.CandleService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
@Builder
public class CandleController {

    private final CandleService candleService;

    @Autowired
    Candle candle = Candle.builder().ticker("SBRF").timing("24").open(200.2).close(250.3).high(300.4).low(180.5).value(156478.2).volume(2465).begin("11.01.2010  23:59:59").endd("11.01.2010  23:59:59").build();
}
