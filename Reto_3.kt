
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

const val askForNumber = "Escribe un numero"
const val askForDouble = "Escribe un numero con decimales"
fun main(){




    areas()
    var n: Boolean
    do{
        println("Selecciona un reto del 1 al 6")
        when(writeNumber())
        {
            1-> mutiplication()//
            2-> squareRoot()
            3-> circuleArea()
            4-> cylider()
            5-> residue()
            6-> areas()

            else-> print("Gracias")
        }
        println("Deseas continuar escribe si o no")
        n=yesOrNo()
    }while (n)

    println("Gracias")


}
private fun mutiplication(){
    println(askForDouble)
    val num1 = writeDouble()
    println(askForDouble)
    val num2 = writeDouble()
    val result=num1.times(num2)
    println(result)
}
private fun squareRoot(){
    println(askForNumber + "mayor a 20")
    val num1 = writeDouble()
    val result = sqrt(num1)


    println("la raiz cuadrada de $num1 numero es $result")


    // creamos formato mediante formatos
    val f = DecimalFormat("#.00")
    println("Redondeado es ${f.format(result)}")

    /*
     transformamos en un numero decimal grande y le decimos
     cuando numeros despues de la como y si queremos que redonde
     hacia arriba o abajo
     */
    val x= BigDecimal(result).setScale(2,RoundingMode.DOWN)
    println(x)
    // solo nos entrega un numero redondeado
    println(kotlin.math.ceil(result))

}
private fun circuleArea(){
    println(askForNumber)
    val radius = writeDouble()
    val area = PI.times(radius.pow(2.0))
    println("El area del circulo es de $area")
}
private fun cylider(){
    println("$askForNumber para la base")
    val radius = writeDouble()
    val area = PI.times(radius.pow(2.0))
    println("$askForNumber para la altura")
    val altura = writeDouble()
    val volumen= BigDecimal(area*altura).setScale(1,RoundingMode.UP)

    println("El volumne del cilindro es de $volumen ")
}
private fun residue(){
    println(askForNumber)
    val num1 = writeNumber()
    println(askForNumber)
    val num2 = writeNumber()

    val result =num1.div(num2)
    val decimal = num1%num2
    println("El resultado es: $result y sobran  $decimal")
}
private fun areas() {
    val options = arrayOf<String>("triangulo","cuadrado","pentagono")
    println("Elige una de las opciones escribiendo el numero correspondiente ")
    for ((index,value) in options.withIndex())
        println("$index  $value")
    val election = writeNumber()
    when(election)
    {
        0-> triangulo()
        1-> cuadrado()
        2-> pentagono()
        else-> println("No es una opcion valida")

    }
    print("Hasta luego")
}

private fun pentagono() {
    print("Elegiste pentagono")
    println("$askForNumber para la base")
    val base =writeDouble()
    println("Escribe la distancia al centro")
    val  apotema = writeDouble()

    val perimeter= apotema.times(5)
    val  area = (perimeter.times(apotema)).div(2) // (base * apotema) /2
    println("EL area es $area y el perimetro $perimeter")
}

private fun cuadrado() {
    print("Elegiste cuadrado")
    println("$askForNumber para el lado")
    val base =writeDouble()
    val  area = base.times(base)
    val perimeter= base.times(4)
    println("EL area es $area y el perimetro $perimeter")
}

private fun triangulo(){
    print("Elegiste triagulo")
    println("$askForNumber para la base")
    val base =writeDouble()
    println("$askForNumber para la altura")
    val altura = writeDouble()
    val  area = (base.times(altura)).div(2)
    val hip = sqrt(base.pow(2).plus(altura.pow(2)))
    val perimeter = hip.plus(base).plus(altura)
    println("EL area es $area y el perimetro $perimeter")
}



