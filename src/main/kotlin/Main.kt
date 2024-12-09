
package org.example.montaine.guillaume

import org.example.montaine.guillaume.megamangashop.Commande
import org.example.montaine.guillaume.megamangashop.Manga

fun main() {
    val c = Commande()
    c.addMangas("Manga2", 3.92, 42)
    c.addMangas("Manga3", 4.10, 82)
    println(c.calculPrix())
}