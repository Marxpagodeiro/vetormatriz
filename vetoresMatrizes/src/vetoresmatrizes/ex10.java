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
public class ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[20];
        int numero;
    
        for(int i=0; i<vetor.length; i++){
             numero = random.nextInt(100) + 1;
             for(int j=0; j<vetor.length; j++){
                   if(numero == vetor[j] && j != i){
                         numero = random.nextInt(100) + 1;
                   }else{
                        vetor[i] = numero;
                   }
             }
        }
        
        
        int vetorMaior = vetor[0];
        int posição = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetorMaior) {
                vetorMaior= vetor[i];
                posição = i;
            }
        }
        
        
        System.out.println("Vetor: ");
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("O maior numero do vetor: " +  vetorMaior);
        System.out.println(" A posição do maior numero é :" + posição);
        
    
}
}
