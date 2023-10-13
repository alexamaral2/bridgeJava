package bridge;

public class MeioCampo extends Jogador {
    public MeioCampo(Clube clube, String nome, float salarioBase, float bonificacao) {
        super(clube, nome, salarioBase, bonificacao);
    }

    public void jogar() {
        System.out.println(nome + " é um meio-campista.");
        clube.contratarJogador(this);
    }
}

