package `5_Estructuras_condicionales_animadas`

/*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
 Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del
mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
 */

fun main(){
    print("Ingrese cantidad de preguntas")
    val cantidad_preguntas = readln().toInt()
    print("Ingrese cantidad de respuestas")
    val porsentaje = readln().toDouble()
    val porcentaje = (porsentaje.toDouble() / cantidad_preguntas)*100
        println("Nivel máximo")
    if (porsentaje >= 75 && porsentaje <= 90)
        println("Nivel medio")
    else if (porsentaje >= 50 && porsentaje <= 75)
        println("Nivel regular")
    else (porsentaje <= 50)
        println("Fuera de nivel")

}