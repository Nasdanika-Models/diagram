/**
 */
package org.nasdanika.models.diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A positioned element: shape on a slide/page.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.Node#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Node#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.diagram.DiagramPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Connectable {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getNode_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Node#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.diagram.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getNode_Ports()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Port> getPorts();

} // Node
