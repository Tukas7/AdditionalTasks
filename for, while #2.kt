import java.util.Scanner
fun main(){
    print("Введите число: ")
    val number = Scanner(System.`in`).nextInt()
    for (i in 1..number){
        if (i % 2 == 0){
            println(i)
        }
    }
}