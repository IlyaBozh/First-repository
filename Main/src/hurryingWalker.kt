class HurryingWalker(override val speed: Int) : IWalker{
    override fun walk(){
        println("this man is in a hurry somewhere, he has a very high speed, about $speed km/h")
    }
}