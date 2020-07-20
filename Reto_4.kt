
fun main(){

    var n: Boolean
    do{
        println("Selecciona un reto del 1 al 7")
        when(writeNumber())
        {
            1-> stringLength()//
            2-> addString()
            3-> ajustString()
            4-> fragmentString()
            5-> mayusAndMinus()
            6-> longOrShort()
            7-> pigLatin()
            else-> print("Gracias")
        }
        println("Deseas continuar escribe si o no")
        n=yesOrNo()
    }while (n)

    println("Gracias")


}