import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AleatorioImparTest {

    AleatorioImpar a = new AleatorioImpar();



    @Test
    void PrimeroNegativo() {

        assertEquals(a.aleatorioImpar(-10,10), -1);

    }

    @Test
    void SegundoNegativo() {

        assertEquals(a.aleatorioImpar(-30,-20), -1);

    }

    @Test
    void PrimeroMayor() { // diferencia menor que 10 unidades

        assertEquals(a.aleatorioImpar(0,9), -1);

    }
    @Test
    void LosDosBien() {

        int x = 0;

        assertEquals(x =a.aleatorioImpar(0,10), x> 0 && x<10 );

    }


}