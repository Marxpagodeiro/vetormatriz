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
public class ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int vetor[] = new int[40];
        
        for (int i=0;i<vetor.length;i++){
            vetor[i]=random.nextInt(20);
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println("                                              ");
        
        for (int i = 0; i < 39; i++) {
            vetor[i + 1] += vetor[i];
        }
        
        System.out.println("                                              ");
        System.out.println("-------------------------------------------------");
        System.out.println("Vetor das somas:");
        for (int i = 0; i <vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println("-------------------------------------------------");
        
    }
}
