package toppings;

import org.springframework.stereotype.Component;

@Component("pepperoni")
public class Pepperoni implements Topping {
    @Override
    public String getName() {
        return "Пепперони";
    }
}
