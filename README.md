# Scala vs Java

## Einleitung

Dieses Projekt beinhaltet einigen primitiven Java-Code und dazu
passenden Scala-Code und soll einige Beispiele geben
wie Scala Java Probleme elegant löst.

## Programmierparadigmen

Um zu verstehen warum funktionale Programmierung die Zukunft
sein könnte und warum Java-Programmierer einen leichten Umstieg über Scala
gehen können, sollte man ein paar Eckdaten über die verschiedenen
Programierparadigmen kennen.

### Imperativ/Prozedural

#### Definition

*"Bei der imperativen Programmierung werden Programme als aufeinander folgende Befehle formuliert.
Die Befehle verändern während der Programmausführung in Variablen gespeicherte Werte und können
ermitteln so Berechnungsergebnisse.
Bei der prozeduralen Programmierung wird die Gesamtaufgabe, die eine Software lösen soll,
in kleinere Teilaufgaben aufgelöst. Jede Teilaufgabe für sich ist einfacher zu beschreiben,
programmieren und testen"* (http://www.itwissen.info/)

#### Einsatzkontext

Als Computer noch so groß wie Räume waren und lediglich zur Berechnung von mathematischen
Berechnungen verwendet wurden, der Ablauf linear war und an Paralellisierung oder event getriebenes
design nicht zu denken war enstprach diese Art zu Programmieren den Hardwaremöglichkeiten der
Zeit und ist Heute höchstens noch aus Skripten bekannt.
Damals (1943) hat Thomas J. Watson gesagt  „I think there is a world market for maybe five computers.“
Imperative Programmierung ist die Vergangenheit.

#### Nachteile
Imperative Programmierung gehört in der Regel der Vergangenheit an. Lineare Abläufe
sind nicht mehr im Hauptfokus der Entwicklung.

### Objektorientiert

#### Definition

*"Die objektorientierte Programmierung (kurz OOP) ist ein auf dem Konzept der
Objektorientierung basierendes Programmierparadigma.
Die Grundidee dabei ist, Daten und Funktionen, die auf
diese Daten angewandt werden können, möglichst eng in
einem sogenannten Objekt zusammenzufassen und nach
außen hin zu kapseln, so dass Methoden fremder
Objekte diese Daten nicht versehentlich manipulieren
können."* (http://www.itwissen.info/)

#### Einsatzkontext

Als die Computer für viele Firmen erschwinglich wurden und die Leistung sich drastisch erhöhte
konnte man über die Abbildung komplexer realer Prozesse in Software nachdenken. Hierzu bedurfte
es einen anderen Ansatzes. Enstanden ist die objektorientierte Programmierung mit der sich auch
komplexere Zusammenhänge abbilden lassen. In diesem Paradigma bewegt sich auch Java und hat auch
weiter seine Berechtigung.
Objektorientierte Programmierung ist die Gegenwart.

#### Nachteile

