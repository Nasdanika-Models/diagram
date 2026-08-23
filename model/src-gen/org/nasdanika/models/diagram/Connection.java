/**
 */
package org.nasdanika.models.diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Connection#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Connection#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.diagram.DiagramPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Connectable)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnection_Source()
	 * @model
	 * @generated
	 */
	Connectable getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Connectable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.diagram.Connectable#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Connectable)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnection_Target()
	 * @see org.nasdanika.models.diagram.Connectable#getIncomingConnections
	 * @model opposite="incomingConnections"
	 * @generated
	 */
	Connectable getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Connectable value);

	/**
	 * Returns the value of the '<em><b>Waypoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.diagram.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoints</em>' containment reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnection_Waypoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getWaypoints();

} // Connection
