import doughs.Shortbread;
import doughs.Yeast;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pizzas.AmericanPizza;
import pizzas.AsianPizza;
import pizzas.ItalianPizza;
import pizzas.Pizza;
import toppings.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class)){
            System.out.println("Выберите пиццу: ");
            System.out.println("1. Американская");
            System.out.println("2. Итальянская");
            System.out.println("3. Азиатская");
            Scanner sc = new Scanner(System.in);
            int choice = -1;
            while (choice > 3 || choice < 1) {
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод!");
                    sc.nextLine();
                }
            }
            Pizza pizza = (Pizza) switch (choice) {
                case 1 -> context.getBean("americanPizza");
                case 2 -> context.getBean("italianPizza");
                case 3 -> context.getBean("asianPizza");
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            };
            pizza.bake();
        }
    }
}