Nach Amdahl wird der Geschwindigkeitszuwachs vor allem durch den sequentiellen
Anteil des Problems beschränkt, da sich dessen Ausführungszeit durch
Parallelisierung nicht verringern lässt. In den letzten Jahrenzehnten sind
die Rechner immer schneller geworden. Hierbei ist von Taktung der Prozessoren die Rede.
Aber seit einigen Jahren steigt die Taktung nicht mehr. Ein Zuwachs der
Performance verspricht die Paralellisierung. Moderne Prozessoren haben immer mehr Kerne.
Daten welche über mehrere Kerne verteilt werden stellen hierbei das Bottleneck dar.
Wird ein Objekt parallel auf verschiedenen Kernen bearbeitet, so bekommt jeder Kern
eine lokale Kopie der Variablen. Somit blockiert die
Verarbeitung nicht aber damit können Inkonsistenzen enstehen, denn
die Variable wurde parallel evt nach dem kopieren manipuliert.
Objektorientiertes Programmieren ist somit nicht frei von Nebenwirkungen
(weil die Objekte konzeptuell mutable sind).
Dies lässt sich natürlcih verhindern (locking, atomare Variablen,
synchronized Blöcke oder volatile Variablen), dies bedeutet aber dass
die parallele Verarbeitung geblockt wird.
(vergleiche auch http://www.youtube.com/watch?v=2AcgjBFaviU)


### Funktional

Funktionale Programmierung ist ein Programmierparadigma, bei dem Programme ausschließlich aus
Funktionen bestehen. Dadurch werden die aus der imperativen Programmierung bekannten Nebenwirkungen vermieden.
Objekte sind prinzipiell immutable. Damit können die Befehle perfekt auf die Kerne verteilt werden.
Funktionale Programmierung ist möglicherweise die Zukunft.

#### Einsatzkontext

Funktionale Programmierung ist hoch performant und Seiteneffektfrei, möglicherweise noch nicht
für jeden so einfach zu verstehen wie objektorientierte Programmierung und eignet sich damit
ideal für einfache hochperformante Microservices.

#### Nachteile

Viele Funktionale Programmiersprachen haben noch keine gute IDE-Unterstützung
und es gibt wenig Bibliotheken und wenig Deploymentmöglichkeiten.

## Scala

Scala bietet sich für Java-Entwickler bestens an um in die funktionale Programmierung einzusteigen.
Einige Kernfeatures sind:

* Scala läuft in der VM, damit lässt sich Scala in Java-taugliche Server / Clouds deployen
* Unterstützung durch Eclipse, IntelliJ, Netbeans, ...
* Java lässt dich aus Scala aus aufrufen, womit Bibliotheken weiterverwendbar sind
* Scala unterstützt funktionale Programmierung aber auch Objektorientierte
* Scala Code ist ähnlich zu Java-Code
* Scala ist elegant

## Scala vs Java in Action

In diesem Projekt befinden sich ein paar Beispiele.
Man vergleiche den Code in package java mit dem
Code im package scala. Die Beispiele sollen einige coole Features
von Scala zeigen, sind aber natürlich nicht vollständig.

### Elegant

Man braucht in Scala deutliche weniger und einfacheren Code als in Java, hier einige Beispiele.

#### case classes

Häufig braucht man in Java 2 typen von Klassen. klassische Beans und Singletons.
Dafür gibt es in Scala keywords. Klassische Beans haben in Scala den classifier case class.
Damit werden alle Felder welche in einem Konstruktor vorkommen angelegt. Ebenso wird automatisch
die equals und hashCode generiert. Damit werden klassische Beans zum Einzeiler.
Falls man dann mal eine geschriebene equals Methode sieht bei der eine Feld nicht beachtet wird,
ist auch klar das dies Absicht war. In Java könnte jemand auch vergessen haben die Methode neu
durch die IDE zu generieren, nachdem er ein Feld hinzugefügt hat.

#### defaults

Scala supported default-Werte. Man vergleiche die Konstruktoren in ScalaTimeSheetEntry mit JavaTimeSheetEntry
Damit kann man sich zum Beispiel das anlegen mehrfacher, quasi identischer Konstruktore sparen.

#### operatoren

Scala erlaubt auch Operatoren-Bezeichner wie "+". Man schaue sich die "+"-Funktion des ScalaTimeSheetEntry an.

#### high order Funktionen

In Scala sind Funktionen auch nur Objekte und können somit auch als Parameter übergeben werden.
Ein Beispiel dafür ist die filter Funktion welche im ScalaTimeSheetUtil verwendet wird.

### Traits

Scala unterstützt eine Form von Mehrfachvererbung. Man schaue sich das TraitExample an.

### Lazy Evaluation

Scala unterstützt das auswerten von Parametern zur Laufzeit. Ein Beispiel ist das LazyEvalExample.

## Weitere Infos

* https://github.com/michaelgruczel/ScalaVsJava
* Programming in Scala (Odersky)
* Scala by Example(Frei als PDF, Odersky)
* http://twitter.github.com/scala_school/
* Coursera
* Scala website
* http://prezi.com/gsacc7afvbin/ein-sehr-sehr-kurzer-einblick-in-scala-und-die-funktionale-programmierung/

