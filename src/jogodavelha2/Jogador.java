package jogodavelha2;

import java.util.Scanner;
/**
 * @author Charles da Luz
 * id 2019004447
 * IFC - Camboriú
 * Disciplina de Programação Orientada a Objetos I
 * Profº Rafael de Moura Speroni
 * @version 2.0
 * 
 * Objeto Jogador
 */
public class Jogador {
    private String Nome;
    
    //Construtor inicializa variável
    public Jogador(String nome){
        this.Nome=nome;
    }
    
    //Retorna o nome
    public String getNome(){
        return this.Nome;
    }
    
    //Procedimento de jogada
    public void fazJogada(Tabuleiro tab){
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
