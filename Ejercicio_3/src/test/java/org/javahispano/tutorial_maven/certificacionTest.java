package org.javahispano.tutorial_maven;

import org.junit.Test;

public class certificacionTest {
	@Test
    public int[] calculo_certificacion(int[] datos, int[][] tabla) {
        int[] resultados = new int[datos.length];
        int j = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] >= 0 && datos[i] < 10)
                j = 0;
            else if (datos[i] >= 10 && datos[i] < 35)
                j = 1;
            else if (datos[i] >= 35 && datos[i] < 50)
                j = 2;
            else if (datos[i] >= 50 && datos[i] < 70)
                j = 3;
            else if (datos[i] >= 70 && datos[i] < 90)
                j = 4;
            else if (datos[i] >= 90 && datos[i] < 100)
                j = 5;
            resultados[i] = tabla[j][i];
        }
        return resultados;
    }
	@Test
    public int calculo_minimo(int[] datos) {
        int aux = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (aux > datos[i]) {
                aux = datos[i];
            }
        }
        return aux;
    }

}
