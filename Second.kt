//create an extension function for int, which raises a number to a given power. The result will be passed to the lambda, which this method accepts as an argument. Input : degree and a lambda which returns unit
fun Int.lambdaPow(exponent: Int, resultHandler: (Int)-> Unit){
    var result =1
    repeat(exponent){
        result*=this
    }
    resultHandler(result)
}
fun main(){
    val number=2
    number.lambdaPow(3){  result ->
        println(result)

    }
}