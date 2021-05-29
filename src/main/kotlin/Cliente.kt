class Cliente(
    var nome: String,
    var cpf: String,
   override var senha: Int
) : Autenticavel{

    override fun autentica(senha: Int):Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }


}