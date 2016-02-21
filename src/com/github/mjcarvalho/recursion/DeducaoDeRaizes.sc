/**
  * @Author Mauricio Carvalho
  *      y                x/y        ((x/y) + y) / x = y(n)
  * 	 Ponto    	    coeficiente 	   Proximo Ponto
  * 	   1              2/1=2        (2+1) / 2 = 1.5
  *     1.5          2/1.5=1.33      (1.33+1.5) / 2 = 1.4167
  *    1.4167				    ...               ....
  *
  * Explicacao detalhada sobre o metodo de Newton para deducao de raizes de uma funcao.
  * http://mitpress.mit.edu/sicp/chapter1/node9.html
  * https://www.youtube.com/watch?v=k7pem_6z5_c
  */
object DeducaoDeRaizes {
  def raiz(x: Double) = {

    def abs(x: Double) = if (x < 0) -x else x

    def raizInt(ponto: Double, x: Double): Double =
      if (isPontoMaisProximoDeZero(ponto, x)) ponto
      else raizInt(calculaProximoPontoDaFuncao(ponto, x), x)

    def isPontoMaisProximoDeZero(ponto: Double, x: Double): Boolean =
      abs(ponto * ponto - x) / x < 0.001

    def calculaProximoPontoDaFuncao(ponto: Double, x: Double) =
      (ponto + x / ponto) / 2
    raizInt(1.0, x)      //> raiz: (x: Double)Double
  }

  raiz(4)                //> res0: Double = 2.000609756097561
  raiz(2)                //> res1: Double = 1.4142156862745097
  raiz(0.001)            //> res2: Double = 0.03162278245070105
  raiz(1e-6)             //> res3: Double = 0.0010000001533016628
  raiz(1e60)             //> res4: Double = 1.0000788456669446E30
}