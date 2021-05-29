class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Funcionário Logado!")
        }else{
            println("Falha na Autenticação")
        }

    }
}