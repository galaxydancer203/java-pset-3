import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-7s: ", "Height");
        double height = input.nextDouble();
        System.out.printf("%-7s: ", "Weight");
        double width = input.nextDouble();
        input.close();
        double intoMm = 25.4;
        height = height*intoMm;
        width = width*intoMm;
        double area = height*width;
        System.out.printf("%,.2f", area);
        System.out.println(" square millimeters.");
    }
}

