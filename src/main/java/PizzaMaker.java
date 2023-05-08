import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args) {
        System.out.println("Выберите пиццу: ");
        System.out.println("1. Американская");
        System.out.println("2. Итальянская");
        System.out.println("3. Азиатская");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice > 3 || choice < 1){
            try{
                choice = sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Некорректный ввод!");
                sc.nextLine();
            }
        }
        switch (choice){
            case 1 -> {
                AmericanPizza americanPizza = new AmericanPizza(new Yeast(),new Cucumber(), new Tomato(), new Bacon());
                americanPizza.bake();
            }
            case 2 -> {
                ItalianPizza italianPizza = new ItalianPizza(new Yeast(), new Pepperoni(), new Olives(), new Mushrooms());
                italianPizza.bake();
            }
            case 3 -> {
                AsianPizza asianPizza = new AsianPizza(new Shortbread(), new Ham(), new Cucumber(), new Mushrooms(), new Olives());
                asianPizza.bake();
            }
        }
    }
}
