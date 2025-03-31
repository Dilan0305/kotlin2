/*Escribir un programa en el cual se ingresan cuatro números enteros, calcular e informar
la suma de los dos primeros y el producto del tercero y cuarto.
 */

fun main (){
    print ("Ingrese cuatro numeros enteros:")
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    print ("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    print ("El resultado de $valor1 y $valor2 es $producto")
    print ("Ingrese el precio del producto:")
    val precio: Double = readln().toDouble()
    print("Ingrece la cantidad de productos:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio * cantidad
    println("El total a pagar es  $total")
}