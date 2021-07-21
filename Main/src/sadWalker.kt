data class SadWalker(val speed: Int = 0) : IWalker{
    override fun walk(){
        println("He is so sad, that's probably why he goes about $speed km/h")
    }
}