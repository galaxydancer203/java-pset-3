import java.util.Scanner;

public class Exercise4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-7s: ", "Height");
        double height = input.nextDouble();
        System.out.printf("%-7s: ", "Weight");
        double width = input.nextDouble();
        input.close();
        double intocm = 2.54;
        height = height*intocm;
        width = width*intocm;
        double area = (2*height)+(2*width);
        System.out.printf("%,.2f", area);
        System.out.println(" centimeters.");
    }
}

