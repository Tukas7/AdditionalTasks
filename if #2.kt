import java.util.Scanner

fun main(){
    print("Введите первое число: ")
    val number1 = Scanner(System.`in`).nextInt()
    print("Введите второе число: ")
    val number2 = Scanner(System.`in`).nextInt()
    if (number1>number2){
        println("Первое число больше вторго")
    }
    if(number2>number1){
        println("Второе число больше первого")
    } else{
        println("Числа равны")
    }
}