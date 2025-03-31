package `4_Estructura_condicional_como_espresion`
/*Ingresar por teclado un valor entero. Almacenar en otra variable
el cuadrado de dicho numero si el valor ingresado es par, en caso que sea
impar guardar el cubo.
 */
fun main () {
print("Ingrese un valor entero:")
    val valor = readLine()!!.toInt()
    val resultado = if (valor % 2 == 0) {
        print("Cuadrado:")
        valor * valor
    } else {
        print("Cubo:")
        valor * valor * valor
    }
    print(resultado)
}