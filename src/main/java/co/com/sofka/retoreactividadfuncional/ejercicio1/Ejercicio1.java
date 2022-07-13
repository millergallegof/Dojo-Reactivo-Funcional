package co.com.sofka.retoreactividadfuncional.ejercicio1;

import co.com.sofka.retoreactividadfuncional.data.DataEmail;
import co.com.sofka.retoreactividadfuncional.model.Email;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {


    public List<Email> eliminarRepetidos(List<Email> listEmail) {


        return listEmail.stream()
                .distinct()
                .collect(Collectors.toList());

    }

    public

}
