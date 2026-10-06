class Calculadora {
    fun calculo () {
        var salir: Boolean = false
        var input: String
        var numeros: DoubleArray;
        do {
            menu()
            input = readln()
            if (!Excepciones.enteros(input)){
                System.err.println("Error: Tienes que introducir un número entero.")
            }else{
                when (input.toInt()){
                    1 ->{
                        println("Sumar")
                        numeros = inputs()
                        val resultado = numeros[0]+numeros[1]
                        println(numeros[0].toString() + " + " + numeros[1].toString() + " = " + resultado)
                        println("El resultado de la suma es: $resultado")
                    }
                    2 ->{
                        println("Restar")
                        numeros = inputs()
                        val resultado = numeros[0]-numeros[1]
                        println(numeros[0].toString() + " - " + numeros[1].toString() + " = " + resultado)
                        println("El resultado de la resta es: $resultado")
                    }
                    3 ->{
                        println("Multiplicar")
                        numeros = inputs()
                        val resultado = numeros[0]*numeros[1]
                        println(numeros[0].toString() + " * " + numeros[1].toString() + " = " + resultado)
                        println("El resultado de la multiplicacion es: $resultado")
                    }
                    4 ->{
                        println("División")
                        numeros = inputs()
                        if(numeros[1] != 0.0){
                            val resultado = numeros[0]/numeros[1]
                            println(numeros[0].toString() + " / " + numeros[1].toString() + " = " + resultado)
                            println("El resultado de la división es: $resultado")
                        }else{
                            System.err.println("Error: No se puede dividir entre 0")
                        }
                    }
                    5 ->{
                        println("Resto")
                        numeros = inputs()
                        if(numeros[1] != 0.0){
                            val resultado = numeros[0]%numeros[1]
                            //println(numeros[0].toString() + " % " + numeros[1].toString() + " = " + resultado)
                            println("El resultado del resto es: $resultado")
                        }else{
                            System.err.println("Error: No se puede dividir entre 0")
                        }
                    }
                    6 ->{
                        salir = true
                    }
                    else ->{
                        System.err.println("Error: Tienes que introducir una opción comprendida entre 1 y 6.")
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
            println("Introduce el primer número: ")
            input = readln()
            if (Excepciones.decimales(input)){
                a = input.toDouble()
                break
            }
            System.err.println("Error: Tienes que introducir un número decimal")
        }
        while (true){
            println("Introduce el segundo número: ")
            input = readln()
            if (Excepciones.decimales(input)){
                b = input.toDouble()
                break
            }
            System.err.println("Error: Tienes que introducir un número decimal")
        }
        return doubleArrayOf(a, b)
    }

}