package toppings;

import org.springframework.stereotype.Component;

@Component("tomato")
public class Tomato implements Topping {
    @Override
    public String getName() {
        return "Помидор";
    }
}
