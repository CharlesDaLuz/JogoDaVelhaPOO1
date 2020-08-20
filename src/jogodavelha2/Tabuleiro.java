package jogodavelha2;

/**
 * @author Charles da Luz
 * id 2019004447
 * IFC - Camboriú
 * Disciplina de Programação Orientada a Objetos I
 * Profº Rafael de Moura Speroni
 * @version 2.0
 * 
 * Objeto Tabuleiro
 */
public class Tabuleiro {
    private String[][] posicoes = new String[3][3];

    //Construtor inicializando matriz
    public Tabuleiro(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                posicoes[i][j]=" ";
            }
        }
    }
    
    //Exibe o tabuleiro na tela
    public void mostrar(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(" "+posicoes[i][j]+" ");
                if (j<2){
                    System.out.print("|");
                }
            }
            if (i<2)
                System.out.println("\n---+---+---");
        }
        System.out.println();
    }
    
    //Preenche uma posição no tabuleiro
    public void set(int i, int j, String n){
        posicoes[i][j]=n;
    }
    
    //Verifica se uma posição está livre
    public boolean livre(int i, int j){
        return " ".equals(posicoes[i][j]);
    }
    
    //Verifica os casos de vitória
    public boolean vitoria(String n){
        boolean venceu = false;
        int cont = 0;
        //linhas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (posicoes[i][j].equals(n)) {
                    cont++;
                }
            }
            if (cont == 3) {
                venceu = true;
            }
            cont=0;
        }
        //colunas
        if (!venceu) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (posicoes[j][i].equals(n)) {
                        cont++;
                    }
                }
                if (cont == 3) {
                    venceu = true;
                }
                cont = 0;
            }
        }
        //diagonal (\)
        if (!venceu) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        if (posicoes[i][j].equals(n)) {
                            cont++;
                        }
                    }
                }

            }
            if (cont == 3) {
                venceu = true;
            }
        }
        //diagonal (/)
        if (!venceu) {
            cont = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((i + j)==2) {
                        if (posicoes[i][j].equals(n)) {
                            cont++;
                        }
                    }
                }
            }
            if (cont == 3) {
                venceu = true;
            }
        }
        if (venceu) {
            System.out.println("#####################\n# Jogador " + n + " venceu! #\n#####################");
        }
        return venceu;
    }
}
