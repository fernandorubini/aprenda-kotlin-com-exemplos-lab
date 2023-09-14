enum class Nivel {BASICO, INTERMEDIARIO, AVANCADO, TOTAL}

data class Usuario(val nome: String, val email: String, val idadeUsuario: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
	
    
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun imprimirListaDosInscritos(){
        for(user in inscritos){
            println("${user.nome} - ${user.email} - ${user.idadeUsuario}")

        }
        
    }

    fun imprimirGradeCurricular() {
   
    for (cont in conteudos) {
        println("${cont.nome} - ${cont.duracao} - ${cont.nivel}")
         println("Grade Curricular:")
    }
}   
    
}

fun main() {
    
	val SUBSCRIBE = "Lista de inscritos"
    val moduloDesenvolvedor = ConteudoEducacional("Desenvolvedor de Ouro", 190, Nivel.TOTAL)
    val moduloFlutter = ConteudoEducacional("Curso de Flutter: Criando um App", 30, Nivel.BASICO) 
    val moduloDart = ConteudoEducacional("Curso de Dart: entendendo o assincronismo", 70, Nivel.INTERMEDIARIO)
    val moduloFirebase = ConteudoEducacional("Curso de Flutter com Firebase", 90, Nivel.AVANCADO)

    val listConteudos = mutableListOf<ConteudoEducacional>()
    listConteudos.add(moduloDesenvolvedor)
    listConteudos.add(moduloFlutter)
    listConteudos.add(moduloDart)
    listConteudos.add(moduloFirebase)

    val formacaoFlutter = Formacao("Curso de Flutter: Criando um App", listConteudos, Nivel.BASICO)
    val Fernando = Usuario("Fernando", "fernando@hotmail.com", 56)
    val Marcia = Usuario("Marcia", "marcia@gmail.com", 25)
    val Gabriel = Usuario("Gabriel", "gabriel@mail.terra.com.br", 18)

    formacaoFlutter.matricular(Fernando)
    formacaoFlutter.matricular(Marcia)
    formacaoFlutter.matricular(Gabriel)

    val formaçãoDart = Formacao("Curso de Dart: entendendo o assincronismo", listConteudos, Nivel.INTERMEDIARIO)
	val Alexandre = Usuario("Alexandre", "alexandre@hotmail.com", 38)
    val Nathalia = Usuario("Nathalia", "nathalia@gmail.com", 24)
    val LuisFernando = Usuario("Luis Fernando", "luis.fernando@mail.terra.com.br", 32)

    formaçãoDart.matricular(Alexandre)
    formaçãoDart.matricular(Nathalia)
    formaçãoDart.matricular(LuisFernando)

    val formacaoFirebase = Formacao("Curso de Flutter com Firebase", listConteudos, Nivel.AVANCADO)
    val Marcelo = Usuario("Marcelo", "marcelo@hotmail.com", 58)
    val Eduardo = Usuario("Eduardo", "eduardo@gmail.com", 54)
    val Guilherme = Usuario("Guilherme", "guilherme@mail.terra.com.br", 51)

    formacaoFirebase.matricular(Marcelo)
    formacaoFirebase.matricular(Eduardo)
    formacaoFirebase.matricular(Guilherme)
	
    
    formacaoFlutter.imprimirGradeCurricular()
	
    println()
    println("${formacaoFlutter.nome} - Nível: ${formacaoFlutter.nivel}")
    println(SUBSCRIBE)
    println(formacaoFlutter.imprimirListaDosInscritos())
    println()
    println("${formaçãoDart.nome} - Nível: ${formaçãoDart.nivel}")
    println(SUBSCRIBE)
    println(formaçãoDart.imprimirListaDosInscritos())
    println()
    println("${formacaoFirebase.nome} - Nível: ${formacaoFirebase.nivel}")
    println(SUBSCRIBE)
    println(formacaoFirebase.imprimirListaDosInscritos())
    
}
