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
public class ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int matriz[][] = new int[4][4];
        
        for (int i =0;i<4;i++){
            for (int j =0;j<4;j++){
                matriz[i][j]= random.nextInt(30);
            }
        }
        
        // soma todos os elementos da matriz 
        int somaTotal =0;
        for (int x =0;x<4;x++){
            for (int y =0;y<4;y++){
                somaTotal += matriz[x][y];
            }
        }
        
        System.out.println("                                              ");
        System.out.println("Matriz inserida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matriz[i][j]); 
            }
            System.out.println();
        }
        
        System.out.println("                                              ");
        System.out.println("--------------------------------------------------");
        System.out.println("Soma dos elementos da matriz superior: " + somaTotal);
        
        
    }
}
