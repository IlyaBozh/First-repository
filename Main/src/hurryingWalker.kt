data class HurryingWalker(val speed: Int = 0) : IWalker{
    override fun walk(): String{
        return "I'm in a hurry, so my speed is equal to $speed km/h"
    }
}