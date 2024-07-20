//create an Extension function for int, which raises a number to a certain degree and returns the result. It accepts only the required degree(Int) as input(arguments)
fun Int.pow(exponent: Int): Int{
    var result = 1
    repeat(exponent){
        result*=this
    }
    return result
}
fun main(){
    val number=2
    val result=number.pow(3)
    println(result)
}