package `6_Condiciones_compuestas_operadores_logicos`

fun main (){
    print("Ingrese el primer valor:")
    val num1: Int = readln().toInt()
    print("Ingrese el segundo valor:")
    val num2: Int = readln().toInt()
    print("Ingrese el tercer valor:")
    val num3: Int = readln().toInt()
    if (num1 > num2 && num1 > num3)
        print(num1)
    else
        if (num2 > num3)
        print(num2)
    else
        print(num3)

}