/**
 */
package org.nasdanika.models.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Connection attachment point on a node (pragmatic extension over OMG DD).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.Port#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.diagram.DiagramPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Connectable {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Relative position on the owner, 0..1 in each dimension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Point)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getPort_Location()
	 * @model containment="true"
	 * @generated
	 */
	Point getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Port#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Point value);

} // Port
