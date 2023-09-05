package Main;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Principal ($1k - $1M): ");
        long principal;
        while (true){
            System.out.println("Principal ($1k - $1M): ");
            principal = scanner.nextLong();
            if(principal >= 1000 && principal <= 1000000)
                break;
            else{
                System.out.println("Enter a number between 1,000 and 1,000,000.");
            }
        }

        double air;
        while (true){
            System.out.println("Annual Interest Rate (1 - 30): ");
            air = scanner.nextDouble();
            if(air > 0 && air < 30)
                break;
            else{
                System.out.println("Enter a value greater than 0 and less than 30.");
            }
        }

        System.out.println("Loan Period (Years): ");
        long annualInterest;
        while(true){
            System.out.println("Loan Period (Years 1 - 30): ");
            annualInterest = scanner.nextLong();
            if(annualInterest >= 1 && annualInterest <= 30)
                break;
            else{
                System.out.println("Enter a value between 1 and 30.");
            }
        }

        double monthlyInterest = air / 12;
        double sumInterest = monthlyInterest / 100;
        long numPayments = annualInterest * 12;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)) / Math.pow(1 + monthlyInterest, numPayments);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);



//        testing values
//        System.out.println(principal);
//        System.out.println(air);
//        System.out.println(annualInterest);

    }
}
