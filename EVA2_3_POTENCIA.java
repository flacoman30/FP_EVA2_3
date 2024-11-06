/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //math.pow
        int pot , base;
        System.out.println("Escribir un numero potencial");
        Scanner captu=new Scanner(System.in);
        pot=captu.nextInt();
        base = captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for(int i = 1; i<=pot;i++){
        resu= resu * base ;
        
        }
        System.out.println("el resultado es ="+ resu);
    }
    
}
