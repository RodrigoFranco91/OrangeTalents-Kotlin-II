class Gerente(
    nome: String,
    salario: Double,
    cpf: String,
    senha: Int
) : FuncionarioAdministrador(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double get() = this.salario * 0.4


}