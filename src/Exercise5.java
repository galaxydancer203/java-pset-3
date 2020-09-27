import java.util.Scanner;

public class Exercise5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-11s: ", "Homework 1");
        double homework1 = input.nextDouble();
        System.out.printf("%-11s: ", "Homework 2");
        double homework2 = input.nextDouble();
        System.out.printf("%-11s: ", "Homework 3");
        double homework3 = input.nextDouble();
        System.out.printf("%-11s: ", "Quiz 1");
        double quiz1 = input.nextDouble();
        System.out.printf("%-11s: ", "Quiz 2");
        double quiz2 = input.nextDouble();
        System.out.printf("%-11s: ", "Test 1");
        double test = input.nextDouble();
        input.close();
        double homework_total = homework1 + homework2 + homework3;
        double quiz_total = quiz1 + quiz2;
        double homework_average = homework_total/3;
        double quiz_average = quiz_total/2;
        double homework_points = homework_average * .15;
        double quiz_points = quiz_average * .35;
        double test_points = test * .5;
        double total_points = homework_points + quiz_points + test_points;
        System.out.printf("%n%.2f%%.", total_points);
    }
}

