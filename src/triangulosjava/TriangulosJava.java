/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulosjava;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class TriangulosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        double l1, l2, l3, h;

        System.out.println("Ingrese la longitud del lado a");
        l1 = scan.nextFloat();
        System.out.println("---------------------------------------------");

        System.out.println("Ingrese la longitud del lado b");
        l2 = scan.nextFloat();
        System.out.println("---------------------------------------------");

        System.out.println("Ingrese la longitud del lado c");
        l3 = scan.nextFloat();
        System.out.println("---------------------------------------------");

        System.out.println("Ingrese la altura del triangulo");
        h = scan.nextFloat();
        System.out.println("---------------------------------------------");

        if (Objects.equals(l1, l2) && Objects.equals(l2, l3)) {
            System.out.println("El triangulo es: Equilatero");

        } else if (Objects.equals(l1, l2) && !Objects.equals(l2, l3)) {
            System.out.println("El triangulo es: Isoscel");

        } else if (Objects.equals(l1, l3) && !Objects.equals(l2, l3)) {
            System.out.println("El triangulo es: Isoscel");

        } else if (Objects.equals(l2, l3) && !Objects.equals(l1, l3)) {
            System.out.println("El triangulo es: Isoscel");

        } else if (!Objects.equals(l1, l3) && !Objects.equals(l2, l3)) {
            System.out.println("El triangulo es: Escaleno");
        }

        System.out.println("---------------------------------------------\n---------------------------------------------");
        String anguloEncontrar;
        Double A, B, C, A2, B2, C2;
        A = l1;
        B = l2;
        C = l3;
        A2 = Math.pow(A, 2);
        B2 = Math.pow(B, 2);
        C2 = Math.pow(C, 2);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("El angulo a hallar es A,B o C");
        anguloEncontrar = scan.next();
        System.out.println("---------------------------------------------");

        switch (anguloEncontrar.toUpperCase()) {

            case "A":
                System.out.println("El angulo a hallar es el A");
                System.out.println("---------------------------------------------");

                double cosA,anguloRadianesA,anguloGradosA;
                
                cosA = (A2 - B2 - C2) / (0-2 * B * C);
                anguloRadianesA = Math.acos(cosA);
                anguloGradosA = Math.toDegrees(anguloRadianesA);
                System.out.println("El valor del angulo de A es de = "+df.format(anguloGradosA) +"° ");
                System.out.println("---------------------------------------------");
                
                break;

            case "B":
                System.out.println("El angulo a hallar es el B");
                System.out.println("---------------------------------------------");

                 double cosB,anguloRadianesB,anguloGradosB;
                
                cosB = (B2 - A2 - C2) / (0-2 * A * C);
                anguloRadianesB = Math.acos(cosB);
                anguloGradosB = Math.toDegrees(anguloRadianesB);
                System.out.println("El valor del angulo de B es de = "+df.format(anguloGradosB) +"° ");
                System.out.println("---------------------------------------------");
                break;

            case "C":
                System.out.println("El angulo a hallar es el C");
                System.out.println("---------------------------------------------");

                double cosC,anguloRadianesC,anguloGradosC;
                
                cosC = (C2 - A2 - B2) / (0-2 * A * B);
                anguloRadianesC = Math.acos(cosC);
                anguloGradosC = Math.toDegrees(anguloRadianesC);
                System.out.println("El valor del angulo de C es de = "+df.format(anguloGradosC) +"° ");
                System.out.println("---------------------------------------------");
                break;

            default:
                throw new AssertionError();
        }
    }

}
