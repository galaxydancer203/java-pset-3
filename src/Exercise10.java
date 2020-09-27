import java.util.Scanner;

public class Exercise10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * (5/9);
        double kelvin = celsius + 273.15;

        System.out.printf("%n%-11s: %,.2f", "Celsius", celsius);
        System.out.printf("%n%-11s: %,.2f", "Kelvin", kelvin);
    }
}

