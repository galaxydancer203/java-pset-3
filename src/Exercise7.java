import java.util.Scanner;

public class Exercise7 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-8s: ", "Salary");
        double salary = input.nextDouble();
        System.out.printf("%-8s: ", "401(k)");
        double retirement = input.nextDouble();
        System.out.printf("%-8s: ", "Federal");
        double federal = input.nextDouble();
        System.out.printf("%-8s: ", "State");
        double state = input.nextDouble();
        input.close();
        double paycheck = (salary * (1-retirement/100) * (1-(state+federal)/100))/24;
        System.out.printf("%n$%,.2f", paycheck);
    }
}

