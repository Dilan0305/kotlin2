package `5_Estructuras_condicionales_animadas`

fun main (){
print("Ingrese primer nota")
    val nota1 = readLine()!!.toInt()
    print("Ingrese segundo nota")
    val nota2 = readLine()!!.toInt()
    print("Ingrese tercerr nota")
    val nota3 = readLine()!!.toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    if (promedio >= 7)
        print("Promocionado")
    else
        if (promedio < 4)
            print("Regular")
            else
                print("Reprovado")
}