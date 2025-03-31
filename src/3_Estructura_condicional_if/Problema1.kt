package `3_Estructura_condicional_if`

/*Se ingresan tres notas de un alumno,
si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
 */

fun main () {
    print("Ingrese la primer nota:")
    val valor1 = readln().toInt()
    print("Infrese la segunda nota:")
    val valor2 = readln().toInt()
    print("Ingrese la tercera nota:")
    val valor3 = readln().toInt()
    val suma = valor1 + valor2 + valor3 / 3
    val resultado = suma
    if (suma > 7)
        print("El estudiante paso el periodo")
    else
        print("El estudiante no paso el periodo")


}