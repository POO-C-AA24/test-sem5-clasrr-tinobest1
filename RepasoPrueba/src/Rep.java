/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Rep {

    public static void main(String[] args) {

        //el propetario que la solcion permita una infinidad de terrenos
        Metodo t1 = new Metodo(40, 10, 2);
        Metodo t2 = new Metodo(21, 12, 2);
        Metodo t3 = new Metodo();
        t1.calcularArea();
        t1.calcularValorT();
        System.out.println(t1);
        t2.calcularArea();
        t2.calcularValorT();
        System.out.println(t2);
        
       
       /* String op = "5";
        double ancho, alto, valorMetroCua;
        Scanner entrada = new Scanner(System.in);
        while (op.equals("5")) {
            if (op.equals("n")) {
                break;
            }

            System.out.println("Dame el ancho");
            ancho = entrada.nextDouble();
            System.out.println("Dame el Alto");
            alto = entrada.nextDouble();
            System.out.println("Dame el valor mt:");
            valorMetroCua = entrada.nextDouble();
            Metodo tx = new Metodo(ancho, alto, valorMetroCua);
            tx.calcularArea();
            tx.calcularValorT();
            System.out.println("Los DATOS SON:\n" + tx);
            System.out.println("Deseas calcular mas terrenos");
            op = entrada.next();*/

        }
    }



class Metodo {

    public double ancho;
    public double largo;
    public double valorMetCua;
    public double area;
    public double costoT;
    public String forma;

    public Metodo() {
    }

    public Metodo(double ancho, double largo, double valorMetCua) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetCua = valorMetCua;
    }

    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularValorT() {
        this.costoT = area * valorMetCua;
        if (area > 300) {
            costoT *= 0.8;// costoT = (area*valorMetroCua) - (area * valorMetroCua)*0.2;
            
        }else if (area >= 200) {
            costoT *= 0.9;//costoT = (area*valorMetroCua) - (area * valorMetroCua)*0.1;
            
        }
            
      

    }

    @Override
    public String toString() {
        return "Metodo{"
                + "ancho="
                + ancho
                + ", largo="
                + largo
                + ", valorMetCua="
                + valorMetCua
                + ", area="
                + area
                + ", costoT="
                + costoT
                + '}';
    }

}
