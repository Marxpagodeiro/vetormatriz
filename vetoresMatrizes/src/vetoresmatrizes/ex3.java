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
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int vetor[] = new int[10];
        
        for (int i=0;i<10;i++){
            vetor[i]=random.nextInt(200);
        }
        
        System.out.println("Vetor: ");
        System.out.println("-------------------------------------");
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("-------------------------------------");
        System.out.println("Elementos múltiplos de 6:");
        for (int j=0;j<10;j++){
            if (vetor[j] % 6 == 0) {
                System.out.println(vetor[j] + " ");
            }
        }
        System.out.println("-------------------------------------");
    }
}
