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
public class ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        int vetorMenor = vetor[0];
        int posiçãoMaior = 0;
        int posiçãoMenor = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetorMaior) {
                vetorMaior= vetor[i];
                posiçãoMaior = i+1;
            }else if (vetor[i] < vetorMenor) {
                vetorMenor = vetor[i];
                posiçãoMenor = i+1;
            }
        }
        
        
        int dif =vetorMaior - vetorMenor;
        
        System.out.println("Vetor: ");
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("A diferença entre o maior numero do vetor " +  vetorMaior + " e o menor numero do vetor " +  vetorMenor + " é: " + dif);
        System.out.println(" A posição do maior numero é :" + posiçãoMaior);
        System.out.println(" A posição do menor numero é :" + posiçãoMenor);
    
    }
    
    }

