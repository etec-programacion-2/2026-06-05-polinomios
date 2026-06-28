package org.example.polinomio

class Polinomio(val terminos: List<Termino>) {

    fun sumar(otro: Polinomio): Polinomio {
        val resultado = mutableListOf<Termino>()

        for (t in this.terminos) {
            if (!t.esCero()) {
                resultado.add(t)
            }
        }

        for (t in otro.terminos) {
            if (t.esCero()) continue

            var encontrado = false
            var i = 0
            while (i < resultado.size && !encontrado) {
                if (resultado[i].tieneMismoExponente(t)) {
                    val suma = resultado[i].sumar(t)
                    if (!suma.esCero()) {
                        resultado[i] = suma
                    } else {
                        resultado.removeAt(i)
                    }
                    encontrado = true
                }
                i++
            }

            if (!encontrado) {
                resultado.add(t)
            }
        }

        return Polinomio(resultado)
    }

    override fun toString(): String {
        if (terminos.isEmpty()) return "0"

        val noNulos = mutableListOf<Termino>()
        for (t in terminos) {
            if (!t.esCero()) {
                noNulos.add(t)
            }
        }

        if (noNulos.isEmpty()) return "0"

        for (i in noNulos.indices) {
            for (j in i + 1 until noNulos.size) {
                if (noNulos[j].exponente > noNulos[i].exponente) {
                    val temp = noNulos[i]
                    noNulos[i] = noNulos[j]
                    noNulos[j] = temp
                }
            }
        }

        var cadena = ""
        for (i in noNulos.indices) {
            if (i > 0) {
                cadena += " + "
            }
            cadena += noNulos[i].toString()
        }

        return cadena.replace(" + -", " - ")
    }
}
