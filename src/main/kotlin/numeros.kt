class numeros {

    var primero:Double = 0.0
    var segundo:Double = 0.0
    var tercero:Double = 0.0




}fun comprobarNumeroMayor(primero:Double,segundo:Double,tercero:Double): Double{
    var numeroMayor: Double =0.0

    if (primero>segundo && primero>tercero){
        numeroMayor=primero;
    };if (segundo>primero && segundo>tercero){
        numeroMayor=segundo
    };if (tercero>primero && tercero>segundo){
        numeroMayor=tercero
    }
    return numeroMayor;
}fun comprobarNumeroMenor(primero:Double,segundo:Double,tercero:Double):Double {
    var numeroMenor: Double = 0.0

    if (primero<segundo && primero<tercero){
        numeroMenor=primero;
    };if (segundo<primero && segundo<tercero){
        numeroMenor=segundo
    };if (tercero<primero && tercero<segundo){
        numeroMenor=tercero
    }
    return numeroMenor;
}