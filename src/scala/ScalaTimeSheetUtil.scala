package scala

import scala.Predef.String
import scala.Predef.Map

object ScalaTimeSheetUtil {

  def filterEntriesByUser(user: String, entries: List[ScalaTimeSheetEntry]): List[ScalaTimeSheetEntry] = {

    //def filter(entry:ScalaTimeSheetEntry) = {
    //  entry.name.equals(user)
    //}
    //entries.filter(filter)
    entries.filter(_.name.equals(user))

  }

  def addTime(addMinutes: Int, entries: List[ScalaTimeSheetEntry]): List[ScalaTimeSheetEntry] = {

    for (entry <- entries) yield ScalaTimeSheetEntry(entry.name, entry.minutes + addMinutes)

  }

  def aggregateTimes(entries: List[ScalaTimeSheetEntry]) : Int = {

    entries.foldLeft(0)((result,entry) => result + entry.minutes)

  }

  def timesGroupedByUser(entries: List[ScalaTimeSheetEntry]): Map[String, List[ScalaTimeSheetEntry]] = {

    entries.groupBy(_.name)

  }
}
