/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresmatrizes;
import java.util.Random;

/**
 *
 * @author 20222TPMI0035
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int a[]= new int[5];
        int b[]= new int[5];
        int soma[] = new int[5];
        for (int i = 0;i<5;i++){
            a[i]=random.nextInt(100);
            b[i]=random.nextInt(100);
        }
        for(int j=0;j<5;j++){
            soma[j]=a[j]+b[j];
        }
        // Imprime os vetores
        System.out.println("-------------");
        System.out.println("Vetor A:");
        for (int h = 0; h < a.length; h++) {
            System.out.println(a[h]);
        }
        System.out.println("-------------");
        System.out.println("Vetor B:");
        for (int q = 0; q < b.length; q++) {
            System.out.println(b[q]);
        }
        System.out.println("-------------");
        System.out.println("Vetor Soma:");
        for (int s = 0; s < soma.length; s++) {
            System.out.println(soma[s]);
        }
}
}
      

    

