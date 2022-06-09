fun main() {
  println("CALCULADORA BÁSICA QUE SÓ SOMA, DIVIDE, MULTIPLICA E SUBTRAI\n")
  println("Digite a opção desejada:")
  println("""
1 - Para somar
2 - Para subtrair
3 - Para dividir
4 - Para multiplicar
          """)
  val opcao = readLine()!!.toInt()

  when(opcao) {
    1 -> soma()
    2 -> subtrai()
    3 -> divide()
    4 -> multiplica()
    else -> {
      println("Opção inválida!")
    }
  }
}

fun soma(){
  println("OPÇÃO DE SOMA ESCOLHIDA")
  
  print("Digite o primeiro número: ")
  val n1 = readLine()!!.toDouble()
  
  print("Digite o segundo número: ")
  val n2 = readLine()!!.toDouble()
  
  val resultadoSoma = n1 + n2
  
  println("O resultado da soma de $n1 e $n2 é $resultadoSoma.")
}

fun subtrai() {
  println("OPÇÃO DE SUBTRAÇÃO ESCOLHIDA")
  
  print("Digite o primeiro número: ")
  val n1 = readLine()!!.toDouble()
  
  print("Digite o segundo número: ")
  val n2 = readLine()!!.toDouble()
  
  val resultadoSubtracao = n1 - n2
  
  println("O resultado da subtração de $n1 e $n2 é $resultadoSubtracao.")
}

fun divide() {
  println("OPÇÃO DE DIVISÃO ESCOLHIDA")
  
  print("Digite o primeiro número: ")
  val n1 = readLine()!!.toDouble()
  
  print("Digite o segundo número: ")
  val n2 = readLine()!!.toDouble()
  
  val resultadoDivisao = n1 / n2
  println("O resultado da divisão de $n1 e $n2 é $resultadoDivisao.")
}

fun multiplica() {
  println("OPÇÃO DE MULTIPLICAÇÃO ESCOLHIDA")
  
  print("Digite o primeiro número: ")
  val n1 = readLine()!!.toDouble()
  
  print("Digite o segundo número: ")
  val n2 = readLine()!!.toDouble()
  
  val resultadoMultiplicacao = n1 / n2
  println("O resultado da divisão de $n1 e $n2 é $resultadoMultiplicacao.")
}