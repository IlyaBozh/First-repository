data class SadWalker(val speed: Int = 0) : IWalker{
    override fun walk(): String{
        return "I am very sad, so my speed is equal to $speed km/h"
    }
}