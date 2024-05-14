open class Types(
    var mbti: String
) {
    open fun description() {
        println("Your MBTI : $mbti")
    }
}

class Analysts(mbti : String) : Types(mbti) {
    override fun description() {
        println("${mbti} -> ( _NT_ ) Analysts")
    }
}
class Diplomats(mbti : String) : Types(mbti) {
    override fun description() {
        println("${mbti} -> ( _NF_ ) Diplomats")
    }
}
class Sentinels(mbti : String) : Types(mbti) {
    override fun description() {
        println("${mbti} -> ( _N_J ) Sentinels")
    }
}
class Explorers(mbti : String) : Types(mbti) {
    override fun description() {
        println("${mbti} -> ( _N_P ) Explorers")
    }
}

val user1 = Types("INTJ")
val user2 = Analysts("INTP")
val user3 = Explorers("ENTP")

user1.description()
user2.description()
user3.description()
