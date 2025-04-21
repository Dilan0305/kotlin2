package `6_Condiciones_compuestas_operadores_logicos`

fun main () {
    print("Ingrese primer valor:")
    val val1: Int = readln().toInt()
    print("Ingrese segundo valor")
    val val2: Int = readln().toInt()
    print("Ingrese tercer valor")
    val val3: Int = readln().toInt()
    if (val1 < 10 && val2 < 10 && val3 < 10)
        print("Todos los números son menores a 10")
}