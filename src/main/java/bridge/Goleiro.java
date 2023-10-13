package bridge;
public class Goleiro extends Jogador {
    public Goleiro(Clube clube, String nome, float salarioBase, float bonificacao) {
        super(clube, nome, salarioBase, bonificacao);
    }

    public void jogar() {
        System.out.println(nome + " é um goleiro.");
        clube.contratarJogador(this);
    }
}
