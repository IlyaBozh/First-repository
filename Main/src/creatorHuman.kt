class CreateHuman: Creator(){
    override fun factoryMethod(): IWalker {
        return Human(180, 65, 2)
    }
}