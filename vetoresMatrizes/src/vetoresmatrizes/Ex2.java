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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[10];
        int vetorMenor[] = new int [10];
        for (int i=0;i<10;i++){
            vetor[i]=random.nextInt(200);
        }
        for(int j =0;j<vetor.length;j++){
            if(vetor[j]>vetor[j+1]){
                vetorMenor[j]=vetor[j];
            }
        }
        
        System.out.println("Vetor Menor");
        for (int h = 0; h < vetorMenor.length; h++) {
            System.out.println(vetorMenor[h]);
        }
    }
    
}
