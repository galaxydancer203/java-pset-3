import java.util.Scanner;

public class Exercise8 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Students : ");
        int students = input.nextInt();
        System.out.print("Teachers : ");
        int teachers = input.nextInt();
        System.out.print("Capacity : ");
        int capacity = input.nextInt();
        double riders = students + teachers;
        double buses = riders/(double)capacity;
        double remainder = (capacity * ((((riders -.5)%capacity) + .5) / (double)capacity))+ .00000000001;
        buses += ((((capacity - (int)remainder) % capacity) / (double)capacity));
        buses = (int)buses;
        remainder = riders % capacity;
        System.out.printf("%n%-20s: %d", "Buses required", (int)buses);
        System.out.printf("%n%-20s: %d", "Overflow passengers", (int)remainder);
    }
}

