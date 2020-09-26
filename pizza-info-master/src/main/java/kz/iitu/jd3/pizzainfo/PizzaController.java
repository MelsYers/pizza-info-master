package kz.iitu.jd3.pizzainfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pizza/info")
public class PizzaController {


    @GetMapping("/{userId}")
    public UserPizza getPizzaByUserId(
            @PathVariable("userId") String userId) {

        List<Pizza> userPizzaList =  Arrays.asList(
    new Pizza("1", "Title 1", "Tt", "Desc 1"),
    new Pizza("2", "Title 2", "Ttt", "Desc 2"));

        UserPizza userPizza = new UserPizza(userPizzaList);

        return userPizza;
    }
    @GetMapping("/detail/{id}")
    public Pizza getPizzaById(@PathVariable("id") String id) {

        return new Pizza(id, id + " - Abay zholy", "Auezov", "");
    }
}
