/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2n.grau;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Grau {
    private static boolean repeteix;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {            
        System.out.print("Enter 'a' value: ");
        int a = scan.nextInt();
        System.out.print("Enter 'b' value: ");
        int b = scan.nextInt();
        System.out.print("Enter 'c' value: ");
        int c = scan.nextInt();
        double limit_value = Math.pow(b,2) - 4 * a * c;
        if (limit_value>=0.0) {
            if (limit_value==0.0) {
                System.out.println("El resultat és: " + -b/(2*a));
            }else{
                System.out.println("Els resultats son: " + (-b - sqrt(limit_value))/(2*a) + ", " + (-b + sqrt(limit_value))/(2*a));
            }
        }else{
            System.out.println("error");
        }
        System.out.print("Repeat operation (si/no): ");
        String str = scan.next();
        repeteix = str.equalsIgnoreCase("si");
        } while (repeteix);
        scan.close();
    }
}