package com.mycompany.ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        double R,A,L;
        Scanner r= new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        R=r.nextDouble();
        
            
            A=Math.PI*Math.pow(R, 2);
            L=2*Math.PI*R;
            
            System.out.println("El área del círculo es: "+A);
            System.out.println("La longitud de la circunferencia es: "+L);
            
            
        

    }
}
