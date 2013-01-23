package scala

case class ScalaTimeSheetEntry(name: String = "unknown", minutes: Int = 0) {

  def +(that: ScalaTimeSheetEntry): ScalaTimeSheetEntry = {
    ScalaTimeSheetEntry(this.name, this.minutes + that.minutes)
  }

}
