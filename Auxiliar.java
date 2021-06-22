import java.io.IOException;
import java.util.Random;                  // imports
import java.util.Scanner;

/** 
   DESCRIÇÃO:
 * @author João Victor Oliveira Terra 
 * @version 2021-06-14
 */

public class Auxiliar    //Abertura da classe auxiliar
{   
    public void instrucoes()   //Abertura do programa
    {
      System.out.println("SEJA BEM VINDO AO GENERAL!");  
      System.out.println(""); 
      System.out.println("Instruções:"); 
      System.out.println(""); 
      System.out.println("- O jogo criado possui 10 rodadas para dois jogadores, sendo um a máquina. No inicio,"); 
      System.out.println("você deve digitar 1 para gerar seus 3 números nos dados, logo os da máquina serão"); 
      System.out.println("gerados também. No final, o jogador que vencer mais rodadas, a partir de possíveis "); 
      System.out.println("combinações, vence o jogo."); 
      System.out.println("");
      System.out.println("Possíveis combinações:"); 
      System.out.println(""); 
      System.out.println("- Soma dos dados: O jogador que tiver a maior soma entre os 3 dados ganha 1 ponto;");
      System.out.println(""); 
      System.out.println("- Dois dados iguais: Caso o jogador tire dois dados iguais, ele recebe 2 pontos;"); 
      System.out.println(""); 
      System.out.println("- Trinca: Caso hajam três dados de mesmo valor na jogada, são marcados 4 pontos;"); 
      System.out.println(""); 
      System.out.println("- Sequência: Caso haja uma sequência entre os dados da jogada, são marcados 7 pontos;"); 
      System.out.println(""); 
      System.out.println("- Trinca de 1: Caso hajam três dados de valor 1, são marcados 10 pontos."); 
      System.out.println(""); 
    }
    
    public void sortearDados (int[] dados) //Método sem retorno que sorteia os valores dos dados e insere em um array de inteiros 
    {
        for(int a = 0; a < dados.length; a++)
        {
            dados[a] = (int) (1 + Math.random() * 6);
        }
    }

    //sequencia [VALE 7 PONTOS] 
    public boolean temSequencia (int[] dados) //Retorna um boolean tendo como parâmetro um array de inteiros
    {
        if (dados[1] == dados[0] + 1 && dados[2] == dados[0] + 2) 
        {
            return true;
        } 
        else 
            {
            return false;
            }
    }

    //trinca [VALE 4 PONTOS]
    public boolean temTrinca (int[]dados)//Retorna um boolean tendo como parâmetro um array de inteiros
    {
        if(dados[0] == dados[1] && dados[0] == dados[2] && dados[0] != 1)
        {
            return true;
        }
        else
            {
            return false;
            }
    }

    //trincaDeUm [VALE 10]
    public boolean temTrincaDeUm (int[]dados) //Retorna um boolean tendo como parâmetro um array de inteiros
    {
        if(dados[0] == dados[1] && dados[0] == dados[2] && dados[0] == 1)
        {
            return true;
        }
        else
            {
            return false;
            }
    }

    //doisDadosIguais [VALE 2 PONTOS]
    public boolean temDoisDadosIguais(int[]dados) //Retorna um boolean tendo como parâmetro um array de inteiros
    {
        if(dados[0] == dados[1] || dados[0] == dados[2] || dados[1] == dados[2])
        {
            return true;
        }
        else
            {
            return false;
            }
    }
}
