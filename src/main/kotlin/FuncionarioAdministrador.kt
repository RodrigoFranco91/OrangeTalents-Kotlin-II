abstract class FuncionarioAdministrador(
     nome: String,
     salario: Double,
     cpf: String,
    val senha: Int
) : Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
){

    //Colocamos open para poder indicar se vamos usar esse metodo ou da inteface
    open fun autentica(senha: Int):Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }

}