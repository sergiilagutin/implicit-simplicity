#!/usr/bin/env bash
#usage ./desugar.sh com/anadea/MyClass.scala
scalac -Xprint:typer -d /tmp src/main/scala/$1
