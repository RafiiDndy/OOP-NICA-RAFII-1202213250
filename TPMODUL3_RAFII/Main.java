package TPMODUL3_RAFII;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("Enter customerID: ");
                customerID = input.nextInt();
                System.out.println("Enter how much food to make: ");
                orderQty = input.nextInt();
                Thread T1 = new Thread(restaurant);
                Waiters waiters = new Waiters(customerID, orderQty);
                Thread T2 = new Thread(waiters);
                T1.start();
                T2.start();
                T1.join();
                T2.join();
            } catch (Exception e) {
                System.out.println("Input must be integer");
            }
        }
    }
}
