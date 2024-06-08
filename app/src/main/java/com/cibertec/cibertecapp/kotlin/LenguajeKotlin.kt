package com.cibertec.cibertecapp.kotlin

fun main() {
    //.1 Variables
    var miVariable: Int = 10
    val miVariableInm: Int = 20
    miVariable = 100

    var pi: Double = 3.1416

    // Inferencia de Tipo
    var edad = 30

    //2. Tipos de datos
    val myInt: Int = 0
    val myDouble: Double = 2.5
    val myBool: Boolean = true
    val myFloat: Float = 2.5f
    val myByte: Byte = 127
    val  myLong: Long = 1515
    val myChar: Char = 'A'
    val myString: String = "Cibertec"

    //imprimir valores
    print(myChar)
    println(myString)

    // Log.v("", "")
    print("Entero: $myInt")
    print("Double: $myDouble")

    // Arreglos
    val myArray = arrayOf<Int>(20,15,20)
    val myArrayMix = arrayOf(10, "A", true)

    var myList = listOf(1, 2, 3, 4, 5)
    var myArrayList = arrayListOf<Int>(2, 3, 4)

    // Condicionales
    var aprobarCurso: Boolean = true
    if(aprobarCurso){
        println("sere feliz")
    } else{
        println("Aprendere mas de android")
    }
    var cursos = listOf("Android", "Java", "PHP", "Swift")
    for (curso in cursos){
        print(curso)
    }

    for((index, value ) in cursos.withIndex()) {
        print("$index : $value")
    }

    //While
    var contador = 0
    while (contador < cursos.size){
        print(cursos[contador])
        contador++
    }

    // Do While
    var maximo: Int = 10
    var contador2: Int = 0
    do{
        println("Contador es $contador2")
        contador2++
    } while (contador2 <= maximo)


    //When
    val mes: Int = 4
    when(mes){
        1 -> "Enero"
        2 -> "Febrero"
        else -> "Verifique sus datos"
    }

    print(4+4)
    print(4-2)
    print(4*5)
    print(20/5)
    print(9%4) // Operador Modulo
}

fun sumar(a: Int, b: Int){
    print(a+b)
}

fun sumarReturn(a: Int, b:Int): Int{
    return a + b
}

// Persona:  nombre: String, apellidos: String, edad: Int, dni: Int
class Persona(val nombre: String, val apellidos: String,
        edad: Int, dni: Int){

        fun  mostrarDatos(){
            print("$nombre $apellidos")
        }
}

val persona = Persona("Jose","Lopez", 25, 73123454)

class Carro(val marca: String, val modelo: String){

    constructor(marca: String, modelo: String, color: String) :
            this(marca, modelo) {

    }
}








