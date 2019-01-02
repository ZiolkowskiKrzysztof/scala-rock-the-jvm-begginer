package lectures.part1basics

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {

    if (n <= 1) 1
    else n * factorial(n-1)

  }

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION

    factHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factHelper(10, 1) = factHelper(9, 10 * 1) = factHelper(8, 9 * 10 * 1)..
   */

  // println(anotherFactorial(100))

  // WHEN YOU NEED LOOP, USE _TAIL_ RECURSION.

  /*
    1. Concatenate a string n times
    2. IsPrime tail recursive
    3. Fibonacci function, tail recursive
   */

  //1

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)
  }

  println(concatenateTailrec("Dupa", 5, ""))

  //2

  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (n == 1) false
      else if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, true)
  }

  //3

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)

  }

  println(fibonacci(7))
}
