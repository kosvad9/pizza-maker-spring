package toppings;

import org.springframework.stereotype.Component;

@Component("bacon")
public class Bacon implements Topping {
    @Override
    public String getName() {
        return "Бекон";
    }
}
