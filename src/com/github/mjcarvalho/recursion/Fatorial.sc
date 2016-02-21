package com.github.mjcarvalho.recursion

import scala.annotation.tailrec

object Fatorial {

  def fatorialTailRecursion(n: Int) = {

    @tailrec
    def fat_iterator(acumulador: Int, n: Int): Int =
      if (n == 0) acumulador else fat_iterator(acumulador * n, n - 1)

    fat_iterator(1, n) //> fatorialTailRecursion: (n: Int)Int

  /*
		---- 					Teste de mesa 						------
		--	Acumulador   n		 n == 0  function			--
	  --		1          4     false   loop(1,4)    --
		--  	4          3     false   loop(4,3)    --
	  --		12         2     false   loop(12,2)   --
		--		24         1     false   loop(24,1)   --
		--		24         0     true    return 24    --
		---- 					 Fim de mesa  						------

	*/

  fatorialTailRecursion(4)   //> res0: Int = 24

}