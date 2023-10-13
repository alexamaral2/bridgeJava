package bridge;

public abstract class Jogador {
    protected Clube clube;
    protected String nome;
    protected float salarioBase;
    protected float bonificacao;

    public Jogador(Clube clube, String nome, float salarioBase, float bonificacao) {
        this.clube = clube;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonificacao = bonificacao;
    }

    public abstract void jogar();
    public float calcularSalario() {
        return salarioBase + bonificacao;
    }
}
