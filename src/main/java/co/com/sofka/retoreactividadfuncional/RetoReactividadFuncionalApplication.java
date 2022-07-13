package co.com.sofka.retoreactividadfuncional;

import co.com.sofka.retoreactividadfuncional.data.DataEmail;
import co.com.sofka.retoreactividadfuncional.ejercicio1.Ejercicio1;
import co.com.sofka.retoreactividadfuncional.model.Email;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RetoReactividadFuncionalApplication implements CommandLineRunner {

    private final List<Email> listEmail = DataEmail.getEmails();

    public static void main(String[] args) {
        SpringApplication.run(RetoReactividadFuncionalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ejercicio1 ejercicio1 = new Ejercicio1();
//        ejercicio1.eliminarRepetidos(listEmail).forEach(System.out::println);
//        ejercicio1.filtrarPorDomino(listEmail).forEach(System.out::println);
//        ejercicio1.validacionEmail(listEmail).forEach(System.out::println);
        System.out.println("el numero de correos validos es: "+ejercicio1.contarEmails(listEmail));
    }
}
