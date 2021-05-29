fun testaFuncionarios() {
    val rodrigo = Diretor(
        nome = "Rodrigo",
        salario = 2500.00,
        cpf = "111.111.111-11",
        senha = 159159,
        prl = 5000.00
    )

    val fran = Gerente(
        nome = "Fran",
        salario = 5500.00,
        cpf = "222.222.222-22",
        senha = 1234
    )

    val pedro = Diretor(
        nome = "Pedro",
        salario = 10000.00,
        cpf = "333.3333.3333-33",
        senha = 1234,
        prl = 5000.00
    )

    println("Nome: ${rodrigo.nome}")
    println("Salario: ${rodrigo.salario}")
    println("CPF: ${rodrigo.cpf}")
    println("Bonificação ${rodrigo.bonificacao}")

    println()

    println("Nome: ${fran.nome}")
    println("Salario: ${fran.salario}")
    println("CPF: ${fran.cpf}")
    println("Bonificação ${fran.bonificacao}")
    if (fran.autentica(1234)) {
        println("Sim, autenticou")
    } else {
        println("Senha incorreta!")
    }
    println()

    println("Nome: ${pedro.nome}")
    println("Salario: ${pedro.salario}")
    println("CPF: ${pedro.cpf}")
    println("Bonificação ${pedro.bonificacao}")
    println("PRL  ${pedro.prl}")


    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44", salario = 3500.00
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(rodrigo)
    calculadora.registra(pedro)
    calculadora.registra(fran)
    calculadora.registra(maria)

    println()

    println("Total de bonificacao: ${calculadora.total}")
}