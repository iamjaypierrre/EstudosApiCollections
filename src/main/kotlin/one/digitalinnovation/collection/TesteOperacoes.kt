package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("----------------------")
    //.max nao funciona println("Maior salario: ${salarios.max}")
    //.min nao funciona println("Menor salario: ${salarios.min}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-----------------")
    salariosMaiorQue2500.forEach { println(it) }


}
