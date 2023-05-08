public class ItalianPizza implements Pizza {

    public final Yeast dough;
    public final Pepperoni pepperoni;
    public final Olives olives;
    public final Mushrooms mushrooms;

    public ItalianPizza(Yeast dough, Pepperoni pepperoni, Olives olives, Mushrooms mushrooms) {
        this.dough = dough;
        this.pepperoni = pepperoni;
        this.olives = olives;
        this.mushrooms = mushrooms;
    }

    @Override
    public void bake() {
        System.out.printf("Итальянская пицца готова! (Состав: %s, %s, %s, %s)\n",
                dough.getName() + " тесто", pepperoni.getName(), olives.getName(), mushrooms.getName());
    }
}
