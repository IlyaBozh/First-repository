fun main(){
    var humans: MutableList<Human> = mutableListOf()
    for (i in 1..10){
        humans.add(CreateHuman.factoryHuman())
    }
    for (j in humans){
        println("Hi, I'm a ${j.gender}, my height is ${j.height} and my weight is ${j.weight}.")
        j.walker?.walk()
        println()
    }
}