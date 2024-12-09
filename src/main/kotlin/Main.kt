
package org.example.montaine.guillaume

import org.example.montaine.guillaume.megamangashop.Commande
import org.example.montaine.guillaume.megamangashop.Manga

fun main() {
    var exitInput = ""
    val c = Commande()
    while(exitInput != "Q" || exitInput != "q") {
        println("Entrez le nom du manga")
        val nomInput = readln()
        println("Entrez le prix du manga")
        val prixInput = readln()
        println("Entrez sa quantite")
        val qteInput = readln()
        val prix = prixInput.toDouble()
        val qte = qteInput.toInt()
        c.addMangas(nomInput, prix, qte)
        println("Si vous avez terminer appuez sur Q")
        exitInput = readln()
    }
    println(c.calculPrix())
}