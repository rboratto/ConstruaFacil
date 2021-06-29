package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test(priority = 1)
    public void testarSomarDoisNumeros() {
        //1 - Prepara
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        //2 - Executar
        int resultadoobtido = Calc.somarDoisNumeros(num1, num2);
        //3 - Validar
        System.out.println("O resultado esperado é " + resultadoEsperado + " o resultado obtido foi " + resultadoobtido);

        assertEquals(resultadoEsperado,resultadoobtido);
    }
    @Test(priority = 2)
    public void testarSubtrairDoisNumeros() {
        //1 - Prepara
        int num1 = 7;
        int num2 = 5;
        int resultadoEsperado = 2;

        //2 - Executar
        int resultadoobtido = Calc.subtrairDoisNumeros(num1, num2);
        //3 - Validar
        System.out.println("O resultado esperado é " + resultadoEsperado + " o resultado obtido foi " + resultadoobtido);

        assertEquals(resultadoEsperado,resultadoobtido);
    }
    @Test(priority = 3)
    public void testarMultiplicarDoisNumeros() {
        //1 - Prepara
        int num1 = 7;
        int num2 = 5;
        int resultadoEsperado = 35;

        //2 - Executar
        int resultadoobtido = Calc.multiplicarDoisNumeros(num1, num2);
        //3 - Validar
        System.out.println("O resultado esperado é " + resultadoEsperado + " o resultado obtido foi " + resultadoobtido);

        assertEquals(resultadoEsperado,resultadoobtido);
    }
    @Test(priority = 4)
    public void testarDivisaoDoisNumeros() {
        //1 - Prepara
        int num1 = 20;
        int num2 = 0;
        int resultadoEsperado = 0;

        //2 - Executar
        int resultadoobtido = Calc.dividirDoisNumeros(num1, num2);
        //3 - Validar
        System.out.println("O resultado esperado é " + resultadoEsperado + " o resultado obtido foi " + resultadoobtido);

        assertEquals(resultadoEsperado,resultadoobtido);
    }
}
