package dio.my_first_web_api.controller;

import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    //Erro comum, dois GetMApping, Spring não distingue
    @GetMapping("/users")
    public List<Usuario> getUser(){
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(Usuario usuario){
        repository.save(usuario);
    }
}
