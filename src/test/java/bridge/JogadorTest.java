package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveCalcularSalarioComBonificacao() {
        Clube clube = new ClubeFutebol("Clube A");
        Jogador jogador = new Atacante(clube, "Neymar", 100000, 5000);

        jogador.jogar();

        float salarioEsperado = 100000 + 5000;
        assertEquals(salarioEsperado, jogador.calcularSalario(), 0.01f);
    }

    @Test
    void deveCalcularSalarioSemBonificacao() {
        Clube clube = new ClubeFutebol("Clube B");
        Jogador jogador = new Defensor(clube, "Thiago Silva", 80000, 0);

        jogador.jogar();

        float salarioEsperado = 80000;
        assertEquals(salarioEsperado, jogador.calcularSalario(), 0.01f);
    }
}
