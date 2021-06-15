package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test
    public void testarSomarDoisNumeros() {
        //1 - Prepara
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 13;

        //2 - Executar
        int resultadoobtido = Calc.somarDoisNumeros(num1, num2);
        //3 - Validar
        System.out.println("O resultado esperado é " + resultadoEsperado + " o resultado obtido foi " + resultadoobtido);

        assertEquals(resultadoEsperado,resultadoobtido);
    }
}
