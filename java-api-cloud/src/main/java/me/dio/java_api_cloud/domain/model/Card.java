package me.dio.java_api_cloud.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id //Este será o identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Gerado automaticamente
    private Long id;

    @Column(unique = true) //Serão números únicos, não se repetirão
    private String number;

    @Column(name = "available_limit", precision = 13, scale = 2 )
    private BigDecimal limit;

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
