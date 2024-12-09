package org.example.montaine.guillaume.megamangashop

data class Boutique(val pays: String) {
    fun getTVA() : Double{
        return when(pays){
            "France"->0.2
            "Espagne"->0.182
            "Allemagne"->0.156
            "Royaume-Uni"-> 0.228
            "Belgique" -> 0.17
            else -> 0.0
        }
    }

    fun calculerPrixTTC(prix:Double):Double {
        val tva = getTVA()
        return prix * (tva+1)
    }
}

