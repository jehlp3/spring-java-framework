package me.dio.java_api_cloud.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id //Este será o identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Gerado automaticamente
    private Long id;

    @Column( unique = true) //Haverá apenas uma conta + nome específico para fugir de palavras reservadas em bd
    private String number;

    private String agency;

    //xxxxxxxxxxxxx,xx
    @Column(precision = 13, scale = 2 ) //Scale decimal de precisão
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2 )
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
