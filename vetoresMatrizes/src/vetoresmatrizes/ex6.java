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
public class ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int vetor[] = new int[20];
        
        for (int i=0;i<20;i++){
            vetor[i]=random.nextInt(100);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Vetor antes da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[19 - i];
            vetor[19 - i] = temp;
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Vetor após a troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("-------------------------------------------------");
        
    }
}
