data class ZombieWalker(val speed: Int = 0) : IWalker{
    override fun walk(){
       println("And by the way, I'm a zombie, so I'll chase you with $speed km/h")
    }
}