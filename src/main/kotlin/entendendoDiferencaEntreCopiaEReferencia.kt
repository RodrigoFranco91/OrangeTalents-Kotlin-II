fun entendendoDiferencaEntreCopiaEReferencia(){
    //É igual no java
    //contaRodrigo é uma referencia para o objeto do tipo Conta

    val contaRodrigo = ContaCorrente("Rodrigo", 1000)
    // Nao funciona mais, pois o set de saldo agora é private contaRodrigo.saldo = 200.0

    val contaFran = ContaCorrente("Fran", 1001)
    // Nao funciona mais, pois o set de saldo agora é private contaFran.saldo = 300.0

    println(contaRodrigo.titular)
    println(contaRodrigo.numero)
    println(contaRodrigo.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    // Inicio do: Entendo copia e referencia:

    // --Variaveis com tipo Primitivo:

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    //Apenas o numeroY foi alterado! Pois com número primitivo ocorre a Copia!

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    // --Variaveis que são referencia de um objeto

    val contaJoao = ContaCorrente("Joao", 2000)


    val contaMaria = contaJoao;
    contaMaria.titular = "Maria"

    //Ambas as contas foram alteradas! Pois a variável que aponta para objeto é sempre uma referencia!
    //Apontam para o mesmo endereço de memoria!

    println("Titular de contaJoao é ${contaJoao.titular}")
    println("Titular de contaMaria é ${contaMaria.titular}")

    //Fim do: Entendendo copia e referencia.
}