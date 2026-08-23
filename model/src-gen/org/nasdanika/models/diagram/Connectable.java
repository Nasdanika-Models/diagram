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
 *   <li>{@link org.nasdanika.models.diagram.Connectable#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Connectable#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.Connectable#get_ <em></em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable_IncomingConnections()
	 * @model
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see #setConnection(Object)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable_Connection()
	 * @model unique="false"
	 * @generated
	 */
	Object getConnection();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Connectable#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Object)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable_Id()
	 * @model unique="false"
	 * @generated
	 */
	Object getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Connectable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Object value);

	/**
	 * Returns the value of the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em></em>' attribute.
	 * @see #set_(Object)
	 * @see org.nasdanika.models.diagram.DiagramPackage#getConnectable__()
	 * @model unique="false"
	 * @generated
	 */
	Object get_();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.diagram.Connectable#get_ <em></em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em></em>' attribute.
	 * @see #get_()
	 * @generated
	 */
	void set_(Object value);

} // Connectable
