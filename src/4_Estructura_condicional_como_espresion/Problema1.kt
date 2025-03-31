package `4_Estructura_condicional_como_espresion`

/*Problema 1: Determinar el número con mayor valor absoluto
Enunciado: Solicita al usuario ingresar dos números enteros (pueden ser negativos).
Luego, determina cuál de los dos tiene mayor valor
absoluto y muestra ese número en pantalla.
 */
fun main () {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val resultado = if (valor1 > valor2)
        print("El resultado de $valor1 es mayor")
    else
        print("El resultado de $valor2 es mayor")

}