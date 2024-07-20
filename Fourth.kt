//  sealed class DataType
sealed class DataType {
    data class DoubleType(val value: Double) : DataType()
    object UnitType : DataType()
}
//extension DataType
fun DataType.displayTypeInfo() {
    when (this) {
        is DataType.DoubleType -> println("это DoubleType со значением $value")
        is DataType.UnitType -> println("это Unit")
    }
}
// extension Int
fun Int.displayTypeInfo() {
    println("это Int")
}
// extension String
fun String.displayTypeInfo() {
    println("это String")
}
// extension Boolean
fun Boolean.displayTypeInfo() {
    println("тип у $this неизвестен")
}
fun main() {
    3.displayTypeInfo()                  //  это Int
    "a".displayTypeInfo()                //  это String
    true.displayTypeInfo()               //  тип у true неизвестен
    // DataType
    DataType.DoubleType(1.4).displayTypeInfo() // это DoubleType со значением 1.4
    DataType.UnitType.displayTypeInfo()       //  это Unit
}

