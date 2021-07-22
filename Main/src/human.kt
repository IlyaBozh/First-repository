 class Human(val height: Int, val weight: Int, val speed: Int): IWalker{
     override fun walk() {
         println("The height of this person $height cm, the weight is equal to $weight")
         println("and his speed is equal to $speed")
         println()
     }
}