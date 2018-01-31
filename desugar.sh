#!/usr/bin/env bash
#usage ./desugar.sh com/anadea/MyClass.scala
scalac -Xprint:parser -d /tmp src/main/scala/$1
