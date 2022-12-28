package Modul3_RAFII;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static boolean repeat = true;
    public static void main(String[] args) {
        Scanner Count = new Scanner(System.in);
        do {
            try{
                System.out.println("Program Menu");
                System.out.println("1. Square\n2. Circle\n3. Trapezoid\n0. Exit");
                System.out.print("Input: ");
                int Menu = Count.nextInt();

                switch (Menu) {
                    case 1:
                        System.out.println("Enter the length of the side of the square: ");
                        double side = Count.nextDouble();
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle: ");
                        double radius = Count.nextDouble(); 
                    case 3:
                        System.out.println("Enter the side of the base of the trapezoid: ");
                        double base = Count.nextDouble();
                        System.out.println("Enter the upper side of the trapezoid: ");
                        double upper = Count.nextDouble();
                        System.out.println("Enter the height of the trapezoid: ");
                        double height = Count.nextDouble();
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
                System.out.println("Input must be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
        Count.close();
    }
}
