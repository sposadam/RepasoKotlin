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
    /*println("Variables de Tipo IMPLICITO")

    /*Las Variables de Tipo IMPLICITO son aquellas a las cuales les definimos o asignamos un valor
     sin necesidad de especificar el tipo de variable, Ejemplo: Int, Float, String, Boleean, etc */

    var numero = 65 // Variable de Tipo Entero

    var decimal = 62.5 // Variable de Tipo Decimal

    var texto = "Hola, me llamo Carlos" // Variable de String

    val fecha = "10-03-20" // Constante de tipo de Date

    /* Para llamar una variable o "invocarla" usamos lo siguiente ${} y dentro de las llaves
     agregamos la variable relacionada. Ejemplo: */

    println("El numero entero dentro del programa es: ${numero}")

    // Variables de tipo Explicito

    println("Variables de Tipo EXPLICITO")

    /* Estas se usan directamente especificando el tipo de variable o tipo de dato que
     contendrá. Ejemplo: */

    var numero1: Int

    var decimal1:  Double

    var caracter: Char

    /* NOTA: Para poder imprimir en pantalla una variable de tipo explicita, esta debe estar iniciada
    con algún valor previamente */

    // Para el tema de operaciones matematicas se usan los siguientes operadores lógicos:
    /* Para la suma se usa el simbolo: +
     Para la resta usamos el simbolo: -
     Para la Multiplicación se usa: *
     Y para la división usamos el simbolo: /
     */

    /* Si deseamos imprimir algo por consola sin necesidad de usar varios saltos de línea,
    * lo podemos realizar usando el println (""" con tres comillas dobles """).
    * Al usarlo de esta manera Kotlin ya identifica que queremos imprimir varias lineas
    *  pero dentro de un solo println() */

    println("""
        Opcion 1 
        Opcion 2
        Opcion 3
    """.trimIndent()) */

    //CONVERSIONES TIPOS DE DATOS

    /*
    var total = "20" // Esta variable es tipo String porque esta entre ""

    var convertir = total.toInt() // Por medio de esto convertimos un String a un Integer o Entero

    // INGRESAR DATOS POR TECLADO

    println("Ingrese el primer valor numerico")
    var n1 = readln().toInt() /*  Con este comando el programa entiende
     que se van a ingresar datos de manera manual*/

    println("Ingrese el segundo valor numerico")
    var n2 = readln().toInt() /*  Con este comando el programa entiende
     que se van a ingresar datos de manera manual*/

    var suma = n1 + n2

    println("La suma entre ${n1} y ${n2} es $suma")

    // ESTRUCTURAS

    // Condicionales IF - ELSE

    /*
    if (Evalúa una condición) {
        Instrucción - Verdadera
    } else{
        Instrucción - Falsa
    }
     */

    // EJEMPLO
    println("INGRESE SU EDAD")
    var edad = readln().toInt()

    if (edad >= 18) {
        println("Eres mayor de edad")
    }
    else {
        println("Eres menor de edad")
    }
    */
    println("INGRESE UN NUMERO ENTERO")
    var numero = readln().toInt()

    if (numero > 0) {
        println("EL NUMERO ES POSITIVO")
    } else if (numero < 0) {
        println("EL NUMERO ES NEGATIVO")
    } else {
        println("EL NUMERO DIGITADO ES CERO")
    }


}