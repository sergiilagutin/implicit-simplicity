package com.anadea.conversions

import scala.language.implicitConversions

object ImplicitConversion extends App {

  def call(str: String): Unit =
    println(str)

  implicit def intToString(i: Int): String = i.toString

  call(1)
}
