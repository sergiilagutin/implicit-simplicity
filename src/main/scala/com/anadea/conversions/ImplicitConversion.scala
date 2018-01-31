package com.anadea.conversions

import scala.language.implicitConversions

object ImplicitConversion extends App {

  def call(str: String): Unit =
    println(str)

  implicit def intToString(i: Int): String = i.toString

  call(1)
}

/**
    package com.anadea.conversions {
      import scala.language.implicitConversions;
      object ImplicitConversion extends AnyRef with App {
        def <init>(): com.anadea.conversions.ImplicitConversion.type = {
          ImplicitConversion.super.<init>();
          ()
        };
        def call(str: String): Unit = scala.Predef.println(str);
        implicit def intToString(i: Int): String = i.toString();
        ImplicitConversion.this.call(ImplicitConversion.this.intToString(1))
      }
    }
  */
