package com.anadea.extensions

import scala.language.implicitConversions

object MethodExtension extends App {
  implicit def richString(str: String) = new {
    def awesomeMethod(): Unit =
      println(s"awesomeMethod for $str")
  }

  "string".awesomeMethod()
}
