package org.example.montaine.guillaume.megamangashop

class Manga(private var nom: String, private var prix: Double) {
    public fun getNom(): String{
        return nom
    }

    public fun getPrix(): Double{
        return prix
    }
}