import kotlin.random.Random

fun main() {
    var arr = mutableListOf<List<Int>>()
    var sum =mutableListOf<Int>()
    var plus=0
    for (i in 1..5) {
        var random = List(5) { Random.nextInt(0, 10) }
        arr.add(random)
    }
    println(arr)
    for (i in arr){
        for(j in i){
            plus+=j
        }
        sum.add(plus)
        plus=0
    }
    println(sum.max())
}