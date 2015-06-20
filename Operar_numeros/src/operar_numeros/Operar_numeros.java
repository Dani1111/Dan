/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operar_numeros;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Operar_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector= new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3=0;
        int suma=0;
        int producto=1;
        do {
            System.out.println("Elige un opción:/n 1-Calcular la media de una serie de números/n 2-Calcular el producto de una serie de números/n 3-Fin del programa");
            numero1= lector.nextInt();
            switch (numero1){
                case 1:  
                    System.out.println("¿Cuántos números quiere introducir?");
                    numero2=lector.nextInt();
                    System.out.println("Introduce una serie de numeros");
                    for(int i=numero3;i<=numero2;i++){
                    numero3= lector.nextInt();
                    }
                    for(int i=numero3;i<=numero2;i++){
                    suma= i+suma;
                    }
                    System.out.println("La media es igual a" + suma/numero2);
                case 2:
                    System.out.println("¿Cuántos números quiere introducir?");
                    numero2=lector.nextInt();
                    System.out.println("Introduce una serie de numeros");
                    for(int i=numero3;i<=numero2;i++){
                    i= lector.nextInt();
                    }
                    for(int i=numero3;i<=numero2;i++){
                    producto= i*producto;
                    }
                    System.out.println("El producto es" + producto);
                case 3:
                    System.out.println("Fin del programa");  
            }
        }while (numero1==3);
    }
}
