import java.util.Scanner

fun main(){
    print("Введите первую сторону: ")
    val number1 = Scanner(System.`in`).nextInt()
    print("Введите вторую сторону: ")
    val number2 = Scanner(System.`in`).nextInt()
    print("Введите третью сторону: ")
    val number3 = Scanner(System.`in`).nextInt()
    if(number1==number2 || number2==number3 || number1==number3){
        println("Треугольник равнобедренный")
    }
    if(number1==number2 && number2==number3){
        println("Треугольник равносторнний")
    } else{
        println("Треугольник разносторонний")
    }
}