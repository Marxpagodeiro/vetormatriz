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
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int vetorA[] = new int[5];
        int vetorB[] = new int[10];
        int vetorC[] = new int[15];
        
        for (int i=0;i<5;i++){
            vetorA[i]=random.nextInt(100);
        }
        
        for (int i=0;i<10;i++){
            vetorB[i]=random.nextInt(100);
        }
        
        
        for(int j=0;j<5;j++){
            vetorC[j]=vetorA[j];
            }
        for(int h=0;h<10;h++){
             vetorC[h+5]=vetorB[h];
            }
        
        System.out.println("VetorA: ");
        for (int i=0;i<vetorA.length;i++){
            System.out.println(vetorA[i]);
        }
        
        System.out.println("                                              ");
        System.out.println("                                              ");
        System.out.println("VetorB: ");
        for (int i=0;i<vetorB.length;i++){
            System.out.println(vetorB[i]);
        }
        System.out.println("                                              ");
        
        System.out.println("VetorC que é a união do vetorA e do VetorB: ");
        System.out.println("-------------------------------------");
        for (int i=0;i<vetorC.length;i++){
            System.out.println(vetorC[i]);
        }
        
        
        
    }
}
