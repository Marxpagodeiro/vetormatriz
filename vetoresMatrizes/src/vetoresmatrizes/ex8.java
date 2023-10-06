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
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[12];
        int x;
        int y;
        int soma;
        
        
        System.out.print("Digite a posição x no vetor:(entre 0 e 12): ");
        x = scanner.nextInt();
        
        System.out.print("Digite a posição y no vetor: (entre 0 e 12): ");
        y = scanner.nextInt();
        
        for (int i=0;i<12;i++){
            vetor[i]=random.nextInt(100);
        }
        
        soma = vetor[x]+vetor[y];
        
        System.out.println("Vetor: ");
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("A soma dos valor na posição " + x + " que é " + vetor[x] + " e vetor na posição " + y + " que é " + vetor[y] + " é " + soma);
        
    }
}
