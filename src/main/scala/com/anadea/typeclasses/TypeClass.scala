package com.anadea.typeclasses

object Equal {
  def apply[A](implicit instance: Equal[A]): Equal[A] =
    instance

  implicit class EqualSyntax[A](a: A) {
    def equal(that: A)(implicit e: Equal[A]): Boolean =
      e.equal(a, that)
  }

}

trait Equal[A] {
  def equal(a1: A, a2: A): Boolean
}

object TypeClass extends App {
  implicit val intEqual: Equal[Int] =
    (a1: Int, a2: Int) => a1 == a2

  println(Equal[Int].equal(1, 2))

  import Equal.EqualSyntax

  println(1 equal 2)
}
