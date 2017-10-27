class mobil {
    var mesin=1
    var roda=4
    var body=1
    fun maju(){
        println("maju...")
    }
    fun mundur(){
        println("mudur...")
    }
    fun belok(){
        println("belok...")
    }
}

fun main(args: Array<String>) {
    var avanza=mobil()
    avanza.maju()
    avanza.mundur()
    avanza.belok()

    println("mesin : "+avanza.mesin)
    println("roda  : "+avanza.roda)
    println("body  : "+avanza.body)
}
