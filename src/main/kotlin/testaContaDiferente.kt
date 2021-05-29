fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Rodrigo",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Pedro",
        numero = 2000
    )

    contaCorrente.deposita(valor = 1000.00)
    contaPoupanca.deposita(valor = 1000.00)

    println("Saldo na CC: ${contaCorrente.saldo}")
    println("Saldo na CP: ${contaPoupanca.saldo}")

    contaCorrente.saca(valor = 100.00)
    contaPoupanca.saca(valor = 100.00)
    println()

    println("Saldo na CC: ${contaCorrente.saldo}")
    println("Saldo na CP: ${contaPoupanca.saldo}")

    contaCorrente.transfere(valor = 500.00, destino = contaPoupanca)

    println()
    println("Saldo na CC - Pós Transferencia: ${contaCorrente.saldo}")
    println("Saldo na CP - Pós Transferencia: ${contaPoupanca.saldo}")
}