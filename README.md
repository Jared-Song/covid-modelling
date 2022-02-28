# covid-modelling

## Compiling:
javac -cp ".;jopt-simple-5.0.2.jar" *.java

## Running:
java -cp ".;jopt-simple-5.0.2.jar" CovidModelling <adjlist|adjmat|incmat>
java -cp ".;jopt-simple-5.0.2.jar" CovidModelling adjmat

## Removing .class files:
rm *.class
