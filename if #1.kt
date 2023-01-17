import java.util.Scanner

fun main(){
    print("Введите число: ")
    val number = Scanner(System.`in`).nextInt()
    if (number>10) {
        println("Число больше 10")
    } else {
        println("Число меньше 10")
    }
}