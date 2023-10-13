package bridge;

public class Defensor extends Jogador {
    public Defensor(Clube clube, String nome, float salarioBase, float bonificacao) {
        super(clube, nome, salarioBase, bonificacao);
    }

    public void jogar() {
        System.out.println(nome + " é um defensor.");
        clube.contratarJogador(this);
    }
}
