package com.cibertec.cibertecapp.kotlin

class Empleado(val nombre:String, val edad: Int, val salario: Int, val cargo: String){}

fun main(){
    val empleado1 = Empleado("Jose Diaz Lopez", 30, 400, "diseñador")
    val empleado2 = Empleado("Pedro", 33, 320, "practicante")
    val empleado3 = Empleado("Juan", 23, 540, "desarrollador")
    val empleado4 = Empleado("Dante", 22, 403, "gerente")

    val empleados = listOf<Empleado>(empleado1, empleado2, empleado3, empleado4);

    fun  calcularBonificacion(cargo: String, salario: Int): Double{
        when(cargo){
            "diseñador" -> return salario * 0.08;
            "practicante" -> return salario * 0.05;
            "desarrollador" -> return salario * 0.15;
            "gerente" -> return salario * 0.08;
            else -> return salario * 0.25;
        }
    }
    for (empleado in empleados){
        val bonificacion: Double = calcularBonificacion(empleado.cargo, empleado.salario)
        println("\n |---Empleado---|\n" +
                "Nombre: ${empleado.nombre} \n" +
                " Edad: ${empleado.edad} \n Salario:" +
                " ${empleado.salario} \n Cargo: " +
                "${empleado.cargo} \n Bonificacion: " +
                "$bonificacion");
    }
}