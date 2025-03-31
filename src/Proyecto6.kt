fun main(){
    print ("Ingrese la medida del lado del cuadrado:")
    val lado: Int  = readln().toInt()
    val perimetro: Int = lado * 4
    println("El perimetro de cuadrado es $perimetro")
}