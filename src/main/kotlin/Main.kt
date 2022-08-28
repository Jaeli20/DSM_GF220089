fun main(args: Array<String>) {

    var numero=numeros();
    var opcion1:Int=0
    var opcion2:Int=0
    var escaner:Double = 0.0

    do {

        println("Menu\n"+"1. Ingresar numeros\n"+"2. Salir")
        opcion1= readln().toInt()

        if (opcion1==1){




                println("Ingrese el primer numero: ")
                escaner = readln().toDouble()
                numero.primero = escaner
                escaner = 0.0

                println("Ingrese el segundo numero: ")
                escaner = readln().toDouble()
                numero.segundo = escaner
                escaner = 0.0

                println("Ingrese el tercer numero: ")
                escaner = readln().toDouble()
                numero.tercero = escaner
                escaner = 0.0

            if ((numero.primero%1)!=0.0){
                println("el primer numero no es entero")
            } ;if ((numero.segundo%1)!=0.0){
                println("el segundo numero no es entero")
            };if ((numero.tercero%1)!=0.0){
                println("el tercero numero no es entero")
            }else{
                println("Todos son enteros")
            }

            ;if (numero.primero == numero.segundo || numero.primero == numero.tercero || numero.segundo==numero.tercero){
                println("Hay un numero repetido")
            }else{
                println("Todos son diferentes")
            }

            ;if ((numero.primero%5)!=0.0){
                println("El primer numero no es multiplo de 5")
            };if ((numero.segundo%5)!=0.0){
                println("El primer numero no es multiplo de 5")
            };if ((numero.tercero%5)!=0.0){
                println("El primer numero no es multiplo de 5")
            }else{
                println("Todos son multiplos de 5")
            }



                do {
                    println("1. Calcular\n"+"2. Regresar\n")
                    opcion2= readln().toInt()

                    if (opcion2==1){

                        println("Numeros: "+"\n1. "+numero.primero+"\n2. "+numero.segundo+"\n3. "+numero.tercero)

                           if (comprobarNumeroMenor(numero.primero,numero.segundo,numero.tercero)>10){

                                   println("Mayor = "+(comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)+10))

                           }
                        if (comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)>50){

                               println("Menor = "+(comprobarNumeroMenor(numero.primero,numero.segundo,numero.tercero)-5))

                           }
                        }
                    }while (opcion2!=2)
        }
    }while ((opcion1!=2))

}

