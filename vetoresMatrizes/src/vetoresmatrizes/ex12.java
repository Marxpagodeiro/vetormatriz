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
public class ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int matriz[][] = new int[3][3];
        
        for (int i =0;i<3;i++){
            for (int j =0;j<3;j++){
                matriz[i][j]= random.nextInt(20);
            }
        }
        
        // somalinha 3
        int somaLinha3 =0;
        for(int h =0;h<3;h++){
            somaLinha3 += matriz[2][h];
        }
        
        // somaColuna 2
        int somaCol2 =0;
        for(int g =0;g<3;g++){
            somaCol2 += matriz[g][1];
        }
        
        // Calcula a soma da diagonal principal
        int somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];

        // Calcula a soma da diagonal secundária
        int somaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
        
        // soma todos os elementos da matriz 
        int somaTotal =0;
        for (int x =0;x<3;x++){
            for (int y =0;y<3;y++){
                somaTotal += matriz[x][y];
            }
        }
        
        System.out.println("Soma da linha 3: " + somaLinha3);
        System.out.println("Soma da coluna 2: " + somaCol2);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        System.out.println("Soma de todos os elementos da matriz: " + somaTotal);
        

    }
}
