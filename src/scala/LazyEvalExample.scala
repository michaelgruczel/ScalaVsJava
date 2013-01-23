package scala

import util.Random

object LazyEvalExample {

    def ramdomNumbers(): Stream[Int] = {

      Random.nextInt #:: ramdomNumbers()

    }

  }
