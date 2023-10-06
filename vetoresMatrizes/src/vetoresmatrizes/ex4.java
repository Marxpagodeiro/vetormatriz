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
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        double notas[] = new double[50];
        int matricula[] = new int[50];
        double somaNotas = 0;
        int NotasAcimaMedia = 0;
        int NotasAbaixoMedia = 0;
        double media;
        
        for (int i = 0; i < 50; i++) {
            matricula[i] = random.nextInt(2000); 
            notas[i] = 1 + random.nextDouble(9); 
            somaNotas += notas[i];
        }
        
        
        media = somaNotas / 50;
        
        
        for (int i = 0; i < 50; i++) {
            if (notas[i] > media) {
                NotasAcimaMedia++;
            } else if (notas[i] < media) {
                NotasAbaixoMedia++;
            }
        }
        
        // maior e menor notas e suas matrículas
        double maiorNota = notas[0];
        double menorNota = notas[0];
        int matriculaMaiorNota = matricula[0];
        int matriculaMenorNota = matricula[0];
        
        for (int i = 1; i < 50; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                matriculaMaiorNota = matricula[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
                matriculaMenorNota = matricula[i];
            }
        }
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Média das notas: " + String.format("%.2f", media));
        System.out.println("-------------------------------------------------");
        System.out.println("Quantidade de notas acima da média: " + NotasAcimaMedia);
        System.out.println("-------------------------------------------------");
        System.out.println("Quantidade de notas abaixo da média: " + NotasAbaixoMedia);
        System.out.println("-------------------------------------------------");
        System.out.println("Matrícula do aluno com a maior nota: " + matriculaMaiorNota + " (Nota: " + String.format("%.2f", maiorNota) + ")");
        System.out.println("-------------------------------------------------");
        System.out.println("Matrícula do aluno com a menor nota: " + matriculaMenorNota + " (Nota: " + String.format("%.2f", menorNota) + ")");
    }
}

