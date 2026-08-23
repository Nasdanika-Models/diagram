/**
 */
package org.nasdanika.models.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.diagram.Connectable;
import org.nasdanika.models.diagram.Connection;
import org.nasdanika.models.diagram.DiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectableImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectableImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectableImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectableImpl#get_ <em></em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectableImpl extends DiagramElementImpl implements Connectable {
	/**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONNECTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #get_() <em></em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_()
	 * @generated
	 * @ordered
	 */
	protected static final Object __EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.CONNECTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getIncomingConnections() {
		return (EList<Connection>)eDynamicGet(DiagramPackage.CONNECTABLE__INCOMING_CONNECTIONS, DiagramPackage.Literals.CONNECTABLE__INCOMING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getConnection() {
		return (Object)eDynamicGet(DiagramPackage.CONNECTABLE__CONNECTION, DiagramPackage.Literals.CONNECTABLE__CONNECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection(Object newConnection) {
		eDynamicSet(DiagramPackage.CONNECTABLE__CONNECTION, DiagramPackage.Literals.CONNECTABLE__CONNECTION, newConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getId() {
		return (Object)eDynamicGet(DiagramPackage.CONNECTABLE__ID, DiagramPackage.Literals.CONNECTABLE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Object newId) {
		eDynamicSet(DiagramPackage.CONNECTABLE__ID, DiagramPackage.Literals.CONNECTABLE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get_() {
		return (Object)eDynamicGet(DiagramPackage.CONNECTABLE__, DiagramPackage.Literals.CONNECTABLE__, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_(Object new_) {
		eDynamicSet(DiagramPackage.CONNECTABLE__, DiagramPackage.Literals.CONNECTABLE__, new_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.CONNECTABLE__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case DiagramPackage.CONNECTABLE__CONNECTION:
				return getConnection();
			case DiagramPackage.CONNECTABLE__ID:
				return getId();
			case DiagramPackage.CONNECTABLE__:
				return get_();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.CONNECTABLE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case DiagramPackage.CONNECTABLE__CONNECTION:
				setConnection(newValue);
				return;
			case DiagramPackage.CONNECTABLE__ID:
				setId(newValue);
				return;
			case DiagramPackage.CONNECTABLE__:
				set_(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramPackage.CONNECTABLE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case DiagramPackage.CONNECTABLE__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case DiagramPackage.CONNECTABLE__ID:
				setId(ID_EDEFAULT);
				return;
			case DiagramPackage.CONNECTABLE__:
				set_(__EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramPackage.CONNECTABLE__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
			case DiagramPackage.CONNECTABLE__CONNECTION:
				return CONNECTION_EDEFAULT == null ? getConnection() != null : !CONNECTION_EDEFAULT.equals(getConnection());
			case DiagramPackage.CONNECTABLE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case DiagramPackage.CONNECTABLE__:
				return __EDEFAULT == null ? get_() != null : !__EDEFAULT.equals(get_());
		}
		return super.eIsSet(featureID);
	}

} //ConnectableImpl
