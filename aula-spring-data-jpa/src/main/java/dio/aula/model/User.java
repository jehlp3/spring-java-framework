package dio.aula.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_user")
public class User {
    //Mapeamento simples (não há relacionamento com outras entidades nesse momento)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id correspondente a cada inserção
    @Column (name = "user_id")
    private Integer id;
    @Column (length = 50, nullable = false)  //Definição dos campos
    private String name;
    @Column (length = 20, nullable = false)
    private String username;
    @Column (length = 100, nullable = false)
    private String password;

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
