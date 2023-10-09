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
public class ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        double[][] notas = new double[30][5];
        double[] medias = new double[30];
        double mediaTurma = 0;

        
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 5; j++) {
                notas[i][j] = random.nextDouble() * 7 + 4; 
            }
        }
        
        for (int i = 0; i < 30; i++) {
            double soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 5;
            mediaTurma += medias[i];
        }

        mediaTurma /= 30;
        

        System.out.println("                                              ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Núm. Aluno             Notas                         Média Aluno");
        for (int i = 0; i < 30; i++) {
            System.out.print((i + 1) + "     |");
            for (int j = 0; j < 5; j++) {
                System.out.printf("   |%.2f ", notas[i][j]);
            }
            System.out.printf("              |%.2f", medias[i]);
            System.out.println();
        }

        System.out.println("                                              ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Média geral da turma: " + mediaTurma);
        System.out.println("                                              ");
        System.out.println("--------------------------------------------------");
    }
}


