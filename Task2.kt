

fun main(args: Array<String>) {


    val transportCar_Movement:Movement = all_movement()



    val criterionRubber:Rubber = road_data()
    val criterionAsphalt:Asphalt = road_data()
    val criterionRelief:Relief = road_data()
    val criterionSeason:Season = road_data()
    val criterionDriving:Driving = road_data()

    val criterionNumberofCars:numberofCars = road_data()
    val criterionDistance:Distance = road_data()
    val criterionAverageDistance:averageDistance = road_data()
    val criterionGasStations:gasStations = road_data()


    println("Выберете дорожно-транспотную ситуацию: \n")

    println("1. Первая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_summer())
    println("Асфальт: " + criterionAsphalt.excellent_asphalt())
    println("Рельеф: " + criterionRelief.convex_relief())
    println("Сезон: " + criterionSeason.summer_season())
    println("Манера вождения: " + criterionDriving.southern_driving())

    println("\n2. Вторая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_allSeason())
    println("Асфальт: " + criterionAsphalt.bad_asphalt())
    println("Рельеф: " + criterionRelief.inclined_relief())
    println("Сезон: " + criterionSeason.winter_season())
    println("Манера вождения: " + criterionDriving.normal_driving())

    println("\n3. Третья дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_winter())
    println("Асфальт: " + criterionAsphalt.good_asphalt())
    println("Рельеф: " + criterionRelief.horizontal_relief())
    println("Сезон: " + criterionSeason.spring_season())
    println("Манера вождения: " + criterionDriving.metropolitan_driving())

    println("\n4. Четвертая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_summer())
    println("Асфальт: " + criterionAsphalt.excellent_asphalt())
    println("Рельеф: " + criterionRelief.inclined_relief())
    println("Сезон: " + criterionSeason.autumn_season())
    println("Манера вождения: " + criterionDriving.northern_driving())

    println("\n5. Пятая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_allSeason())
    println("Асфальт: " + criterionAsphalt.bad_asphalt())
    println("Рельеф: " + criterionRelief.inclined_relief())
    println("Сезон: " + criterionSeason.summer_season())
    println("Манера вождения: " + criterionDriving.southern_driving())

    print("\nВаш выбор: ")
    var choice_1 = readLine()!!.toInt()

    if (choice_1 == 1) {
        println("Вы выбрали первую дорожно-транспотную ситуацию")
    } else if (choice_1 == 2){
        println("Вы выбрали вторую дорожно-транспотную ситуацию")
    } else if (choice_1 == 3) {
        println("Вы выбрали третью дорожно-транспотную ситуацию")
    } else if (choice_1 == 4) {
        println("Вы выбрали четвёртую дорожно-транспотную ситуацию")
    } 
}

interface Movement {

}
class all_movement : Movement{

}

interface gasStations {

}

interface averageDistance {

}


interface Distance {

}

interface numberofCars {

}

interface Driving {
    fun southern_driving()
    fun normal_driving()
    fun metropolitan_driving()
    fun northern_driving()
}

interface Season {
    fun summer_season()
    fun winter_season()
    fun spring_season()
    fun autumn_season()

}

interface Relief {
    fun convex_relief()
    fun inclined_relief()
    fun horizontal_relief()
}

interface Asphalt {
    fun excellent_asphalt()
    fun bad_asphalt()
    fun good_asphalt()
}

interface Rubber {
    fun driving_Rubber_summer()
    fun driving_Rubber_allSeason()
    fun driving_Rubber_winter()
}
class road_data : gasStations,averageDistance,Distance,numberofCars,Driving,Season,Relief,Asphalt,Rubber{
    override fun driving_Rubber_summer(){
        print("Летнии ")
    }
    override fun driving_Rubber_allSeason(){
        print("Всесезонные ")
    }
    override fun driving_Rubber_winter(){
        print("Зимние ")
    }
    override fun excellent_asphalt(){
        print("Превосходный ")
    }
    override fun bad_asphalt(){
        print("Плохой ")
    }
    override fun good_asphalt(){
        print("Хороший ")
    }
    override fun convex_relief(){
        print("Выпуклый ")
    }
    override fun inclined_relief(){
        print("Наклонный ")
    }
    override fun horizontal_relief(){
        print("Горизонтальный ")
    }
    override fun summer_season(){
        print("Летний ")
    }
    override fun winter_season(){
        print("Зимний ")
    }

    override fun spring_season() {
        print("Весений ")
    }
    override fun autumn_season(){
        print("Осений ")
    }
    override fun southern_driving(){
        print("Южная ")
    }
    override fun normal_driving(){
        print("Нормальная ")
    }
    override fun metropolitan_driving(){
        print("Столичная ")
    }
    override fun northern_driving(){
        print("Северная ")
    }

}