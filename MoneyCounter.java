import java.util.Scanner;

public class MoneyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] denominations = {100.0, 50.0, 20.0, 10.0, 5.0, 1.0, 0.25, 0.10, 0.05, 0.01};
        String[] names = {"$100 bills", "$50 bills", "$20 bills", "$10 bills", "$5 bills", 
                          "$1 bills", "Quarters", "Dimes", "Nickels", "Pennies"};

        System.out.print("Enter total amount of money: $");
        double amount = scanner.nextDouble();

        
        long cents = Math.round(amount * 100);

        System.out.println("\nBreakdown for $" + amount + ":");
        System.out.println("---------------------------");

        for (int i = 0; i < denominations.length; i++) {
            long denominationCents = Math.round(denominations[i] * 100);
            
            
            long count = cents / denominationCents;
            
            if (count > 0) {
                System.out.println(names[i] + ": " + count);
                
                cents %= denominationCents;
            }
        }
        
        scanner.close();
    }
}