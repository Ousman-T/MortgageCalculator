package Main;

import java.util.Scanner;

public class MortgageCalc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        long principal = scanner.nextLong();

        System.out.println("Annual Interest Rate: ");
        double air = scanner.nextDouble();

        System.out.println("Loan Period (Years): ");
        long annualInterest = scanner.nextInt();

        double monthlyInterest = air / 12;
        double sumInterest = monthlyInterest / 100;
        long numPayments = annualInterest * 12;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)) / Math.pow(1 + monthlyInterest, numPayments);



//        testing values
//        System.out.println(principal);
//        System.out.println(air);
//        System.out.println(annualInterest);

    }
}
