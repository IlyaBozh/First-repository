object CreateHuman{
    fun factoryHuman(): Human{
        val human = Human()
        when ((1..4).random()) {
            1 -> human.gender = "Male"
            2 -> human.gender = "Female"
            3 -> human.gender = "Trans"
            4 -> human.gender = "Bi"
        }

        human.height = (50..230).random()
        human.weight = (20..180).random()
        human.speed = (1..10).random()

        when (human.speed){
            in 1..3 -> human.walker = ZombieWalker(human.speed)
            in 4..6 -> human.walker = SadWalker(human.speed)
            in 7..10 -> human.walker = HurryingWalker(human.speed)
        }
        return human
    }
}