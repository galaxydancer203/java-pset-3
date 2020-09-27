import java.util.Scanner;

public class Exercise9 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount : ");
        double amount = input.nextDouble();
input.close();
        int quarters =(int)((amount-amount%0.25)/0.25);
        amount -= (quarters*0.25);
        int dimes =(int)((amount-amount%0.10)/0.10);
        amount -= (dimes*0.10);
        int nickels =(int)((amount-amount%0.05)/0.05);
        amount -= (nickels*0.05);
        int pennies =(int)(amount*100);
        System.out.println("Quarters : " + quarters);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nickels);
        System.out.println("Pennies  : " + pennies);
    }
}

