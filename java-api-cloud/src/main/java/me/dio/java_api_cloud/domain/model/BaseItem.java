package me.dio.java_api_cloud.domain.model;


import jakarta.persistence.*;

@MappedSuperclass  //News e Features estenderão
public class BaseItem {
    //Atenderão as News e as Features = Herança "DRY"

    @Id //Este será o identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Gerado automaticamente
    private Long id;

    private String icon;

    private String description;

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
