# Scala vs Java

## Einleitung

Dieses Projekt beinhaltet einigen primitiven Java-Code und dazu
passenden Scala-Code und soll als einige Beispiele geben
wie Scala einige Java Probleme elegantn löst.

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
wird ein Objekt parallel auf verschiedenen Kernen bearbeitet, so bekommt jeder Kern
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
Objekte sind pronzipiell immutable. Damit können die Befehler perfekt auf die Kerne verteilt werden.
Funktionale Programmierung ist möglicherweise die Zukunft.

## Scala

TODO

## Scala vs Java in Action

TODO

### Elegant

TODO

#### case

TODO

#### operatoren

TODO

#### high order

TODO

#### funktionen

TODO

### Traits

TODO

### Lazy Evaluation

TODO

## Weitere Infos

* https://github.com/michaelgruczel/ScalaVsJava
* Programming in Scala (Odersky)
* Scala by Example(Frei als PDF, Odersky)
* http://twitter.github.com/scala_school/
* Coursera
* Scala website
* http://prezi.com/gsacc7afvbin/ein-sehr-sehr-kurzer-einblick-in-scala-und-die-funktionale-programmierung/

