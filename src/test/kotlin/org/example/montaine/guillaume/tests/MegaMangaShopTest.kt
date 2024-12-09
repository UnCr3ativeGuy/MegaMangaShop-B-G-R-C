package org.example.montaine.guillaume.tests

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.example.montaine.guillaume.megamangashop.Boutique

class MegaMangaShopTest: BehaviorSpec ({

    context("J'ai une commande de 19 mangas à 3.99 en direction de l'Espagne") {
        given("Le client selection le pays") {
            val boutique = Boutique("Espagne")

            When("Le client ajoute les mangas") {
                boutique.addMangas("Naruto", 3.99, 19)
            }

            then("Le prix est de 89.61€") {
                boutique.calculPrix() shouldBe 89.61
            }
        }
    }
})