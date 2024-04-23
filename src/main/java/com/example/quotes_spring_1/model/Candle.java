package com.example.quotes_spring_1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.math3.util.Precision;

import java.util.Date;


@Data
@Entity
@Table(name = "candles")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candle {
    @Id
    @GeneratedValue
    private Long id;
    private String ticker;
    private String timing;
    private Double open;
    private Double close;
    private Double high;
    private Double low;
    private Double value;
    private Integer volume;
    private Date begin;
    private Date endd;
    @Transient
    private double body;
    public void setBody(){
        double abs = Math.abs(close-open); // вычисляем тело
        if (ticker.equals("VTBR")){this.body = Precision.round(abs, 4);} // округляем до 4 знаков после запятой для VTBR
        else this.body = Precision.round(abs, 2); // все остальные округляем до 2 знаков после запятой
    }
}
