package co.com.sofka.retoreactividadfuncional.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {

    private Integer id;
    private String email;
    private Boolean estado;

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", estado=" + estado +
                '}';
    }
}
