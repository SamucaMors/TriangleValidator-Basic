/**
 * Triangular area comparison program
 *
 * This program allows the user to insert the sides of two triangles (X and Y),
 * validates whether they can form triangles, calculates their areas using Heron's formula,
 * and compare which triangle has the largest area.
 *
 * Author: [Your name]
 * Date: [Date]
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double sideA_x, sideB_x, sideC_x;
        double triangleAreaX, triangleAreaY;

        System.out.println("Triangle X");
        while (true) {
            System.out.println("Enter the length of the first side (sideA):");
            sideA_x = read.nextDouble();

            System.out.println("Enter the length of the second side (sideB):");
            sideB_x = read.nextDouble();

            System.out.println("Enter the length of the third side (sideC):");
            sideC_x = read.nextDouble();

            // Verificação da condição para formar um triângulo
            if (sideA_x + sideB_x > sideC_x && sideA_x + sideC_x > sideB_x && sideB_x + sideC_x > sideA_x) {
                System.out.println("The values can form a triangle!");
                double semiPerimetroX = (sideA_x + sideB_x + sideC_x)/2;
                triangleAreaX = Math.sqrt( semiPerimetroX * (semiPerimetroX - sideA_x) * (semiPerimetroX - sideB_x) * (semiPerimetroX - sideC_x));
                System.out.println(String.format("Area X: %.2f", triangleAreaX));
                break; // Sai do loop, pois os valores são válidos
            } else {
                System.out.println("The values cannot form a triangle. Please try again.");
            }
        }

        double sideA_y, sideB_y, sideC_y;
        System.out.println("Triangle Y");
        while (true) {
            System.out.println("Enter the length of the first side (sideA):");
            sideA_y = read.nextDouble();

            System.out.println("Enter the length of the second side (sideB):");
            sideB_y = read.nextDouble();

            System.out.println("Enter the length of the third side (sideC):");
            sideC_y = read.nextDouble();

            // Verificação da condição para formar um triângulo
            if (sideA_y + sideB_y > sideC_y && sideA_y + sideC_y > sideB_y && sideB_y + sideC_y > sideA_y) {
                System.out.println("The values can form a triangle!");
                double semiPerimetroY = (sideA_y + sideB_y + sideC_y)/2;
                triangleAreaY = Math.sqrt(semiPerimetroY * (semiPerimetroY - sideA_y) * (semiPerimetroY - sideB_y) * (semiPerimetroY - sideC_y));
                System.out.println(String.format("Area Y: %.2f", triangleAreaY));
                break; // Sai do loop, pois os valores são válidos
            } else {
                System.out.println("The values cannot form a triangle. Please try again.");
            }
        }

        if(triangleAreaX > triangleAreaY){
            System.out.println("Area X is greater than Area Y");
        }else if(triangleAreaX < triangleAreaY){
            System.out.println("Area Y is greater than Area X");
        }else{
            System.out.println("Both are equal");
        }
        read.close();
    }
}