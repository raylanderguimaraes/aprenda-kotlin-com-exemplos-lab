data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    //
    
    // Cria dois usuários da plataforma de ensino
    val usuario1 = Usuario("Raylander", 30)
    val usuario2 = Usuario("Jocastha", 31)
    
    // cria lista de conteudos da formacao
    val conteudosFormacao: MutableList<ConteudoEducacional> = mutableListOf(
    		ConteudoEducacional("Lógica de Programação"),
        	ConteudoEducacional("Estruturas condicionais e de repetição")
    )
    
    //cria formacao com conteudos
    val formacao = Formacao("Curso básico de Java", conteudosFormacao)
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    //mostra a lista de usuarios inscritos na formacao
    for(usuario in formacao.inscritos) {
        println("Nome: ${usuario.nome}, Idade: ${usuario.idade}, Conteudos: ${conteudosFormacao} ")
    }
    
}