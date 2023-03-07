/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Libro;
import Entidad.usuario;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class POOEj01 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
       usuario u1= new usuario("");
       int cont=1;
        System.out.println("Ingrese cantidad");
        int cantidad= leer.nextInt();
        String [] [] matriz = new String [cantidad] [4];
        for (int i = 0; i < cantidad; i++) {
            Libro l1= new Libro("","",1,"");
            matriz [i][0] = l1.getAutor();
            matriz [i] [1]= l1.getTitulo();
            matriz [i] [2] = l1.getIsbn();
            matriz [i] [3] = String.valueOf(l1.getPaginas());
        }
        System.out.println(" ");
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Libro "+cont);
            System.out.println("El titulo es "+matriz[i][1]);
            System.out.println("El autor es "+matriz[i][0]);
            System.out.println("Son "+matriz[i][3]+" paginas.");
            System.out.println("El ISBN es "+matriz[i][2]);
            System.out.println(" ");
            cont++;
        }
       
       
        
    }
    
}
