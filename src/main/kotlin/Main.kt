
package org.example.montaine.guillaume

import org.example.montaine.guillaume.megamangashop.Boutique
import org.example.montaine.guillaume.megamangashop.Manga

fun main() {
    var exitInput = ""
    val b = Boutique("")
    while(exitInput != "Q" || exitInput != "q") {
        println("Entrez un pays de livraison")
        val paysInput = readln()
        val b = Boutique(paysInput)
        println("Entrez le nom du manga")
        val nomInput = readln()
        println("Entrez le prix du manga")
        val prixInput = readln()
        println("Entrez sa quantite")
        val qteInput = readln()
        val prix = prixInput.toDouble()
        val qte = qteInput.toInt()
        b.addMangas(nomInput, prix, qte)
        println("Si vous avez terminer appuez sur Q")
        exitInput = readln()
    }
    println(b.calculPrix())
}