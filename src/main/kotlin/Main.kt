fun main(args: Array<String>) {
    print("Digite sua idade: ")
    var idade = readLine()!!.toInt()

    var ingresso = 18.0
    var desconto1 = (ingresso * 60)/100
    var desconto2 = (ingresso * 55)/100

    if (idade < 5){
        println("60% de desconto no ingresso R$$desconto1: Ingresso R$${ingresso - desconto1}")
    }else if (idade > 60){
        println("55% de desconto no ingresso R$$desconto2: Ingresso R$${ingresso - desconto2}")
    }else
        print("Digite quantos Ingressos irá comprar: ")
        var quantIngresso = readLine()!!.toInt()

    var descontoInteira = (ingresso * 30)/100

    if(quantIngresso >= 2){
        println("30% de desconto em cada ingresso R$$descontoInteira: " +
                "Ingresso R$${ingresso - descontoInteira}")
    }else
        println("O valor do ingresso é R$$ingresso")

    if (quantIngresso > 1) {
        var somaIngresso = (ingresso - descontoInteira) * quantIngresso
        println("O valor total dos ingressos é: R$$somaIngresso")
    }else {
        println("Você pagará o valor da inteira no seu ingresso R$$ingresso")
    }
}
