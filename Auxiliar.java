import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
/**
 * Avaliação 4 
 * @author João Victor Oliveira Terra
 * @version 2021 - 06 - 12
 */
public class Auxiliar{      
    public static boolean sequencia(int[] vetor) //regra da sequencia (5 pontos)
    {
        if(vetor[1]==vetor[0]+1 && vetor[2]==vetor[0]+2)
        {
            return true;
        }
        else 
        {
          return false;
        }
    }
    
    public static boolean trica(int[] vetor) //regra da trinca (5 pontos)
    {
        if (vetor[0] == vetor[1] && vetor[0] == vetor[2])
        {
          return true;
        }
        else 
        {
          return false;
        }
    }
    
    public static boolean trincade1(int[] vetor) //regra da trinca de 1 (3 pontos)
    {
        if (vetor[0] == vetor[1] && vetor[0] == vetor[2] && vetor[0]== 1)
        {
          return true;
        }
        else 
        {
          return false;
        }
    }
    
    public static boolean doisdadosiguais(int[] vetor) //regra de dois dos dados serem iguais (2 pontos)
    {
      if (vetor[0] == vetor[1] || vetor[0] == vetor[2] || vetor[1] == vetor[2])
      {
          return true;
        }
        else 
        {
          return false;
        }
    }
    
}
    
    