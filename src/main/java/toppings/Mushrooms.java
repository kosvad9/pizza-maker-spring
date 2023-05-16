package toppings;

import org.springframework.stereotype.Component;

@Component("mushrooms")
public class Mushrooms implements Topping {
    @Override
    public String getName() {
        return "Грибы";
    }
}
