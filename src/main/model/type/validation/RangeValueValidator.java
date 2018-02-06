/**
 *
 * $Id$
 */
package type.validation;

import type.IntValue;

/**
 * A sample validator interface for {@link type.RangeValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RangeValueValidator {
	boolean validate();

	boolean validateMin(int value);
	boolean validateMax(int value);
	boolean validateValue(IntValue value);
}
