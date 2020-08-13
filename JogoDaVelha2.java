package jogodavelha2;

/**
 *
 * @author Charles da Luz
 */
public class JogoDaVelha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("#################\n# Jogo da Velha #\n#################\n");
        Tabuleiro tab = new Tabuleiro();
        Jogador[] Player = new Jogador[2];
        Player[0] = new Jogador("X");
        Player[1] = new Jogador("O");
        int jogada = 0;
        int atual = 0;
        do {
            jogada++;
            tab.mostrar();
            Player[atual].jogada(tab);
            
            //venceu?
            if (jogada>4)
                if (tab.vitoria(Player[atual].getNome())){
                    tab.mostrar();
                    break;
                }
            
            //revesamento
            if (atual==0)
                atual=1;
            else
                atual=0;
            
            //empate
            if (jogada==9)
                    System.out.println("Empate!");
        } while (jogada<9);
    }
    
}
