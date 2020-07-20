fun main(){
    elephantSong()
    var n: Boolean
    do{
        println("Selecciona un reto del 1 al 7")
        when(writeNumber())
        {
            1-> untilFifty()
            2-> morethan42()
            3-> unlimitedadd()
            4-> friendsList()
            5-> randomNummber()


            else-> println("Gracias")
        }
        println("Deseas continuar escribe si o no")
        n=yesOrNo()
    }while (n)

    println("Gracias")


}
private fun elephantSong(){
    var elephants = 1
    val song= """
        elefante se balanceaba
        sobre la tela de una araña
        Como veía que resistía
        Fueron a llamar otro elefante
        """.trimIndent()

    println("$elephants $song")

    while(elephants<10) {

        println("cuantos elefantes más se balancearán")
        var asw = writeNumber()

        while (asw != elephants+1){
            println("intenta de nuevo")
            asw = writeNumber()
        }
        elephants++
        println("$elephants $song")


    }
}
private fun randomNummber() {
    val number=(0..10).random()
    println(number)

    do {
        var n= false
        println("Adivina el numero")
        val num = writeNumber()
        if (num == number) n=true

    }while (!n)
    println("Genial ganaste")
}
private fun friendsList() {
    var n = true
    val friends:ArrayList<String> =  ArrayList()

    var total:Int=0
    while (n){
        println("Dame el nombre de un invitado")
        val newfriend:String= readLine().toString()
        friends.add(newfriend)
        total++
        println("Deseas sumar otro amigo si/no")
        n = yesOrNo()
    }
    println("El total de invitados  es $total")
    for (item in friends)
        println(item)
}
private fun unlimitedadd() {
   var n = true
    println(askForNumber)
    var total= writeNumber()

   while (n){
       println(askForNumber)
        total += writeNumber()
        println("Deseas sumar otro numero si/no")
       n = yesOrNo()
    }
    println("El total de las sumas es $total")
}
private fun morethan42() {
    var num = 0
    do{
        println(askForNumber)
        num = writeNumber()
    }while (num<=42)
    println("El nummero $num es mayor a 42")
}
private fun untilFifty(){
    var total = 0

    while (total<=50) {
        println(askForNumber)
        val num1 = writeNumber()
        total+=num1
    }
    println(total)
}