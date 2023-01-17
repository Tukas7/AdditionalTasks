fun main(){
    println("Введите текст")
    val string:String = readln()
    val length:Int= string.length
    var calc =0
    while (calc!=length){
        println(string.get(calc))
        calc+=1
    }
}