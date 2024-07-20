//create extension function for generic type, which outputs info about generic type
fun <T> T.displayTypeInfo(){
    when (this){
        is String -> println("это String")
        is Int ->println("это Int")
        else -> println("тип у $this неизвестен")

    }
}

fun main(){
    3.displayTypeInfo()
    "a".displayTypeInfo()
    true.displayTypeInfo()
}