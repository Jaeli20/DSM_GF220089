fun main(args: Array<String>) {

    var numero=numeros();
    var opcion1:Int=0
    var opcion2:Int=0
    var escaner:Int = 0

    do {

        println("Menu\n"+"1. Ingresar numeros\n"+"2. Salir")
        opcion1= readln().toInt()

        if (opcion1==1){
        println("Ingrese el primer numero: ")
        escaner= readln().toInt()
        numero.primero=escaner
        escaner=0

            println("Ingrese el segundo numero: ")
            escaner= readln().toInt()
            numero.segundo=escaner
            escaner=0

            println("Ingrese el tercer numero: ")
            escaner= readln().toInt()
            numero.tercero=escaner
            escaner=0


                do {
                    println("1. Calcular\n"+"2. Regresar\n")
                    opcion2= readln().toInt()

                    if (opcion2==1){

                        println("Numeros: "+"\n1. "+numero.primero+"\n2. "+numero.segundo+"\n3. "+numero.tercero)
                        println("Numero mayor: "+comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)+" -> "+comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)+" + "+" 10 " +" = "+(comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)+10))
                        println("Numero menor: "+comprobarNumeroMenor(numero.primero,numero.segundo,numero.tercero)+" -> "+comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)+" - "+" 5 " +" = "+(comprobarNumeroMayor(numero.primero,numero.segundo,numero.tercero)-5))

                    }


                }while (opcion2!=2)
        }
    }while ((opcion1!=2))

}

