/**
 */
package org.nasdanika.models.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.Layer#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Layer#isLocked <em>Locked</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.diagram.DiagramPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getLayer_Visible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Layer#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getLayer_Locked()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Layer#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

} // Layer
