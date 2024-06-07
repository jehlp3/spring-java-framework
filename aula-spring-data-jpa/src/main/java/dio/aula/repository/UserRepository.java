package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository métodos de listagem, salvar usuários
//Não há mais preocupação de implementar os métodos pertinentes à persistência
public interface UserRepository extends JpaRepository<User, Integer> {

}
