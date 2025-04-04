package `5_Estructuras_condicionales_animadas`

/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique
 si el número es positivo, nulo(cero) o negativo.
 */
fun main (){
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    if (valor1 > 0)
        print("El valor es positivo")
    else
        print("El valor es negativo")
   if(valor1 == 0)
        print("El valor es 0")

}