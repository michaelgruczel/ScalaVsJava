package scala

trait vehicle {

}

trait CanFly extends vehicle {

  def doFly() = {
    println("I fly")
  }
}

trait CanSwim extends vehicle {

  def doSwim() = {
    println("I swim")
  }
}

case class Wasserflugzeug extends CanFly with CanSwim {

}

