package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    //Quando o container subir essa classe será executada. Semelhante ao método main

    @Autowired
    private Calculadora calculadora; //Não existe mais o new Calculadora() no main.

   //Implementa o método run solicitado
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: "+ calculadora.somar(2,7));
    }


}
