import kotlin.random.Random
fun main(){
    var arr= mutableListOf<List<Int>>()
    for (i in 1..10){
        var random = List(10) { Random.nextInt(0, 10) }
        arr.add(random)
    }

    println(arr)
    for (i in 0..9){
        println(arr[i][i])
    }


}