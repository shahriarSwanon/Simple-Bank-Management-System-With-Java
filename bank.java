import java.util.Scanner;

public class bank {
    private static double balance = 0.0;

    public static void deposit(double amount) {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0) 
        {
            if (amount <= balance) 
            {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } 
            else 
            {
                System.out.println("Insufficient funds. Cannot withdraw $" + amount);
            }
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    public static void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            
            System.out.print("Enter number: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

