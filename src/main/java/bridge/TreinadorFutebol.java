package bridge;

public class TreinadorFutebol implements Treinador {
    private String nomeTreinador;

    public TreinadorFutebol(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public void treinarTime() {
        System.out.println(nomeTreinador + " está treinando o time de futebol.");
    }
}
