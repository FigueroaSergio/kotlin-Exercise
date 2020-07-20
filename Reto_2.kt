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




fun stringLength(){
    //Reto 1  Tercer nivel
    //comparacion de dos numeros
    println("Escribe tu nombre ")
    val nombre = readLine().toString().length
    if (nombre==0)
        println("No escribiste un nombre")
    else
        println("Tu nombre una longitud de $nombre")
}
fun addString(){
    //Reto 2
    println("Escribe tu nombre ")
    val nombre = readLine().toString()

    println("Escribe tu apellido ")
    val apellido = readLine().toString()

    println("Escribe tu comida favorita ")
    val comida = readLine().toString()

    println("Hola, mi nombres es la $nombre $apellido y mi comida favorita es $comida")


    }
fun ajustString(){
    println("Por favor escribe todo en minusculas")
    println("Escribe tu nombre ")
    var nombre = readLine().toString()
    nombre = firstMayus(nombre)

    println("Escribe tu apellido ")
    var apellido = readLine().toString()
    apellido = firstMayus(apellido)
    println("Escribe tu  pais ")
    var pais = readLine().toString()
    pais = firstMayus(pais)

    println("Hola $nombre $apellido que chevere  saber que eres de $pais")
    }
fun fragmentString(){
    println("Escribe una oracion de mas de 10 caracteras")
    val phrase= readLine().toString()

    println("Desde que caracter deseas imprimir (posicion)")
    var num1 = writeNumber()

    println("Hasta que caracter deseas imprimir (posicion)")
    var num2 = writeNumber()

     if (num1 > num2){
         val pibote = num2
         num2 = num1
         num1 = pibote
     }
     if (num1<0 || num2 >= phrase.length)
         println("no se puede realizar la operacion")
     else
         println(phrase.substring(num1-1,num2))
}
fun mayusAndMinus(){
    println("Escribe un palabra")
    val palabra1 = readLine().toString()
    println("Escribe otra palabra")
    val palabra2 = readLine().toString()
    println(palabra1.toUpperCase())
    println(palabra2.toLowerCase())
}
fun longOrShort(){
    println("Escribe tu nombre")
    val nombre = readLine().toString()
    if (nombre.length > 5)
        println("Hola $nombre")
    else {
        println("Escribe tu apellido")
        val apellido = readLine().toString()
        println("Hello $nombre $apellido")

    }
}
fun pigLatin(){
    val vocales= arrayListOf<Char>('a','e','o','i','u')
    var x:Boolean=false
    println("Escribe un palabra para traducir a pig Latin")
    var palabra = readLine().toString()
    val find = vocales.any{it.equals( palabra[0],true)}
    palabra += if (find) {
        "way"
    } else
        "pay"
    println(palabra)
// otra manera de conocer si hay vocales
    for (item in vocales){
        if (item.equals( palabra[0],true))
            x=true
    }
}

