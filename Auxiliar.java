import java.io.IOException;
import java.util.Random;

public class Auxiliar {

    public void sortearDados (int[] dados){

        for(int a = 0; a < dados.length; a++){
            dados[a] = (int) (1 + Math.random() * 6);
        }

    }


    //sequencia [VALE 7 PONTOS]
    public boolean temSequencia (int[] dados){

        if (dados[1] == dados[0] + 1 && dados[2] == dados[0] + 2) {
            return true;
        } else {
            return false;
        }
    }

    //trinca [VALE 4 PONTOS]
    public boolean temTrinca (int[]dados){

        if(dados[0] == dados[1] && dados[0] == dados[2] && dados[0] != 1){
            return true;
        }
        else{
            return false;
        }
    }

    //trincaDeUm [VALE 10]
    public boolean temTrincaDeUm (int[]dados){

        if(dados[0] == dados[1] && dados[0] == dados[2] && dados[0] == 1){
            return true;
        }
        else{
            return false;
        }
    }

    //doisDadosIguais [VALE 2 PONTOS]
    public boolean temDoisDadosIguais(int[]dados){
        if(dados[0] == dados[1] || dados[0] == dados[2] || dados[1] == dados[2]){
            return true;
        }
        else{
            return false;
        }
    }


}
