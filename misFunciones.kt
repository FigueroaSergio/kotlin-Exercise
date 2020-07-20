
fun writeNumber(): Int {
    // pide que se ingrese un numero
    // si no se hace se vuelve a llamar a si misma hasta
    // que se digite un numero
     return try{
            readLine()?.toInt() ?: 0

        } catch (_: NumberFormatException) {
            println("Escribe un numero")
            writeNumber()
        }
}
fun writeDouble(): Double {
    // pide que se ingrese un numero
    // si no se hace se vuelve a llamar a si misma hasta
    // que se digite un numero
    return try{
        readLine()?.toDouble() ?: 0

    } catch (_: NumberFormatException) {
        println("Escribe un numero")
        writeDouble()
    } as Double
}
fun yesOrNo(): Boolean {

    val message= readLine().toString()
    return when {
        message.equals("si", true) -> return true
        message.equals("no", true) -> return false
        else -> {
            print("Recuerda responder si o no")
            yesOrNo()
        }
    }
}
fun firstMayus(str: String):String{
    return str[0].toUpperCase()+str.substring(1)
}