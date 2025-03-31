package `3_Estructura_condicional_if`

fun main () {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Infrese el segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 < valor2) {
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    } else {
        val producto = valor1 * valor2
        val division = producto / valor2
        println("El producto de los dos valores es: $producto")
        println("La division de los dos valores es: $division")
    }
}