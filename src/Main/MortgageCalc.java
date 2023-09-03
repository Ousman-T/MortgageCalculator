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
        int loanLength = scanner.nextInt();

//        testing values
        System.out.println(principal);
        System.out.println(air);
        System.out.println(loanLength);

    }
}
