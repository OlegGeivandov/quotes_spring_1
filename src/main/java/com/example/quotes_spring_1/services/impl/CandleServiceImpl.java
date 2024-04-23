package com.example.quotes_spring_1.services.impl;

import com.example.quotes_spring_1.model.Candle;
import com.example.quotes_spring_1.repositoryes.CandleRepository;
import com.example.quotes_spring_1.services.CandleService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@Primary // для предпочтительного внедрения
public class CandleServiceImpl implements CandleService {

    private final CandleRepository candleRepository;
    @Override
    public List<Candle> findAllCandle() {
        return candleRepository.findAll();
    }

    @Override
    public Candle saveCandle(Candle candle) {
        return candleRepository.save(candle);
    }

    @Override
    public Candle findByTickerTimingDate(String ticker, String timing, Date date) {
        return candleRepository.findByTickerTimingDate(ticker, timing, date);
    }

    @Override
    public Candle updateCandle(Candle candle) {
        return candleRepository.save(candle);
    }

    @Override
    public void deleteCandle(Long id) {
        candleRepository.deleteById(id);
    }
}
