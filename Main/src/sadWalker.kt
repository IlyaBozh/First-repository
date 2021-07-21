class SadWalker(override val speed: Int) : IWalker{
    override fun walk(){
        println("He is so sad, that's probably why he goes about $speed km/h")
    }
}