fun main(){
   /* val human = Speed(12)
    human.showSpeed()
    val zombie: IWalker = ZombieWalker(2)
    zombie.walk()
    val sadHuman: IWalker = SadWalker(1)
    sadHuman.walk()*/
    val creator: Creator = CreateHuman()
    val creatorHuman: IWalker = creator.factoryMethod()
    creatorHuman.walk()
}