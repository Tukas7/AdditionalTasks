fun main() {
    println("Введите через 'Enter' начало и конец массива")
    val start: Int = readln().toInt()
    val end: Int = readln().toInt()
    val arr = mutableListOf(0)
    arr.remove(0)
    var sum = 0

    for (i: Int in start..end) {
        arr.add(i)

    }

    for (i in arr) {
        if(i%2==0){
            sum+=i
        }
    }
    println(sum)
}