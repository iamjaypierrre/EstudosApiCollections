package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("------------ LIST -------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("--------- SET ------------")
    val funcionarioset = mutableSetOf(joao)
    //funcionarioset.forEach { println(it) }

    funcionarioset.add(pedro)
    funcionarioset.add(maria)
    funcionarioset.forEach { println(it) }

    println("---------------------")
    funcionarioset.remove(maria)
    funcionarioset.forEach { println(it) }







}