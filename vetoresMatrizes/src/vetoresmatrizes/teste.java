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
        
        // Inicialização de variáveis
        int[] matriculas = new int[50];
        double[] notas = new double[50];
        double somaNotas = 0;
        int quantidadeNotasAcimaMedia = 0;
        int quantidadeNotasAbaixoMedia = 0;
        double media;
        
        // Gerar notas e matrículas aleatórias
        for (int i = 0; i < 50; i++) {
            matriculas[i] = random.nextInt(2000); // Matrículas de 1000 a 9999
            notas[i] =1 + random.nextDouble(9); // Notas de 0 a 10
            somaNotas += notas[i];
        }
        
        // Calcular a média
        media = somaNotas / 50;
        
        // Contar notas acima e abaixo da média
        for (int i = 0; i < 50; i++) {
            if (notas[i] > media) {
                quantidadeNotasAcimaMedia++;
            } else if (notas[i] < media) {
                quantidadeNotasAbaixoMedia++;
            }
        }
        
        // Encontrar maior e menor notas e suas matrículas
        double maiorNota = notas[0];
        double menorNota = notas[0];
        int matriculaMaiorNota = matriculas[0];
        int matriculaMenorNota = matriculas[0];
        
        for (int i = 1; i < 50; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                matriculaMaiorNota = matriculas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
                matriculaMenorNota = matriculas[i];
            }
        }
        
        
        // Imprimir resultados
        System.out.println("Média das notas: " + String.format("%.2f", media));
        System.out.println("Quantidade de notas acima da média: " + quantidadeNotasAcimaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + quantidadeNotasAbaixoMedia);
        System.out.println("Matrícula do aluno com a maior nota: " + matriculaMaiorNota + " (Nota: " + String.format("%.2f", maiorNota) + ")");
        System.out.println("Matrícula do aluno com a menor nota: " + matriculaMenorNota + " (Nota: " + String.format("%.2f", menorNota) + ")");
    }
}
