import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
/**
 * Escreva a descrição da classe MainApp aqui.
 * 
 * @author João Victor Oliveira Terra 
 * @version 2021 - 06 - 12
 */
public class MainApp
{
    public static void main(String[] args)
    {
        int vetor[] = new int[3];
        int pontos1 = 0;
        int pontos2 = 0;
        int i;
        int dado;
        String jogador;
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        jogador = "Jogador 1";
        
        while(jogador == "Jogador 1")
        {
            for(i=0 ; i<2 ; i+=1)
            {
                dado = (int)(Math.random() * 6);
                vetor[i] = dado;
            }
            
            System.out.printf("Dado 1: ", vetor[0], " Dado 2: ", vetor[1], "Dado 3: ", vetor[2]);
        }
    }
}