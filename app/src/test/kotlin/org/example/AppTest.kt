package org.example

import org.example.polinomio.Polinomio
import org.example.polinomio.Termino
import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    @Test
    fun testSumaPolinomios() {
        val p1 = Polinomio(
            listOf(
                Termino(3.0, 2),
                Termino(5.0, 1),
                Termino(-2.0, 0)
            )
        )
        val p2 = Polinomio(
            listOf(
                Termino(7.0, 3),
                Termino(-4.0, 1),
                Termino(1.0, 0)
            )
        )
        val resultado = p1.sumar(p2)
        assertEquals("7x^3 + 3x^2 + 1x - 1", resultado.toString())
    }

    @Test
    fun testTerminoSumar() {
        val t1 = Termino(5.0, 2)
        val t2 = Termino(3.0, 2)
        val suma = t1.sumar(t2)
        assertEquals(8.0, suma.coeficiente)
        assertEquals(2, suma.exponente)
    }

    @Test
    fun testPolinomioVacio() {
        val p = Polinomio(emptyList())
        assertEquals("0", p.toString())
    }
}
