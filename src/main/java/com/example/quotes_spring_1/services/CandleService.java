package com.example.quotes_spring_1.services;

import com.example.quotes_spring_1.model.Candle;

import java.util.Date;
import java.util.List;

public interface CandleService {

    List<Candle> findAllCandle();
    Candle saveCandle(Candle candle);
    Candle findByTickerTimingDate(String ticker, String timing, Date date);
    Candle updateCandle(Candle candle);
    void deleteCandle(Long id);

}
