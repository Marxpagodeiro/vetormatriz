/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresmatrizes;

/**
 *
 * @author 20222TPMI0035
 */
import java.util.Random;

public class teste {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorSoma = new int[5];
        
        // Preenche os vetores com números aleatórios
        for (int i = 0; i < 5; i++) {
            vetor1[i] = random.nextInt(100); // Números aleatórios de 0 a 99
            vetor2[i] = random.nextInt(100); // Números aleatórios de 0 a 99
        }
        
        // Calcula o vetor soma
        for (int i = 0; i < 5; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        
        // Imprime os vetores
        System.out.println("Vetor 1:");
        imprimirVetor(vetor1);
        System.out.println("Vetor 2:");
        imprimirVetor(vetor2);
        System.out.println("Vetor soma:");
        imprimirVetor(vetorSoma);
    }
    
    // Função para imprimir um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
