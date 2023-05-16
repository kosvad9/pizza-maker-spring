package toppings;

import org.springframework.stereotype.Component;

@Component("cucumber")
public class Cucumber implements Topping {
    @Override
    public String getName() {
        return "Огурец";
    }
}
