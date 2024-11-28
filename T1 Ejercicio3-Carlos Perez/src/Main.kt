fun main() {
    println("Voy a calcular el area y la circunferencia de un circulo")
    println("Dame el valor del radio del circulo")
    var r: Int = readln().toInt()
    var a = r * 3.14
    var c = 2 * r * 3.14
    println("El area del circulo es de: $a cm")
    println("La circunferencia del circulo es de: $c cm")
}