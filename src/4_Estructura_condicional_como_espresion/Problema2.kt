package `4_Estructura_condicional_como_espresion`

/*Problema 2: Clasificar edad
Enunciado: Solicita al usuario que ingrese su edad. Almacena una
descripción en una variable usando una expresión if: Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".
Luego, imprime la descripción correspondiente.
 */

fun main () {
    print("Ingrese su edad:")
    val valor1 = readLine()!!.toInt()
    if (valor1 <= 13)
        print("Eres un niño.")
    if (valor1 < 14)
        print("Eres un adolecente")
    if (valor1 > 18)
        print("Eres un adulto.")

}

