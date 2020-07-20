
fun main(){
    line()
    var n: Boolean
    do{
        println("Selecciona un reto del 1 al 7")
        when(writeNumber())
        {
            1-> favoriteword()//
            2-> howManyTimes()
            3-> inColum()
            4-> animalNTimes()
            5-> multiplieTable()
            6-> reverse()
            7->limit()
            8->addition()

            else-> print("Gracias")
        }
        println("Deseas continuar escribe si o no")
        n=yesOrNo()
    }while (n)

    println("Gracias")


}

private fun favoriteword() {
    println("write your favorite word")
    val word = readLine().toString()
    for (i in 1..8)
        println(word)
}
private fun howManyTimes(){
    println("write a word")
    val word = readLine().toString()
    println("How many times do i print it")
    val times = writeNumber()
    for (i in 1..times)
        println(word)

}
private fun inColum(){
    println("write a word")
    val word = readLine().toString()
    for (i in word)
        println(i)
}
private fun animalNTimes(){
    println("write your favorite animal")
    val animal = readLine().toString()
    println("How many times do i print it")
    val times = writeNumber()
    for (i in 1..times)
    {
        for (j in animal)
            println(j)
    }
}
private  fun multiplieTable(){
    println(askForNumber)
    val num = writeNumber()

    for (i in 1..10)
        println("$num x $i = ${num.times(i)}")
}
private  fun reverse(){
    println(askForNumber)
    val num = writeNumber()
    if (num>0){
        for (i in num downTo 0)
            println(i)
    }
    else
    {
        for (i in num..0)
            println(i)
    }
}
private fun limit() {
    println("write a word")
    val word = readLine().toString()
    println("How many times do i print it")
    val times = writeNumber()

    if (times > 15) {
        for (i in 1..3)
            println(word)
        println("$times es numero muy grande")
    }
    else
        for(i in 1..times) println(word)

}
private fun addition(){
    var total= 0
    for(i in 1..4){
        println(askForNumber)
        val num = writeNumber()
        println("desea sumarlo si o no")
        val asw = yesOrNo()
        if (asw)
            total += num

    }
    println("El resultado es $total")
}
private fun line(){
    println("Que tipo de recta quieres")
    println("si quieres una recta positiva  escribe +")
    println("si quieres una recta negativa  escribe -")
    val asw = readLine().toString()

    if (asw =="+"){
        println("Escribe el limite superior")
        val num1 = writeNumber()
        for (i in 0..num1)
            println("$i ")
    }
    else{
        println("Escribe el limite inferior sin el -")
        val num1 = writeNumber()

        for (i in -1*num1..0)
            print("$i ")

    }
    println()
}

