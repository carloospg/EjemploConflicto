fun main() {
    println("Voy a calcular el area y la circunferencia de un circulo")
    println("Dame el valor de la base")
    var r: Int = readln().toInt()
    println("dame el valor de el lado ")
    var l = readln().toInt()
    println("area = ${r*l}")
    println("el perimetro es ${2*l+2*r}")
}