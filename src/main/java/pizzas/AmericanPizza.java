package pizzas;

import doughs.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import toppings.*;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AmericanPizza implements Pizza {

    public final Dough dough;
    public final List<Topping> toppings;

    public AmericanPizza(@Qualifier("yeast") Dough dough, Topping cucumber, Topping tomato, Topping bacon) {
        this.dough = dough;
        toppings = new ArrayList<>();
        toppings.add(cucumber);
        toppings.add(tomato);
        toppings.add(bacon);
    }

    @Override
    public void bake() {
        System.out.printf("Американская пицца готова! (Состав: %s, %s)\n", dough.getName() + " тесто",
                toppings.stream()
                        .reduce("",
                                (acc, x) -> acc == "" ? x.getName() : acc+", "+x.getName(),
                                (x, y) -> x + y));
    }
}
