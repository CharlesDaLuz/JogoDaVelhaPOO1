package jogodavelha2;

/**
 * @author Charles da Luz
 * id 2019004447
 * IFC - Camboriú
 * Disciplina de Programação Orientada a Objetos I
 * Profº Rafael de Moura Speroni
 * @version 2.0
 * 
 * Implementação do Jogo da velha orientado à objetos
 * usando linha de comando
 */
public class JogoDaVelha2 {

    public static void main(String[] args) {
        System.out.println("#################\n# Jogo da Velha #\n#################\n");
        
        //instanciação dos objetos
        Tabuleiro tab = new Tabuleiro();
        Jogador[] Player = new Jogador[2];
        Player[0] = new Jogador("X");
        Player[1] = new Jogador("O");
        
        //variáveis auxiliares
        int jogada = 0;
        int atual = 0;
        
        //loop principal
        do {
            jogada++;
            tab.mostrar();
            Player[atual].fazJogada(tab);
            
            //verifica se jogador atual venceu?
            if (jogada>4)
                if (tab.vitoria(Player[atual].getNome())){
                    tab.mostrar();
                    break;
                }
            
            //faz revesamento entre os jogadores
            if (atual==0)
                atual=1;
            else
                atual=0;
            
            //Declara caso de empate
            if (jogada==9)
                    System.out.println("Empate!");
        } while (jogada<9);
    }
}
