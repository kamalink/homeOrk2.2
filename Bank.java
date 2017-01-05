package module2.homeOrk2;

import java.util.Random;
import java.util.Scanner;

class Bank {
    public static void main(String[]args){

        Random rand = new Random();

        double balance = 5000 - rand.nextInt(7500);
        if (balance >= 1) {
            System.out.println("Hi! Your balance is " + balance + "\n\n" + "How much you want to withdraw?");
        } else {
            System.out.println("Oh no, you balance is negative! Please, fund your account." + "\n");
            return;
        }

        Scanner scan = new Scanner(System.in);
        double withdrawal = scan.nextInt();

        double commission = withdrawal/20;
        double x = balance - withdrawal;


        if(x >= commission){
            System.out.println("\n" + "OK");
        } else {
            System.out.println("\n" + "NO");
            return;
        }
        double y = x - commission;


        System.out.println("Commission is " + commission + "\n" + "Your balance after withdrawal: " + y);
    }
}

