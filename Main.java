import java.io.IOException;
import java.util.Random;                  // imports
import java.util.Scanner;

/**
  DESCRIÇÃO:
 * O programa criado a seguir trata-se da reprodução do jogo general utilizando a linguagem Java. 
 * @author João Victor Oliveira Terra 
 * @version 2021-06-14
 */

public class Main    //Abertura da classe main
{
    public static void main(String[] args)    //Método main
    {
        // Scanner e a definições das variáveis 
        Scanner sc = new Scanner(System.in);
        int contadorJogadas = 1;
        int rodadasGanhasJogador1 = 0;
        int rodadasGanhasJogador2 = 0;
                                                        
        // Array's e objeto da classe auxiliar
        int[] arrayDados = new int[3];
        int[] arrayDados2 = new int[3];
        Auxiliar jogada = new Auxiliar();
        
        jogada.instrucoes();
            
        while (contadorJogadas < 11) //Repetições do programa até a rodada desejada
        {
            System.out.printf("**** RODADA %d ****\n", contadorJogadas);
            System.out.println("");

            int pontuacaoJ1 = 0;
            int pontuacaoMaquina = 0;

            boolean jogador1 = true;
            boolean jogador2 = true;

            int soma1total = 0;
            int soma2total = 0;

            while (jogador1 == true)  //vez do jogador
            {
                boolean whileDados = true;
                int usuarioDigita = 0;

                while (whileDados == true) 
                {
                    System.out.println("Digite 1 para sortear os dados:");
                    usuarioDigita = sc.nextInt();
                    if (usuarioDigita != 1) 
                    {
                        System.out.println("Tente novamente.\n");
                        whileDados = true;  
                    } else 
                    {
                        whileDados = false; // condição para sair do laço para o sorteio dos dados
                    }
                }

                jogada.sortearDados(arrayDados);  // sorteio dos dados passando um array como parâmetro para o método

                System.out.println("----JOGADOR----");
                System.out.printf("\nDADO 1: %d \nDADO 2: %d \nDADO 3: %d\n", arrayDados[0], arrayDados[1], arrayDados[2]);

                System.out.println("");

                //soma
                soma1total = (arrayDados[0] + arrayDados[1] + arrayDados[2]);

                //sequencia
                if(jogada.temSequencia(arrayDados))
                {
                    System.out.println("SEQUÊNCIA: SIM");
                    pontuacaoJ1 += 7;
                }
                else
                    {
                    System.out.println("SEQUÊNCIA: NÃO");
                    }

                //trinca
                if(jogada.temTrinca(arrayDados))
                {
                    System.out.println("TRINCA: SIM");
                    pontuacaoJ1 += 4;
                }
                else
                    {
                    System.out.println("TRINCA: NÃO");
                    }

                //trinca de um
                if(jogada.temTrincaDeUm(arrayDados))
                {
                    System.out.println("TRINCA DE UM: SIM");
                    pontuacaoJ1 += 10;
                }
                else
                    {
                    System.out.println("TRINCA DE UM: NÃO");
                    }

                //dois dados iguais
                if(jogada.temDoisDadosIguais(arrayDados))
                {
                    System.out.println("DOIS DADOS IGUAIS: SIM");
                    pontuacaoJ1 += 2;
                }
                else
                    {
                    System.out.println("DOIS DADOS IGUAIS: NÃO");
                    }

                System.out.printf("SOMA = %d\n", soma1total);
                System.out.println("-------------------\n");

                jogador1 = false;
            }

            while (jogador2 == true) // vez da máquina
            {
                jogada.sortearDados(arrayDados2);

                System.out.println("----MÁQUINA----");
                System.out.printf("\nDADO 1: %d \nDADO 2: %d \nDADO 3: %d\n", arrayDados2[0], arrayDados2[1], arrayDados2[2]);

                System.out.println("");

                //soma
                soma2total = (arrayDados2[0] + arrayDados2[1] + arrayDados2[2]);

                //sequencia
                if(jogada.temSequencia(arrayDados2))
                {
                    System.out.println("SEQUÊNCIA: SIM");
                    pontuacaoMaquina += 7;
                }
                else
                    {
                    System.out.println("SEQUÊNCIA: NÃO");
                    }

                //trinca
                if(jogada.temTrinca(arrayDados2))
                {
                    System.out.println("TRINCA: SIM");
                    pontuacaoMaquina += 4;
                }
                else
                    {
                    System.out.println("TRINCA: NÃO");
                    }

                //trinca de um
                if(jogada.temTrincaDeUm(arrayDados2))
                {
                    System.out.println("TRINCA DE UM: SIM");
                    pontuacaoMaquina += 10;
                }
                else
                    {
                    System.out.println("TRINCA DE UM: NÃO");
                    }

                //dois dados iguais
                if(jogada.temDoisDadosIguais(arrayDados2))
                {
                    System.out.println("DOIS DADOS IGUAIS: SIM");
                    pontuacaoMaquina += 2;
                }
                else
                    {
                    System.out.println("DOIS DADOS IGUAIS: NÃO");
                    }

                System.out.printf("SOMA = %d\n", soma2total);
                System.out.println("-------------------\n");

                jogador2 = false;

            }

            if (soma1total > soma2total) // pontuação das somas (jogada soma dos dados)
            {
                pontuacaoJ1++;
            }
            else if(soma1total == soma2total)
                {
                pontuacaoJ1+=0;
                }
            else
                {
                pontuacaoMaquina++;
                }

            System.out.println("PONTUAÇÃO JOGADOR: " + pontuacaoJ1);
            System.out.println("\nPONTUAÇÃO MÁQUINA: " + pontuacaoMaquina);

            if(pontuacaoJ1>pontuacaoMaquina) //mostra quem ganhou a partir da comparação das pontuações
            {
                System.out.println("\nJOGADOR 1 VENCEU ESSA RODADA\n");
                rodadasGanhasJogador1++;
            }
            else if(pontuacaoJ1 == pontuacaoMaquina)
                {
                System.out.println("\nEMPATE NESSA RODADA\n");
            }
            else
                {
                System.out.println("\nA MÁQUINA VENCEU ESSA RODADA\n");
                rodadasGanhasJogador2++;
            }


                contadorJogadas += 1; //finaliza a rodada adicionando mais um na contagem do while das rodadas
            }

        System.out.println("----------- RESULTADO FINAL -----------");
        System.out.println("");
        if (rodadasGanhasJogador1 > rodadasGanhasJogador2) //comparação das rodadas ganhas e apresentação do vencedor
        {
            System.out.println("JOGADOR VENCEU O JOGO!\n");
            System.out.printf("Rodadas ganhas: %d\n", rodadasGanhasJogador1);
        }
        else if (rodadasGanhasJogador1 == rodadasGanhasJogador2) 
            {
            System.out.println("O JOGO EMPATOU!\n");
            }
        else 
            {
            System.out.println("A MÁQUINA VENCEU O JOGO!\n");
            System.out.printf("Rodadas ganhas: %d\n", rodadasGanhasJogador2);
            }
    }
}