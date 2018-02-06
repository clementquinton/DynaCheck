Open a terminal in the SPLChecker folder, and launch the following commands:
$ mvn install
$ mvn exec:java -Dexec.args="src/main/resources/model/FeatureModel.xmi src/main/resources/model/Mappings.xmi src/main/resources/model/SSElements.xmi"