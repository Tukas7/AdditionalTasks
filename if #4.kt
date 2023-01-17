fun main () {
    print("Введите количество вводимых в консоль чисел: ")
    val number = inputNumbers()
    println("Желаемое количество чисел для ввода = $number")
    var mainNum = 0
    var sumNatNum = 0
    var sumPosNum = 0
    while (mainNum < number){
        println("Введите число: ")
        val numberString = readLine()?.toIntOrNull() ?: continue
        mainNum++
        if (numberString > 0) {
            sumPosNum++
        }
        if (numberString < 0) {
            sumNatNum++
        }
    }

    println("Количество положительных чисел = $sumPosNum")
    println("Количество отрицательных чисел = $sumNatNum")
}

fun inputNumbers (): Int {
    return readLine()?.toIntOrNull() ?: inputNumbers()
}