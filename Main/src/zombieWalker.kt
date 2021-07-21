class ZombieWalker(override val speed: Int) : IWalker{
    override fun walk(){
       println("This zombie is so slow, its speed is only $speed km/h, we will definitely be able to escape from it")
    }
}