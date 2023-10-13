package bridge;

public class ClubeFutebol implements Clube {
    private String nomeClube;

    public ClubeFutebol(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public void contratarJogador(Jogador jogador) {
        System.out.println(jogador.nome + " contratado pelo " + nomeClube);
    }

    public void demitirJogador(Jogador jogador) {
        System.out.println(jogador.nome + " demitido pelo " + nomeClube);
    }
}
