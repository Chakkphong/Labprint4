/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labprint4;

/**
 
 * @author Administrator
 */
import java.util.Scanner;

public class Labprint4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keybord=new Scanner(System.in);
        System.out.print("A = ");
        int A = keybord.nextInt();
        System.out.print("B = ");
        int B = keybord.nextInt();
        for (int i = A; i <= B; i++) {
          System.out.print("  "+i);
        }
        
    }
    
}
