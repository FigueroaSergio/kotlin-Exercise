fun main(){
    var n: Boolean
    do{
        println("Selecciona un reto del 1 al 7")
        when(writeNumber())
        {
            1-> compareTonumber()
            2-> range()
            3-> changingRanges()
            4-> iLikeTurtles()
            5-> howIsTheWeather()
            6-> egeAllowed()
            7-> differentsMessages()
            else-> print("Gracias")
        }
        println("Deseas continuar escribe si o no")
        n=yesOrNo()
    }while (n)

    println("Gracias")


}




private fun compareTonumber(){
    //Reto 1
    //comparacion de dos numeros
    println("Escribe un numero ")
    val num1 = writeNumber()
    // se reciben numeros si esta vacio se pone cero
    println("Escribe otro numero")
    val num2 = writeNumber()
    if (num1==num2)
        println("Los numeros son Iguales")
    else if  (num1 > num2)
        println("El primer numero es mayor al segundo con una diferencia de ${num1-num2}")
    else
        println("El segundo numero es mayor al primero con una diferencia de ${num2-num1}")

}
private fun range() {
    //Reto 2
    println("Ingrese un numero que sera el limite superior")
    val num1= writeNumber()
    println("Ingrese un numero")
    val num2 = writeNumber()
    if (num2<=num1)
        println("El numero  $num2 se encuentra en el rango ")
    else
        println("El numero $num2 esta fuera del rango")
}
private fun changingRanges(){
    println("Escribe el limite Superior")
    var num1= writeNumber()
    println("Escribe el Limite Inferior")
    var num2=writeNumber()
    println("Escribe Otro numero")
    val num3 = writeNumber()
    if(num1!=num2) {
        if (num1 < num2) {
            val pibote = num1
            num1 = num2
            num2 = pibote
        }

        if (num3 > num1)
            println("El numero $num3 esta por encima del limite superior")
        else if (num3 in (num2 + 1) until num1)
            println("El numero $num3 esta por entre $num2 y $num1")
        else
            println("El numero $num3 esta por debajo del limite inferior")
    }
    else
        print("Los limites son iguales no se puede ejecutar")
}
private fun iLikeTurtles() {
   println("Cual es tu animal Favorito")
    val animal = readLine().toString()
    if (animal.equals("tortuga",true)) {
        println(animal.toLowerCase())
        println(animal.toUpperCase())
        println("I like the TURTLES")
    }
    else if(animal=="")
        println("Hey no escribiste ningun animal")
    else
        println("Tu animal es cool pero prefiero las tortugas")
}
private fun howIsTheWeather(){
    println("Rsponde las siguientes preguntas con si o no")
    println("Como Esta el dia ¿Esta lloviendo?")
    val res1= yesOrNo()
    if (res1){
        println("Esta haciendo mucho viento ?")
        val res2 = yesOrNo()
        if (res2)
            println("Hace mucho viento para salir con sombrilla")
        else
           println("lleva una sombrilla por si acaso")
    }
    else
        println("Espero que tengas un muy buen dia")

}
private fun egeAllowed(){
    println("Por favor escribe tu Edad")
    val edad = writeNumber()
    if (edad >= 30)
        println("Nunca es tarde para aprender ¿Qué curso tomaremos?")
    else if (edad in 18 .. 29)
        println("Es un momento excelente para impulsar tu carrera")
    else
        println("¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte")
}
private fun differentsMessages(){
    println("Escribe un numero del 1 y 6")
    when(writeNumber()){
        1 -> println("Hoy aprenderemos sobre prorgamación")
        2 -> println("¿Qué tal tomar un curso de marketing digital?")
        3 -> println("Hoy es un gran día para comenzar a aprender de diseño")
        4 -> println("¿Y si aprendemos algo de negocios online?")
        5 -> println(" Veamos un par de clases sobre producción audiovisual")
        6 -> print(" Tal vez sea bueno desarrollar una habilidad blanda en Platzi")
        else -> print (" No elegiste un numero valido")
    }
}