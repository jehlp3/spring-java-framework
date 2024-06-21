package me.dio.java_api_cloud.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user") //nome da tabela
public class User {

    @Id //Este será o identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Gerado automaticamente
    private Long id;

    @Column(length = 100)  //Especificando um tamanho
    private String name;

    @OneToOne(cascade = CascadeType.ALL) //Relacionamento
    private Account account;

    @OneToOne(cascade = CascadeType.ALL) //Relacionamento
    private Card card;

    //Um usuário tem muitas Features
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)  //Fetch EAGER traz todas as Features do usuário
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
