# DynaCheck

This project checks the validity of a dynamic software product line built on a (provided) model-based architecture.

## Overview
The checking process is mainly performed through type conformance (i.e. when the model conforms to the meta-model) together with an ad-hoc piece of code for solution space elements validity.

DynaCheck takes as parameters 3 files:
* the feature model file
* the mapping file
* the solution space file

Examples for such files are provided in the src/main/resources/model/ repository.
You can either use Eclipse, maven or the executable jar file to run the project.

## Using the Eclipse IDE

Eclipse provides support to edit and visualize models and meta-models using the proper plugins.


### Prerequisites

The Eclipse Modeling Framework (EMF) plugin is required. I also suggest to install Xpand that provides a more user-friendly interface to manage (meta)-models.

The update sites for theses plugins are:
* [EMF] http://download.eclipse.org/modeling/emf/emf/builds/release
* [Xpand] http://download.eclipse.org/modeling/m2t/updates/releases/



## Running with maven
Once cloned, open a terminal in the project's repository, and execute the following commands:
```
mvn clean package
mvn exec:java -Dexec.args="src/main/resources/model/FeatureModel.xmi
                           src/main/resources/model/Mappings.xmi
                           src/main/resources/model/SSElements.xmi"
```


## Executing the jar
The project can also be downloaded as an executable jar file here:
http://researchers.lille.inria.fr/cquinton/dspl/

Once downloaded, open a terminal in the project's repository, and execute the following command:

```
java -jar DynaCheck.jar src/main/resources/model/FeatureModel.xmi
                        src/main/resources/model/Mappings.xmi
                        src/main/resources/model/SSElements.xmi
```
