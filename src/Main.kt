//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //COMENTARIOS DE UNA SOLA LINEA DE SE USA EL //

    /* PARA COMENTARIOS MULTILINEA SE DEBE USAR EL /**/ Y DENTRO DE ESTOS VA CADA TEMA O PALABRA
    QUE SE DESEA COMENTAREAR */

    /* VARIABLES: SON ESPACIOS EN MEMORIA QUE PERMITEN ALMACENAR DATOS ALFA-NUMERICOS LOS CUALES
     PUEDEN CAMBIAR DURANTE EL CICLO DE EJECUCIÓN */

    // VARIABLE -> var (Estas son variables que pueden cambiar en diferentes ocasiones)

    // VARIABLE -> val (Estas son variables que son Constantes y ya deben tener por lo regular un
    // valor previamente definido)

    // Para realizar un salida por consola se usa:
    println("Variables de Tipo IMPLICITO")

    /*Las Variables de Tipo IMPLICITO son aquellas a las cuales les definimos o asignamos un valor
     sin necesidad de especificar el tipo de variable, Ejemplo: Int, Float, String, Boleean, etc */

    var numero = 65 // Variable de Tipo Entero

    var decimal = 62.5 // Variable de Tipo Decimal

    var texto = "Hola, me llamo Carlos" // Variable de String

    val fecha = "10-03-20" // Constante de tipo de Date

    /* Para llamar una variable o "invocarla" usamos lo siguiente ${} y dentro de las llaves
     agregamos la variable relacionada. Ejemplo: */

    println("El numero entero dentro del programa es: ${numero}")


}