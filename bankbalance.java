package balance;

import java.util.Scanner;

public class Account {
    long acc, bal;
    String name;

    public void read() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = in.nextLine();
        System.out.println("Enter the account number:");
        acc = Long.parseLong(in.nextLine());
        System.out.println("Enter the account balance:");
        bal = Long.parseLong(in.nextLine());
    }

    public void disp() {
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("--- Account Details ---");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Account number: " + acc);
        System.out.println("Balance: " + bal);
    }
}
import balance.Account;

public class BankBal {
    public static void main(String[] args) {
        try {
            Account a = new Account();
            a.read(); // calling the method of Account class
            a.disp();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
