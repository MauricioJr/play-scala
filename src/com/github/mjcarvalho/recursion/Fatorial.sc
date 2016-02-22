import scala.annotation.tailrec

object Fatorial {

  def fatorialTailRecursion(n: Long) : Long = {

    @tailrec
    def fat_iterator(acumulador: Long, n: Long): Long =
      if (n == 0) acumulador else fat_iterator(acumulador * n, n - 1)

    fat_iterator(1, n) //> fatorialTailRecursion: (n: Int)Int

    /*
		------        Teste de mesa 4             ------
		--  Acumulador     n     n == 0  function     --
                --	1          4     false   loop(1,4)    --
		--  	4          3     false   loop(4,3)    --
                --	12         2     false   loop(12,2)   --
		--      24         1     false   loop(24,1)   --
		--      24         0     true    return 24    --
		---              Fim de mesa                 ---
	*/

  }

  fatorialTailRecursion(2)  //> res0: Long  = 2
  fatorialTailRecursion(4)  //> res0: Long  = 24
  fatorialTailRecursion(6)  //> res0: Long  = 720
  fatorialTailRecursion(8)  //> res0: Long  = 40320
  fatorialTailRecursion(10)  //> res0: Long = 3628800
}

