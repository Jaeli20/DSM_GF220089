class numeros {

    var primero:Int = 0
    var segundo:Int = 0
    var tercero:Int = 0




}fun comprobarNumeroMayor(primero:Int,segundo:Int,tercero:Int): Int{
    var numeroMayor: Int =0

    if (primero>segundo && primero>tercero){
        numeroMayor=primero;
    };if (segundo>primero && segundo>tercero){
        numeroMayor=segundo
    };if (tercero>primero && tercero>segundo){
        numeroMayor=tercero
    }
    return numeroMayor;
}fun comprobarNumeroMenor(primero:Int,segundo:Int,tercero:Int):Int {
    var numeroMenor: Int = 0

    if (primero<segundo && primero<tercero){
        numeroMenor=primero;
    };if (segundo<primero && segundo<tercero){
        numeroMenor=segundo
    };if (tercero<primero && tercero<segundo){
        numeroMenor=tercero
    }
    return numeroMenor;
}