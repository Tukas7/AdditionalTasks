import java.util.*
fun main() {
    println("""Выберите блюдо из меню:
        1) Плов - 110
        2) Макароны - 130
        3) Пельмени - 100
    """.trimMargin())
    val eat = arrayOf("", "Плов","Макароны", "Пельмени")
    val cost= arrayOf(0 , 110, 130,100)
    var choose: String= readln()
    println("Ввeдите сумму денег")
    var money:Int = Scanner(System.`in`).nextInt()
    if(cost[eat.indexOf(choose)] == money){
        println("Спасибо за покупку!")
    }
    else if (cost[eat.indexOf(choose)] < money){
        val change=money-cost[eat.indexOf(choose)]
        println("Ваша сдача: $change")
    }
    else{
        println("Денег не хватает!")
    }

}