import java.util.Scanner

fun main() {
    print("Введите первое число: ")
    val n1 = Scanner(System.`in`).nextInt()
    print("Введите второе число: ")
    val n2 = Scanner(System.`in`).nextInt()
    print("Введите третье число: ")
    val n3 = Scanner(System.`in`).nextInt()

    if (n1 > n2 && n2 > n3) {
        println("$n1 Самое большое число")
    }
    if (n2 > n3 && n2 > n1) {
        println("$n2 Самое большое число")
    }
    if (n3 > n1 && n3 > n2) {
        println("$n3 Самое большое число")
    }
    if (n1 < n2 && n2 < n3) {
        println("$n1 Самое маленькое число")
    }
    if (n2 < n3 && n2 < n1) {
        println("$n2 Самое маленькое число")
    }
    if (n3 < n1 && n3 < n2) {
        println("$n3 Самое маленькое число")
    }
}