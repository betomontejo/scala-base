package com.example

import org.scalatest._

class MyClassTest extends FlatSpec with Matchers {

  "MyClass" should "Say hello" in {
    val scala = new MyClass("Scala")
    scala.hello should equal ("Hello Scala")
  }

}
