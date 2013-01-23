val entry1 = ScalaTimeSheetEntry()
val entry2 = ScalaTimeSheetEntry("homer")
val entry3 = ScalaTimeSheetEntry("homer", 30)
val entry4 = ScalaTimeSheetEntry(minutes=30)
println(entry1)
println(entry2)
println(entry3)
println(entry4)
val entry5 = entry3 + entry4
println(entry5)
val list = List(entry1, entry2, entry3, entry4, entry5)

println(ScalaTimeSheetUtil.filterEntriesByUser("homer", list))
println(ScalaTimeSheetUtil.addTime(10, list))
println(ScalaTimeSheetUtil.aggregateTimes(list))
println(ScalaTimeSheetUtil.timesGroupedByUser(list))

val example = Wasserflugzeug()
example.doFly()
example.doSwim()

print(LazyEvalExample.ramdomNumbers())
LazyEvalExample.ramdomNumbers().take(5).print()
LazyEvalExample.ramdomNumbers().take(10).print()