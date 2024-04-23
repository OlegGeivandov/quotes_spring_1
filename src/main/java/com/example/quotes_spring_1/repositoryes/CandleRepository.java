package com.example.quotes_spring_1.repositoryes;


import com.example.quotes_spring_1.model.Candle;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public interface CandleRepository extends JpaRepository<Candle, Long> {

    Candle findByTickerTimingDate(String ticker, String timing, Date date);



}
