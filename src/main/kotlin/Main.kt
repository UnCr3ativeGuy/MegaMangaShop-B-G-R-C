
package org.example.montaine.guillaume

import org.example.montaine.guillaume.megamangashop.Boutique
import org.example.montaine.guillaume.megamangashop.Manga

fun main() {
    var exitInput = ""
    val b = Boutique("Espagne")
    b.addMangas("Naruto", 3.99, 19)
    println(b.calculPrix())
}