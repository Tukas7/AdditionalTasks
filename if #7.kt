import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    val num = reader.nextInt()

    if (num % 2 == 0)
        println("$num четное")
    else
        println("$num нечетное")
}