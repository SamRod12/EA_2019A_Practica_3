/*
 * To change this license header, choose License Headers entrada Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template entrada the editor.
 */
package practica_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author carlosjaime
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner entrada = new Scanner(new FileReader("Pizzas.txt"));
        StringBuilder sb = new StringBuilder();
        StringBuilder A = new StringBuilder();
        StringBuilder E = new StringBuilder();
        StringBuilder I = new StringBuilder();
        StringBuilder O = new StringBuilder();
        StringBuilder U = new StringBuilder();
        
        int a = 0,e = 0,i = 0,o = 0,u = 0;
        
        while(entrada.hasNext()) {
            sb.append(entrada.next());
        }
        entrada.close();
        String stringSalida = sb.toString();
        System.out.println(stringSalida);
        
        for (char c : stringSalida.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                    A.append(c);
                    a++;
                break;
                case 'e':
                    E.append(c);
                    e++;
                break;
                case 'i':
                    I.append(c);
                    i++;
                break;
                case 'o':
                    O.append(c);
                    o++;
                break;
                case 'u':
                    U.append(c);
                    u++;
                break;
            }
        }
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
        System.out.println("");
        System.out.println(A);
        System.out.println(E);
        System.out.println(I);
        System.out.println(O);
        System.out.println(U);
    }
    
}
