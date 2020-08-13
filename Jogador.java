package jogodavelha2;

import java.util.Scanner;
/**
 *
 * @author Charles da Luz
 */
public class Jogador {
    private String Nome;
    
    public Jogador(String nome){
        this.Nome=nome;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void jogada(Tabuleiro tab){
        int linha, coluna;
        boolean erro;
        Scanner ler = new Scanner(System.in);
        
        do {
        System.out.println("Jogador "+this.Nome+" escolha posição.");
        System.out.print("Linha:");
        linha = ler.nextInt();
        System.out.print("Coluna:");
        coluna = ler.nextInt();
        if (tab.livre(linha, coluna)){
            tab.set(linha, coluna, this.Nome);
            erro=false;
        }
        else{
            erro=true;
            System.out.println("\nTente novamente!");
        }
        } while (erro);
    }
}
