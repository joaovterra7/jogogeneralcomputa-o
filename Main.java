import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int contadorJogadas = 1;
        int rodadasGanhasJogador1 = 0;
        int rodadasGanhasJogador2 = 0;

        int[] arrayDados = new int[3];
        int[] arrayDados2 = new int[3];
        Auxiliar jogada = new Auxiliar();

        while (contadorJogadas < 11) {
            System.out.printf("**** RODADA %d ****\n", contadorJogadas);
            System.out.println("");

            int pontuacaoJ1 = 0;
            int pontuacaoMaquina = 0;

            boolean jogador1 = true;
            boolean jogador2 = true;

            int soma1total = 0;
            int soma2total = 0;

            while (jogador1) {

                boolean whileDados = true;
                int usuarioDigita = 0;

                while (whileDados) {
                    System.out.println("Digite 1 para sortear os dados:");
                    usuarioDigita = sc.nextInt();
                    if (usuarioDigita != 1) {
                        System.out.println("Tente novamente.\n");
                        whileDados = true;
                    } else {
                        whileDados = false;
                    }
                }

                jogada.sortearDados(arrayDados);

                System.out.println("----JOGADOR 1----");
                System.out.printf("\nDADO 1: %d \nDADO 2: %d \nDADO 3: %d\n", arrayDados[0], arrayDados[1], arrayDados[2]);

                System.out.println("");

                //soma
                soma1total = (arrayDados[0] + arrayDados[1] + arrayDados[2]);

                //sequencia
                if(jogada.temSequencia(arrayDados)){
                    System.out.println("SEQUÊNCIA: SIM");
                    pontuacaoJ1 += 7;
                }
                else{
                    System.out.println("SEQUÊNCIA: NÃO");
                }

                //trinca
                if(jogada.temTrinca(arrayDados)){
                    System.out.println("TRINCA: SIM");
                    pontuacaoJ1 += 4;
                }
                else{
                    System.out.println("TRINCA: NÃO");
                }

                //trinca de um
                if(jogada.temTrincaDeUm(arrayDados)){
                    System.out.println("TRINCA DE UM: SIM");
                    pontuacaoJ1 += 10;
                }
                else{
                    System.out.println("TRINCA DE UM: NÃO");
                }

                //dois dados iguais
                if(jogada.temDoisDadosIguais(arrayDados)){
                    System.out.println("DOIS DADOS IGUAIS: SIM");
                    pontuacaoJ1 += 2;
                }
                else{
                    System.out.println("DOIS DADOS IGUAIS: NÃO");
                }

                System.out.printf("SOMA = %d\n", soma1total);
                System.out.println("-------------------\n");

                jogador1 = false;
            }

            while (jogador2) {

                jogada.sortearDados(arrayDados2);

                System.out.println("----JOGADOR 2----");
                System.out.printf("\nDADO 1: %d \nDADO 2: %d \nDADO 3: %d\n", arrayDados2[0], arrayDados2[1], arrayDados2[2]);

                System.out.println("");

                //soma
                soma2total = (arrayDados2[0] + arrayDados2[1] + arrayDados2[2]);

                //sequencia
                if(jogada.temSequencia(arrayDados2)){
                    System.out.println("SEQUÊNCIA: SIM");
                    pontuacaoMaquina += 7;
                }
                else{
                    System.out.println("SEQUÊNCIA: NÃO");
                }

                //trinca
                if(jogada.temTrinca(arrayDados2)){
                    System.out.println("TRINCA: SIM");
                    pontuacaoMaquina += 4;
                }
                else{
                    System.out.println("TRINCA: NÃO");
                }

                //trinca de um
                if(jogada.temTrincaDeUm(arrayDados2)){
                    System.out.println("TRINCA DE UM: SIM");
                    pontuacaoMaquina += 10;
                }
                else{
                    System.out.println("TRINCA DE UM: NÃO");
                }

                //dois dados iguais
                if(jogada.temDoisDadosIguais(arrayDados2)){
                    System.out.println("DOIS DADOS IGUAIS: SIM");
                    pontuacaoMaquina += 2;
                }
                else{
                    System.out.println("DOIS DADOS IGUAIS: NÃO");
                }

                System.out.printf("SOMA = %d\n", soma2total);
                System.out.println("-------------------\n");

                jogador2 = false;

            }

            if (soma1total > soma2total) {
                pontuacaoJ1++;
            }
            else if(soma1total == soma2total){
                pontuacaoJ1+=0;
            }
            else{
                pontuacaoMaquina++;
            }

            System.out.println("PONTUAÇÃO J1: " + pontuacaoJ1);
            System.out.println("\nPONTUAÇÃO MÁQUINA: " + pontuacaoMaquina);

            if(pontuacaoJ1>pontuacaoMaquina){
                System.out.println("\nJOGADOR 1 VENCEU ESSA RODADA\n");
                rodadasGanhasJogador1++;
            }
            else if(pontuacaoJ1 == pontuacaoMaquina){
                System.out.println("\nEMPATE NESSA RODADA\n");
            }
            else{
                System.out.println("\nJOGADOR 2 VENCEU ESSA RODADA\n");
                rodadasGanhasJogador2++;
            }


                contadorJogadas += 1;
            }

        System.out.println("----------- RESULTADO FINAL -----------");
        System.out.println("");
        if (rodadasGanhasJogador1 > rodadasGanhasJogador2) {
            System.out.println("JOGADOR 1 VENCEU O JOGO!\n");
            System.out.printf("Rodadas ganhas: %d\n", rodadasGanhasJogador1);
        }
        else if (rodadasGanhasJogador1 == rodadasGanhasJogador2) {
            System.out.println("O JOGO EMPATOU!\n");
        }
        else {
            System.out.println("JOGADOR 2 VENCEU O JOGO!\n");
            System.out.printf("Rodadas ganhas: %d\n", rodadasGanhasJogador2);
        }
    }
}