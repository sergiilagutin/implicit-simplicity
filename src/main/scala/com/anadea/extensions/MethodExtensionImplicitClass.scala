package com.anadea.extensions

import scala.language.implicitConversions

object MethodExtensionImplicitClass extends App {

  implicit class RichString(str: String) {
    def awesomeMethod(): Unit =
      println(s"awesomeMethod for $str")
  }

  "string".awesomeMethod()
}
