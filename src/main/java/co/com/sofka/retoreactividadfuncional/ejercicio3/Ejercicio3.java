package co.com.sofka.retoreactividadfuncional.ejercicio3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio3 {

    public String derivar(Double coeficiente, Double exponente) {
        BiFunction<Double, Double, Double> coeficienteResult = (coef, expo) -> coef * expo;
        Function<Double, Double> exponenteResult = (expo) -> expo - 1;

        return "la derivada de: " + coeficiente +"x^" + exponente +" es de: " + coeficienteResult.apply(coeficiente, exponente) +"x^" + exponenteResult.apply(exponente);
    }
//
    public String integrar(Double coeficiente, Double exponente) {
        BiFunction<Double, Double, Double> coeficienteResult = (coef, expo) -> {
            if (coef / (expo + 1) == 1) {
                return 1.0;
            } else {
                return coef / (expo + 1);
            }
        } ;
        Function<Double, Double> exponenteResult = (expo) -> expo + 1;

        return "la integral de: ∫" + coeficiente +"x^" + exponente +"dx es de: " + coeficienteResult.apply(coeficiente, exponente) +"x^" + exponenteResult.apply(exponente) +"+ C";
    }



}
