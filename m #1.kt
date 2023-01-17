fun main(){
    println("")
    val start:Int= readln().toInt()
    val end:Int= readln().toInt()
    var arr= mutableListOf(0)
    arr.remove(0)
    var plus=0
    var min=0
    for (i:Int in start..end){
        arr.add(i)
    }
    for (i in arr){

        if (i>0){
            plus+=1
        }
        else if(i<0){
            min+=1
        }

    }
    println(plus)
    println(min)
}