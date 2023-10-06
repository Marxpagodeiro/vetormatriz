/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package vetoresmatrizes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int vetor[] = new int[10];
        int m ;
        int posição=0;
        int verifica=0;
        
        System.out.print("Digite um valor para encontrar no vetor(entre 0 e 30): ");
        m = scanner.nextInt();
        
        for (int i=0;i<10;i++){
            vetor[i]=random.nextInt(30);
        }
        
        for (int j=0;j<vetor.length;j++){
            if (vetor[j] == m){
                posição=j;
                verifica =1;
            }
        }
        for (int h=0;h<vetor.length;h++){
           System.out.println(vetor[h]); 
        }
        if (verifica == 1){
                System.out.println("O valor " + m + " que esta na posição " + (posição+1) + " do vetor"  );
            }
            else{
                System.out.println("O valor " + m + " não esta no vetor");
            }
        
        
    }
}
