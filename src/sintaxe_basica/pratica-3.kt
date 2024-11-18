package sintaxe_basica

/*
Faça um programa que acompanhe um set de uma partida de vôlei. O
programa deve ler o código da equipe (A ou B) que ganhou o ponto e
responder quem ganha a partida. O set chega ao final se uma das equipes
chega a 25 pontos e a diferença de pontos entre elas é maior ou igual a dois.
A equipe que conseguir isso é a vencedora do set.
*/

fun main(){
    var pontos_a = 0
    var pontos_b = 0
    var ponto_equipe = ""

    while (true) {
        println("PONTO!")
        print("Equipe pontuadora: ")
        ponto_equipe = readln()

        if (ponto_equipe.equals("a")) {
            pontos_a += 1
        } else if (ponto_equipe.equals("b")) {
            pontos_b += 1
        }

        println("\nPLACAR")
        println("Equipe A: $pontos_a")
        println("Equipe B: $pontos_b\n")

        if ((pontos_a >= 5) && (pontos_a - pontos_b >= 2)) {
            print("EQUIPE A VENCEU!")
            break
        } else if ((pontos_b >= 5) && (pontos_b - pontos_a >= 2)) {
            print("EQUIPE B VENCEU!")
            break
        }
    }
}