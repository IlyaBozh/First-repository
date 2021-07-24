data class HurryingWalker(val speed: Int = 0) : IWalker{
    override fun walk(){
        println("I'm in a hurry, so my speed is equal to $speed km/h")
    }
}