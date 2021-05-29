fun testaComportamentoConta() {
    //Usando Label no patâmetos do construtor!
    val contaRodrigo = ContaCorrente(numero = 1000, titular = "Rodrigo")

    contaRodrigo.deposita(2000.0)

    val contaFran = ContaCorrente("Franco", 1001)

    contaFran.deposita(300.0)

    println(contaRodrigo.titular)
    println(contaRodrigo.numero)
    println(contaFran.titular)
    println(contaFran.numero)


    println("Depositando na conta do ${contaRodrigo.titular}")
    contaRodrigo.deposita(50.0)
    println("Saldo da conta Rodrigo é de: ${contaRodrigo.saldo}")

    println("Saque na conta do ${contaRodrigo.titular}")
    contaRodrigo.saca(200.0)
    println("Saldo da conta Rodrigo é de: ${contaRodrigo.saldo}")

    println("Transferencia da conta do ${contaRodrigo.titular} para a conta da ${contaFran.titular}")
    if (contaRodrigo.transfere(50.00, contaFran)) {
        println("Transferencia Ok!")
    } else {
        println("Falha na Transferencia!")
    }
    println("Saldo da conta Fran é de: ${contaFran.saldo}")
}