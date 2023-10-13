package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GoleiroTest {
    @Test
    void deveRetornarSalarioGoleiroSemBonificacao() {
        Clube clube = new ClubeFutebol("Clube D");
        Goleiro goleiro = new Goleiro(clube, "Alisson", 50000.0f, 0.0f); //

        float salarioEsperado = 50000.0f;

        assertEquals(salarioEsperado, goleiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioGoleiroComBonificacao() {
        Clube clube = new ClubeFutebol("Clube D");
        Goleiro goleiro = new Goleiro(clube, "Alisson", 50000.0f, 10000.0f);

        float salarioEsperado = 60000.0f;

        assertEquals(salarioEsperado, goleiro.calcularSalario(), 0.01f);
    }
}
