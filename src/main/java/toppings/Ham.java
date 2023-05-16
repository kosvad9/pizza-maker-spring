package toppings;

import org.springframework.stereotype.Component;

@Component("ham")
public class Ham implements Topping {
    @Override
    public String getName() {
        return "Ветчина";
    }
}
