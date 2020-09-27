import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s: ", "Wage");
        double wage = input.nextDouble();
        System.out.printf("%-10s: ", "Monday");
        double monday = input.nextDouble();
        System.out.printf("%-10s: ", "Tuesday");
        double tuesday = input.nextDouble();
        System.out.printf("%-10s: ", "Wednesday");
        double wednesday = input.nextDouble();
        System.out.printf("%-10s: ", "Thursday");
        double thursday = input.nextDouble();
        System.out.printf("%-10s: ", "Friday");
        double friday = input.nextDouble();
        System.out.printf("%-10s: ", "Saturday");
        double saturday = input.nextDouble();
        System.out.printf("%-10s: ", "Sunday");
        double sunday = input.nextDouble();
        input.close();
        double hours_worked = monday + tuesday + wednesday + thursday + friday+ saturday+sunday;
      double gross_Pay = hours_worked * wage;
        System.out.printf("%n$%,.2f.", gross_Pay);

    }
}

