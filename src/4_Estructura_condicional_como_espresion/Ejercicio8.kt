package `4_Estructura_condicional_como_espresion`

fun main() {
    print("Ingrece primer valor: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrece segundo valor: ")
    val valor2 = readLine()!!.toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El valor entre $valor1 y $valor2 es $mayor")
}