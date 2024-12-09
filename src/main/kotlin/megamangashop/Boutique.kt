package org.example.montaine.guillaume.megamangashop

enum class Pays(){FRANCE, ESPAGNE, ROYAUME-UNI, ALLEMAGNE, BELGIQUE}

data class Boutique(val Pays: String) {
    fun selectionResidence(Pays: String) : float{
        return when(Pays){
            "France"->0.2
            "Espagne"->0.182
            "Allemagne"->0.156
            "Royaume-Uni"-> 0.228
            "Belgique" -> 0.17
        }
    }
}

