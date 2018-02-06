/**
 */
package ssElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SS Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ssElement.SSElements#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ssElement.SsElementPackage#getSSElements()
 * @model
 * @generated
 */
public interface SSElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ssElement.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ssElement.SsElementPackage#getSSElements_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // SSElements
