import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {
    @Test
    void deveRetornarEmCelsius() {
        Termometro termometro = new Termometro();
        termometro.setMedida(89.6F);

        assertEquals(32, termometro.getCelsius());
    }

    @Test
    void deveRetornarEmFahrenheit() {
        Termometro termometro = new Termometro();
        termometro.setMedida(89.6F);

        assertEquals(89.6F, termometro.getFahrenheit());
    }
}