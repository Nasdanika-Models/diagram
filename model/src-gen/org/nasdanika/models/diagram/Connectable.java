/**
 */
package org.nasdanika.models.diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something connections can attach to - Node, Port
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.Connectable#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Connectable#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable()
 * @model abstract="true"
 * @generated
 */
public interface Connectable extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.diagram.Connection}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.diagram.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable_IncomingConnections()
	 * @see org.nasdanika.models.diagram.Connection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.diagram.Connection}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.diagram.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable_OutgoingConnections()
	 * @see org.nasdanika.models.diagram.Connection#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

} // Connectable
