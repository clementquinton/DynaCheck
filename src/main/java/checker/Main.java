package checker;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import mapping.Mapping;
import ssElement.Element;

public class Main {

	static EObject featureModel;
	static EObject rulesModel;
	static EObject mappingsModel;
	static EObject elementsModel;
	
	public static void main(String[] args) {
		featureModel = loadModel(args[0]);
		mappingsModel = loadModel(args[1]);
		elementsModel = loadModel(args[2]);
		checkSSElementHasMapping();
	}
	
	private static void checkSSElementHasMapping() {
		long startTime = System.nanoTime();
		TreeIterator<EObject> elementsContent = (TreeIterator<EObject>) elementsModel.eAllContents();
		TreeIterator<EObject> mappingsContent = (TreeIterator<EObject>) mappingsModel.eAllContents();
		
		List<String> elementNames = new ArrayList<String>();
		List<String> mappings = new ArrayList<String>();
		
		long estimatedTime = 0;
		long estimatedInconsistentTime = 0;
		
		Boolean inconsistent = false;
		
		while (elementsContent.hasNext()) {
			Object modelElement = elementsContent.next();
			if (modelElement instanceof Element) {
				Element element = (Element) modelElement;
				elementNames.add(element.getName());
			} 
		}
		while (mappingsContent.hasNext()) {
			Object modelElement = mappingsContent.next();
			if (modelElement instanceof Mapping) {
				Mapping mapping = (Mapping) modelElement;
				mappings.add(mapping.getTo());
			} 
		}
		
		System.out.println();
		System.out.println("########################## CONSISTENCY RESULTS ##########################");
		for (String element : elementNames) {
			if (!mappings.contains(element)) {
				estimatedTime = System.nanoTime() - startTime;
				inconsistent = true;
				System.out.println("SS element " + element + " not mapped to any feature!");
			} 
		}
		estimatedTime = System.nanoTime() - startTime;
		
		double estimateddTimeInMillis = 0;
		if (inconsistent) {
			estimatedInconsistentTime = System.nanoTime() - startTime;
			estimateddTimeInMillis = estimatedInconsistentTime/1000000.0;
		} else {
			estimatedTime = System.nanoTime() - startTime;
			estimateddTimeInMillis = estimatedTime/1000000.0;
		}
		System.out.println("Time to check: " + estimateddTimeInMillis);
		System.out.println("########################## CONSISTENCY RESULTS ##########################" + "\n");
	}
	
	private static EObject loadModel(String args) {
		File file = new File(args);
		EObject model = ModelUtils.load(file);
		return model;
	}
}
