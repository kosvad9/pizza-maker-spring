package toppings;

import org.springframework.stereotype.Component;

@Component("olives")
public class Olives implements Topping {
    @Override
    public String getName() {
        return "Оливки";
    }
}
