package `4_Estructura_condicional_como_espresion`

/*Solicita al usuario que ingrese tres valores enteros positivos que representan los lados de un triángulo.
Valida primero que puedan formar un triángulo (la suma de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
 */

fun main() {
    print("Ingrece primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val valor3 = readLine()!!.toInt()
    if (valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1)
        print("Los valores son correctos para formar un triangulo")
    val tipodetriangulo = if (valor1 == valor2 && valor2 == valor3)
        print("Equlatero")
 else if (valor1 == valor2 && valor2 == valor3){
    "Isosceles"
} else {
    "Escaleno"
}
print("El triangulo es: $tipodetriangulo")
}