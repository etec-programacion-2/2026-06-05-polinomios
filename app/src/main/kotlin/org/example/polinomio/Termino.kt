package org.example.polinomio

/**
 * Representa un término de un polinomio con un coeficiente y un exponente.
 *
 * @property coeficiente Valor numérico del coeficiente (Double).
 * @property exponente Exponente de la variable (Int, no negativo por convención).
 */
class Termino(val coeficiente: Double, val exponente: Int) {

    /**
     * Representación en cadena del término, e.g. "3x^2", "-5x", "7".
     * Omite el término si el coeficiente es 0.
     */
    override fun toString(): String {
        val coefStr = if (coeficiente == 0.0) ""
        else if (coeficiente.toLong().toDouble() == coeficiente) coeficiente.toLong().toString()
        else coeficiente.toString()

        return when {
            coeficiente == 0.0 -> ""
            exponente == 0     -> coefStr
            exponente == 1     -> "${coefStr}x"
            else               -> "${coefStr}x^$exponente"
        }
    }
}
