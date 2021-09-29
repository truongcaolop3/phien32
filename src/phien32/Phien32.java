/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien32;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x,y;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập so inch: ");
        x = sc.nextDouble();
        
        y =  x * 0.0254;
        System.out.println(x + " inch bằng " + y + " Met");
        
    }
    
}
