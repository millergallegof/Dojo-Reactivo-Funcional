package co.com.sofka.retoreactividadfuncional.ejercicio1;

import co.com.sofka.retoreactividadfuncional.data.DataEmail;
import co.com.sofka.retoreactividadfuncional.model.Email;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio1 {


    public List<Email> eliminarRepetidos(List<Email> listEmail) {


        return listEmail.stream()
                .distinct()
                .collect(Collectors.toList());

    }

    public List<Email> filtrarPorDomino(List<Email> listEmail) {
        return listEmail.stream()
                .filter(email ->
                {
                    return email.getEmail().toLowerCase().contains("@gmail.com") ||
                            email.getEmail().toLowerCase().contains("@hotmail.com") ||
                            email.getEmail().toLowerCase().contains("@outlook.com");
                })
                .collect(Collectors.toList());
    }

    public List<Email> validacionEmail(List<Email> listEmail) {
        return listEmail.stream()
//                .filter(email -> email.getEmail().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .map(email -> {
                    if (email.getEmail().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
                        return email;
                    }
//                    if (email.getEmail().contains("hotmail.com")) {
//                        return email;
//                    }
//                    if (email.getEmail().contains("outlook.com")) {
//                        return email;
//                    }
                    return null;
                })
                .collect(Collectors.toList());
    }

    public Long contarEmails(List<Email> listEmail) {
        return listEmail.stream()
                .filter(email -> email.getEmail().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .count();
    }

    public Map<String, Long> listarEmailDominio(List<Email> listEmail) {


        return listEmail.stream()
    }

}
