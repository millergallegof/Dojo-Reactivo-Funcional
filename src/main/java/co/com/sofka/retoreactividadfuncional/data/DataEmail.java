package co.com.sofka.retoreactividadfuncional.data;

import co.com.sofka.retoreactividadfuncional.model.Email;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataEmail {

    public static List<Email> getEmails() {
        List<Email> emails = Arrays.asList(
                new Email(1, "miller.gallegof@gmail.com", false) ,
                new Email(1, "miller.gallegof@gmail.com", false),
                new Email(3, "fabian25@outlook.com", false),
                new Email(4, "reinacariñosa@gmail.com", true),
                new Email(5, "camilo.vargas@gmail.com", false),
                new Email(6, "karenromero58m@yahoo.com", false),
                new Email(7, "cosmo58wanda34@gmail.com", false),
                new Email(8, "miller.gallegof@gmail.com", true),
                new Email(9, "millergaf@yahoo.com", false),
                new Email(10, "miller.gallegof@yahoo.com", true),
                new Email(11, "mariokart45@gmail.com", false) ,
                new Email(12, "esteban@hotmail.com", false),
                new Email(13, "oscar98@gmail.com", false),
                new Email(14, "jhonedward@gmail.com", true),
                new Email(15, "edwardRamirez@gmail.com", false),
                new Email(16, "Daniel_gil@gmail.com", false),
                new Email(17, "steven05@gmail.com", false),
                new Email(18, "carlitoalimaña@sofka.com", false),
                new Email(19, "estebhelp@hotmail.com", false),
                new Email(20, "cantores_del_surhotmail.com", false),
                new Email(21, "eddi_elmejor@sofka.com", false) ,
                new Email(22, "raul.alzate@gmail.com", false),
                new Email(23, "alexandraJkarol@hotmail.com", false),
                new Email(24, "eddi_elmejor@outlook.com", false),
                new Email(25, "karolG_provenza@hotmail.com", true),
                new Email(26, "yeferson.provenza@gmail.com", true),
                new Email(27, "jenisite22@gmail.com", false),
                new Email(28, "dayanita22gmail.com", false),
                new Email(29, "cosita22@outlook.com", true),
                new Email(29, "cosita22@outlook.com", true)
        );
        return emails;
    }
}
