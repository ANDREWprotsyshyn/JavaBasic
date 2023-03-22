package HomeWorks;
import java.util.Scanner;
public class PizzaSquareScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите диаметр окружности пиццы: ");
        
        double a = sc.nextInt();

        PizzaSquareCalculation pizzaSquareCalculation = new PizzaSquareCalculation(a);

        sc.close();
    }
}
