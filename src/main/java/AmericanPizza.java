public class AmericanPizza implements Pizza {

    public final Yeast dough;
    public final Cucumber cucumber;
    public final Tomato tomato;
    public final Bacon bacon;

    public AmericanPizza(Yeast dough, Cucumber cucumber, Tomato tomato, Bacon bacon) {
        this.dough = dough;
        this.cucumber = cucumber;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    @Override
    public void bake() {
        System.out.printf("Американская пицца готова! (Состав: %s, %s, %s, %s)\n",
                dough.getName() + " тесто", cucumber.getName(), tomato.getName(), bacon.getName());
    }
}
