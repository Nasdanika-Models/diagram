/**
 */
package org.nasdanika.models.diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Core ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.DiagramElement#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.DiagramElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.DiagramElement#getSemanticElements <em>Semantic Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.DiagramElement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.diagram.DiagramPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getDiagramElement_Tags()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic string properties — carrier for annotations/semantic mappings
	 * (same composability technique as the Nasdanika Markdown model).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getDiagramElement_Properties()
	 * @model mapType="org.nasdanika.models.nxcore.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getProperties();

	/**
	 * Returns the value of the '<em><b>Semantic Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semantic model elements this notation element depicts - the "other" model.
	 * Named after the semantic model / representation model distinction rather than
	 * after OMG DI's single-valued "modelElement", because a diagram element is
	 * itself a model element.
	 * 
	 * Multi-valued because a notation element may depict a collection rather than a
	 * single object: a "Forest" box mapping to a collection of trees, a container
	 * standing for a group of people or resources, or a shape representing an
	 * iteration over something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Elements</em>' reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getDiagramElement_SemanticElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getSemanticElements();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.diagram.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getDiagramElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramElement> getChildren();

} // DiagramElement
