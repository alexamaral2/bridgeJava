package bridge;

public class Atacante extends Jogador {
    public Atacante(Clube clube, String nome, float salarioBase, float bonificacao) {
        super(clube, nome, salarioBase, bonificacao);
    }

    public void jogar() {
        System.out.println(nome + " é um atacante.");
        clube.contratarJogador(this);
    }
}
