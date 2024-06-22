package me.dio.java_api_cloud.domain.repository;

import me.dio.java_api_cloud.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface da entidade principal
//Repositório usando todas as operações do JPA - Save, delete, find...
//@Repository  como ele já está estendendo, não é necessário
public interface UserRepository extends JpaRepository<User, Long> {  //Parâmetros = entidade e o identificador

    //Verifica se dentro do usuário, olhando o acount e o number, se já existe e lança a exceção.
    boolean existsByAccountNumber(String accountNumber);

    boolean existsByCardNumber(String number);
}
