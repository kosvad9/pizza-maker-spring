public class AsianPizza implements Pizza {

    public final Shortbread dough;
    public final Ham ham;
    public final Cucumber cucumber;
    public final Mushrooms mushrooms;
    public final Olives olives;

    public AsianPizza(Shortbread dough, Ham ham, Cucumber cucumber, Mushrooms mushrooms, Olives olives) {
        this.dough = dough;
        this.ham = ham;
        this.cucumber = cucumber;
        this.mushrooms = mushrooms;
        this.olives = olives;
    }

    @Override
    public void bake() {
        System.out.printf("Азиатская пицца готова! (Состав: %s, %s, %s, %s, %s)\n",
                dough.getName()+" тесто", ham.getName(), cucumber.getName(), mushrooms.getName(), olives.getName());
    }
}
