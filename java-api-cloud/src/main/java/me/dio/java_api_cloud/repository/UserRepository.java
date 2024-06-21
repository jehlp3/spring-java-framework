package me.dio.java_api_cloud.repository;

import me.dio.java_api_cloud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interface da entidade principal
//Repositório usando todas as operações do JPA - Save, delete, find...
//@Repository  como ele já está estendendo, não é necessário
public interface UserRepository extends JpaRepository<User, Long> {  //Parâmetros = entidade e o identificador

}
