package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //Objeto gerenciado pelo Spring Framework
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Usuário");
        user.setUsername("Apelido do Usuário");
        user.setPassword("senha123");

        repository.save(user);  //método crud

        for(User u: repository.findAll()){
            System.out.println(u);
        }

    }
}
