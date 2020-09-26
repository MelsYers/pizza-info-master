package kz.iitu.jd3.pizzainfo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserPizza {

    private List<Pizza> userPizzas;

    public UserPizza() {
    }

    public UserPizza(List<Pizza> userPizzas) {
        this.userPizzas = userPizzas;
    }
}
