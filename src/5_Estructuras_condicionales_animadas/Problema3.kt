package `5_Estructuras_condicionales_animadas`

/*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
 Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del
mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
 */

fun main(){
    print("Ingrece el porsentaje:")
    val porsentaje = readLine()!!.toInt()
    if (porsentaje >= 90)
        print("Nivel máximo")
    if (porsentaje >= 75 && porsentaje <= 90)
        print("Nivel medio")
    if (porsentaje >= 50 && porsentaje <= 75)
        print("Nivel regular")
    if (porsentaje <= 50)
        print("Fuera de nivel")

}