package modelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude={SecurityAutoConfiguration.class})
public class Ciclo3Application {

    @GetMapping("/hello")
    public String hello(){
        return "Hola ciclo 3..... Saldremos vivos de esto!";
    }
    @GetMapping("/test")
    public String test(){
        Empresa emp = new Empresa("AYJAC.3", "Calle nueva", "333562563","89562231");
        emp.setNombre("A&JAC.3");
        return emp.getNombre();
    }

    public static void main(String[] args) {
        SpringApplication.run(Ciclo3Application.class, args);
    }

}
