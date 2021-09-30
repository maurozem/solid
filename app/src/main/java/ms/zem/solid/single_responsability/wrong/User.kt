package ms.zem.solid.single_responsability.wrong

data class User (
    val id: Long,
    val name: String,
    val password: String
) {
    fun signIn() {
        // autenticar/entrar no app
    }
    fun signOut() {
        // deslogar/sair do app
    }
}