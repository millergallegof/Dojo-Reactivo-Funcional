package co.com.sofka.retoreactividadfuncional;

import co.com.sofka.retoreactividadfuncional.data.DataEmail;
import co.com.sofka.retoreactividadfuncional.ejercicio1.Ejercicio1;
import co.com.sofka.retoreactividadfuncional.ejercicio2.Ejercicio2;
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
//        -------------------------------------------------------------------------------------
//        EJERCICIO 1
//        -------------------------------------------------------------------------------------
        Ejercicio1 ejercicio1 = new Ejercicio1();
        //        PUNTO A
//        -------------------------------------------------------------------------------------
//        ejercicio1.eliminarRepetidos(listEmail).forEach(System.out::println);
        //        PUNTO B
//        -------------------------------------------------------------------------------------
//        ejercicio1.filtrarPorDomino(listEmail).forEach(System.out::println);
        //        PUNTO C
//        -------------------------------------------------------------------------------------
//        ejercicio1.validacionEmail(listEmail).forEach(System.out::println);
        //        PUNTO D
//        -------------------------------------------------------------------------------------
//        System.out.println("el numero de correos validos es: "+ejercicio1.contarEmails(listEmail));
        //        PUNTO D
//        -------------------------------------------------------------------------------------
//        System.out.println("el numero de correos gmail es: %s"+ ejercicio1.listarEmailDominio(listEmail).get("@gmail.com"));
//        System.out.println("el numero de correos hotmail es: "+ ejercicio1.listarEmailDominio(listEmail).get("@hotmail.com"));
//        System.out.println("el numero de correos outlook es: "+ ejercicio1.listarEmailDominio(listEmail).get("@outlook.com"));
        //        PUNTO F
//        -------------------------------------------------------------------------------------
//        ejercicio1.correoEnviado(listEmail).forEach(System.out::println);

        //        -------------------------------------------------------------------------------------
//        EJERCICIO 2
//        -------------------------------------------------------------------------------------
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.filtroChat();
    }
}
