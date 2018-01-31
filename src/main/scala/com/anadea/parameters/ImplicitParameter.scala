package com.anadea.parameters

object ImplicitParameter extends App {
  implicit val executor: Executor =
    (task: Task) => println(task.toString)

  def run(task: Task)(implicit executor: Executor): Unit =
    executor.run(task)

  run(new Task {})
}

trait Task

trait Executor {
  def run(task: Task)
}
