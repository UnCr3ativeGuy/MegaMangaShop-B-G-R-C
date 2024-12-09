
package org.example.montaine.guillaume.tests

import io.kotest.core.spec.style.BehaviorSpec

class MontaineGuillaumeTest: BehaviorSpec({

    context("je veux vérifier les reductions par état et selon les montants") {

    }
    context("Je veux verifier la TVA quand le client selectionne la france") {
        given("Le client selection le pays"){
            val ticket = TicketDeCaisse()

            When("Le client selection son pays de résidence la France"){
                var command = ticket.selectionPays("France")
            }
            then("L'affichage de la TVA du pays correspondante"){
                command shouldBe 0.2
            }
        }
    }
    context("Je veux verifier la TVA quand le client selectionne l'espagne") {
        given("Le client selection le pays"){
            val ticket = TicketDeCaisse()

            When("Le client selection son pays de résidence Espagne"){
                var command = ticket.selectionPays("Espagne")
            }
            then("L'affichage de la TVA du pays correspondante"){
                command shouldBe 0.182
            }
        }
    }


})