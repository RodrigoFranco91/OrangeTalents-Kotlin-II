class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    senha: Int,
    val prl: Double
) : FuncionarioAdministrador(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double get() =  this.salario * 0.3

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdministrador>.autentica(senha)
    }

}