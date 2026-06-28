package org.example.polinomio

class Termino(val coeficiente: Double, val exponente: Int) {

    fun esCero(): Boolean = coeficiente == 0.0

    fun tieneMismoExponente(otro: Termino): Boolean = this.exponente == otro.exponente

    fun sumar(otro: Termino): Termino {
        require(tieneMismoExponente(otro)) {
            "No se pueden sumar términos de distinto exponente"
        }
        return Termino(this.coeficiente + otro.coeficiente, this.exponente)
    }

    override fun toString(): String {
        val coefStr = if (coeficiente.toLong().toDouble() == coeficiente) {
            coeficiente.toLong().toString()
        } else {
            coeficiente.toString()
        }
        return when {
            esCero()      -> ""
            exponente == 0 -> coefStr
            exponente == 1 -> "${coefStr}x"
            else           -> "${coefStr}x^$exponente"
        }
    }
}
