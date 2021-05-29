fun testeAutenticacao() {
    val gerente = Gerente(
        nome = "Rodrigo",
        cpf = "111.111.111-11",
        salario = 5000.00,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 10000.00,
        senha = 1234,
        prl = 1000.0
    )

    val cliente = Cliente(
        nome = "Guilherme",
        cpf = "222.222.222-22",
        senha = 1234,

    )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 1234)
    sistema.entrar(diretor, 1234)
    sistema.entrar(cliente, 1234)
}