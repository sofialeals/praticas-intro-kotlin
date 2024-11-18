package sintaxe_basica

/*
Uma certa empresa pretende verificar se os seus empregados estarão
qualificados ou não para aposentadoria em 2025.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
• Ter no mínimo 65 anos de idade; ou
• Ter trabalhado no mínimo 30 anos; ou
• Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um programa para:
• Ler o nome do empregado, o ano de nascimento e o ano de seu ingresso
na empresa.
• Calcular e exibir a idade e o tempo de trabalho do empregado (estimado
ao final de 2024)
• Exibir a mensagem “Pode Requerer Aposentadoria” se atender aos
requisitos ou “Não Pode Requerer Aposentadoria” caso contrário.
Ao final de cada execução, o programa deverá perguntar se o usuário deseja
fazer nova verificação. Se sim, o programa deverá repetir tudo novamente,
caso contrário deverá encerrar.
*/

fun main(){
    var ano_atual = 2024
    var nome = ""
    var ano_nasc:Int
    var idade:Int
    var ano_ingresso:Int
    var temp_serv:Int
    var opcao = ""

    do {
        println("\nConsulte sua aposentadoria\n")
        println("Digite 1 para fazer uma nova consulta ou 0 (zero) para sair.")
        print("Sua opção: ")
        opcao = readln()

        if(opcao == "0"){
            break
        }

        print("Informe seu nome: ")
        nome = readln()
        print("Informe o ano do seu nascimento: ")
        ano_nasc = readln().toInt()
        print("Informe o ano de ingresso na empresa: ")
        ano_ingresso = readln().toInt()

        idade = ano_atual - ano_nasc
        temp_serv = ano_atual - ano_ingresso

        if(idade >= 65 || temp_serv >= 30 || (idade >= 60 && temp_serv >= 25)){
            println("\n${nome.uppercase()} PODE REQUERER APOSENTADORIA.")
        } else {
            println("\n${nome.uppercase()} NÃO PODE REQUERER APOSENTADORIA.")
        }
    }
    while(opcao.toInt() != 0)
}