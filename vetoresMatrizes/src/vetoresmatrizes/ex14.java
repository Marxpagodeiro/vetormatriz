/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package vetoresmatrizes;
import java.util.Random;

/**
 *
 * @author Bruno
 */
public class ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int matriz[][] = new int[7][7];
        
        for (int i =0;i<7;i++){
            for (int j =0;j<7;j++){
                matriz[i][j]= random.nextInt(100);
            }
        }
        
        System.out.println("                                              ");
        System.out.println("--------------------------------------------------");
        System.out.println("Matriz triangular inferior:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", matriz[i][j]); 
            }
            System.out.println();
        }
        System.out.println("                                              ");
        System.out.println("--------------------------------------------------");
    }
}
