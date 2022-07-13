package co.com.sofka.retoreactividadfuncional.ejercicio2;

import co.com.sofka.retoreactividadfuncional.data.DataEmail;
import co.com.sofka.retoreactividadfuncional.data.Palabras;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio2 {
    private final static Scanner scanner = new Scanner(System.in);
    public void filtroChat() {

        List<Integer> iterador = Arrays.asList(1,2,3);

        iterador.stream()
                .map(element -> {
                    System.out.println("Escriba su mensaje:");
                    String chatText = scanner.nextLine();
                    List<String> chat = Arrays.stream(chatText.split(" ")).toList();
                    return Flux.fromIterable(chat)
                            .map(mensaje -> {
                                if (Palabras.getPalabras().contains(mensaje.toLowerCase())) {
                                    mensaje = "****";
                                }
                                return mensaje;
                            })
                            .reduce("", (acum, mensaje) -> acum +=" "+mensaje)
                            .subscribe(p -> System.out.println(p.toString()));

                })
                .collect(Collectors.toList());
//                .forEach(System.out::println);


    }
}
