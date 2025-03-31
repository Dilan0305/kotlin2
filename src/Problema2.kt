/*Realizar un programa que lea por teclado cuatro valores numéricos enteros
e informe su suma y promedio.
 */

fun main() {
    print ("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    print("Ingrese cuarto valor:")
    val valor4 = readln().toInt()
    val suma = valor1 + valor2 + valor3 + valor4
    print ("La suma de $valor1, $valor2, $valor3 y $valor4 es $suma")
    val prom: Int = suma / 4
    }