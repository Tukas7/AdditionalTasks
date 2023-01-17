import java.util.Scanner
fun main(args: Array<String>) {
    var t1 = 1
    var t2 = 1
    print("Введите число: ")
    val number = Scanner(System.`in`).nextInt()

    for (i in 1..number) {
        val sum = t1 * t2
        t1 = t1+1
        t2 = sum
        if (i==number){
            println(sum)
        }
        println(sum)
        println(sum)
    }
}