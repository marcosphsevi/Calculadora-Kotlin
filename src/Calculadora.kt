class Calculadora {
    fun calculo () {
        var salir: Boolean = false
        var input: String
        var numeros: DoubleArray;
        do {
            menu()
            input = readln()
            if (!Excepciones.enteros(input)){
                println("Tienes que introducir un número entero.")
            }else{
                when (input.toInt()){
                    1 ->{
                        println("Sumar")
                        numeros = inputs()
                        val resultado = numeros[0]+numeros[1]
                        println(numeros[0].toString() + " + " + numeros[1].toString() + " = " + (numeros[0] + numeros[1]))
                        println("El resultado de la suma es: $resultado")
                    }
                    2 ->{
                        println("Restar")
                        numeros = inputs()

                    }
                    3 ->{
                        
                    }
                    4 ->{

                    }
                    5 ->{

                    }
                    6 ->{
                        salir = true
                    }
                    else ->{
                        println("Tienes que introducir una opción comprendida entre 1 y 6.")
                    }
                }
            }
        }while (!salir)
    }

    fun inputs (): DoubleArray{
        var input: String;
        var a: Double
        var b: Double
        while (true){
            println("Introduce un número: ")
            input = readln()
            if (Excepciones.decimales(input)){
                a = input.toDouble()
                break
            }
            println("Tienes que introducir un número decimal")
        }
        while (true){
            println("Introduce otro número: ")
            input = readln()
            if (Excepciones.decimales(input)){
                b = input.toDouble()
                break
            }
            println("Tienes que introducir un número decimal")
        }
        return doubleArrayOf(a, b)
    }

}