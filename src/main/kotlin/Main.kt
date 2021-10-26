fun main(args: Array<String>) {
    print("Digite sua idade: ")
    var idade = readLine()!!.toInt()

    var ingresso = 18.0
    var desconto1 = (ingresso * 60)/100
    var desconto2 = (ingresso * 55)/100

    if (idade >= 0 && idade < 5){
        println("60% de desconto no ingresso R$$desconto1: Ingresso R$${ingresso - desconto1}")
    }else if (idade > 60){
        println("55% de desconto no ingresso R$$desconto2: Ingresso R$${ingresso - desconto2}")
    }else
        print("Digite quantos Ingressos irá comprar: ")
        var quantIngresso = readLine()!!.toInt()

    var descontoInteira = (ingresso * 30)/100

    if(quantIngresso >= 2){
        println("Desconto de 30% no valor de cada ingresso R$$descontoInteira: " +
                "R$${ingresso - descontoInteira} por ingresso")
    }else
        println("O valor do ingresso é R$$ingresso")
}