
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Repdos {

    public static void main(String[] args) {
        
        /* Metodo arrayTerrenos[] = {new Metodo(10, 3, 2),
            new Metodo(20, 10, 1),
            new Metodo(30, 20, 2)};
        for(Metodo terreno: arrayTerrenos){
            terreno.calcularArea();
            terreno.calcularValorT();
            System.out.println(terreno);    
            
        }*/
        class Metodos{
            
        }
        Scanner entrada = new Scanner(System.in);
        Metodo arrayTerrenos[] = new Metodo[1];
        int i= 0;
        while (true) {
            System.out.println("Dame alto, ancho y vmc:");
            arrayTerrenos[i] = new Metodo(entrada.nextDouble(),
                    entrada.nextDouble(), entrada.nextDouble());
            arrayTerrenos[i].calcularArea();
            arrayTerrenos[i].calcularValorT();
            System.out.println(arrayTerrenos[i]);
            i++;
            System.out.println("Desea mas Terrenos (S/N)");
            String opc = entrada.nextLine();
            if (opc.equals("N")|| (i>arrayTerrenos.length))break; {
                
            }
            for(Metodo terrenos:arrayTerrenos){
                terrenos.calcularArea();
                terrenos.calcularValorT();
                System.out.println(terrenos);
                
            }
        }
        
    }

}
