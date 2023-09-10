class DOG(val name:Int,val name2:Int){}

fun feed(number:DOG){


    println(number.name + number.name2)
}
    

fun main() {
    val boby=DOG(3,6)
    feed(boby)
}