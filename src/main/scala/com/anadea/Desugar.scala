package com.anadea

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

object Desugar {
  def desugarImpl(c: Context)(expr: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._
    println(show(expr.tree))
    reify {}
  }

  def desugar(expr: Any) = macro desugarImpl
}
