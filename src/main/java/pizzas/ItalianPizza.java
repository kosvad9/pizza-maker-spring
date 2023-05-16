package pizzas;

import doughs.Dough;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import toppings.Topping;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ItalianPizza implements Pizza {

    public final Dough dough;
    public final List<Topping> toppings;

    public ItalianPizza(@Qualifier("yeast") Dough dough,
                        @Qualifier("pepperoni") Topping pepperoni,
                        @Qualifier("olives") Topping olives,
                        @Qualifier("mushrooms") Topping mushrooms) {
        this.dough = dough;
        toppings = new ArrayList<>();
        toppings.add(pepperoni);
        toppings.add(olives);
        toppings.add(mushrooms);
    }

    @Override
    public void bake() {
        System.out.printf("Итальянская пицца готова! (Состав: %s, %s)\n", dough.getName() + " тесто",
                toppings.stream()
                        .reduce("",
                                (acc, x) -> acc == "" ? x.getName() : acc+", "+x.getName(),
                                (x, y) -> x + y));
    }
}
