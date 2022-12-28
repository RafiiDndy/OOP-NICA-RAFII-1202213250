package Modul3_RAFII;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static boolean repeat = true;
    public static void main(String[] args) {
        Calculation h = new Calculation();
        Thread thread = new Thread(h);
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        do {  
            System.out.println("Program Menu");
            System.out.println("1. Square\n2. Circle\n3. Trapezoid\n0. Exit");
            System.out.print("Input: ");
       
            try{
                int menu = sc.nextInt();
                System.out.println();
                switch (menu) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = sc.nextDouble();

                        h.setSquare(side);
                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + h.getSquare());
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle: ");
                        double radius = sc.nextDouble(); 

                        h.setCircle(radius);
                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + h.getCircle());
                        break;
                    case 3:
                        System.out.println("Enter the side of the base of the trapezoid: ");
                        double b = sc.nextDouble();
                        System.out.println("Enter the upper side of the trapezoid: ");
                        double a = sc.nextDouble();
                        System.out.println("Enter the height of the trapezoid: ");
                        double t = sc.nextDouble();

                        h.setTrapezoid(a, b, t);
                        thread.start();
                        thread.join();
                        
                        System.out.println("\nThe calculation result: " + h.getTrapezoid());
                        break;
                    case 0 :
                        System.out.println("End");
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====\n");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e);
                System.out.println();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
        sc.close();
    }
}
