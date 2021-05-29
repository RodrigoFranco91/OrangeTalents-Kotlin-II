class Analista(
    nome: String,
    salario: Double,
    cpf: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return  salario * 0.2
        }
}