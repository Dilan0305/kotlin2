package `5_Estructuras_condicionales_animadas`

/*Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y
muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
 Mostrar un mensaje de error si el número de cifras es mayor.
 */
fun main() {
    print("Ingrese la o las cifras ")
    val num = readLine()!!.toInt()
    if (num >= 1000)
        print("Error numero de cifras exedido")
    else if (num >= 100 && num <= 999)
        print("Tiene tres cifras")
           if (num >= 10 && num <= 99)
    print("Tiene dos cifras")
    else
        print("Tiene una cifra")
}