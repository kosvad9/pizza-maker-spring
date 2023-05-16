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
public class AsianPizza implements Pizza {

    public final Dough dough;
    public final List<Topping> toppings;

    public AsianPizza(@Qualifier("shortbread") Dough dough,
                      @Qualifier("ham") Topping ham,
                      @Qualifier("cucumber") Topping cucumber,
                      @Qualifier("mushrooms") Topping mushrooms,
                      @Qualifier("olives") Topping olives) {
        this.dough = dough;
        toppings = new ArrayList<>();
        toppings.add(ham);
        toppings.add(cucumber);
        toppings.add(mushrooms);
        toppings.add(olives);
    }

    @Override
    public void bake() {
        System.out.printf("Азиатская пицца готова! (Состав: %s, %s)\n", dough.getName()+" тесто",
                toppings.stream()
                        .reduce("",
                                (acc, x) -> acc == "" ? x.getName() : acc+", "+x.getName(),
                                (x, y) -> x + y));
    }
}
