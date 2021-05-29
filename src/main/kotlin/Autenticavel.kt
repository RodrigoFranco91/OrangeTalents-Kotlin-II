interface Autenticavel {

    //Aqui no kotlin Interface pode ter propetie
    //Todos que implementarem essa interface tem que tem essa msm propertie override
    val senha: Int

    //Aqui também podemos ter uma implementação padrão
    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}