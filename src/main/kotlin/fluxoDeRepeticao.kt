fun fluxoDeRepeticao() {
    var saldo = 0.0

    //Quando fazemos esse IF a IDE sugere utilizarmos o When, ilustrado a seguir:
    if (saldo > 0.0) {
        println("Saldo é positivo")
    } else if (saldo == 0.0) {
        println("Saldo é neutro")
    } else {
        println("Saldo é negativo")
    }

    //Fazendo a mesma coisa que o if anterior
    when {
        saldo > 0.0 -> {
            println("Saldo é positivo")
        }
        saldo == 0.0 -> {
            println("Saldo é neutro")
        }
        else -> {
            println("Saldo é negativo")
        }
    }
    //Quando a condicional faz apenas uma coisa, no nosso caso apenas um print, podemos deixar o when assim
    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("Saldo é neutro")
        else -> println("Saldo é negativo")
    }

    //Loopings:

    //O for abaixo, para percorrer uma collection, mas nao aprendemos collection ainda
    //for(item in collection) println(item)

    //O for abaixo, para percorrer uma collection, mas nao aprendemos collection ainda
    //for(item: int in ints) {

    // }

    //Passando por todos elementos de 1 a 5
    for (i in 1..5) {
        println(i)
    }

    //Passando por todos elementos de 1 a 5, mas pulando de 2 em 2
    //Começa passando pelo 1, depois vai para o 3 e 5, pois (1+2=3) e (3+2=5)
    for (i in 1..5 step 2) {
        println(i)
    }

    //Passando por todos elementos de 5 a 1, ou seja, ordem inversa
    for (i in 5 downTo 1) {
        println(i)
    }

    //Temos uma laço de repetição. O laço se repete enquanto  a condicional for verdadeira
    //Ñ podemos de esquecer de iniciar a variavel e de incrementá-la dentro do código
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    //Outra forma de usar o while
    var t=0
    do{
        println("Do while $t")
        t++
    }while(t<5)
}