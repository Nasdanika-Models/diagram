/**
 */
package org.nasdanika.models.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.diagram.Connectable;
import org.nasdanika.models.diagram.Connection;
import org.nasdanika.models.diagram.DiagramPackage;
import org.nasdanika.models.diagram.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.ConnectionImpl#getWaypoints <em>Waypoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends DiagramElementImpl implements Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connectable getSource() {
		return (Connectable)eDynamicGet(DiagramPackage.CONNECTION__SOURCE, DiagramPackage.Literals.CONNECTION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectable basicGetSource() {
		return (Connectable)eDynamicGet(DiagramPackage.CONNECTION__SOURCE, DiagramPackage.Literals.CONNECTION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Connectable newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, DiagramPackage.CONNECTION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Connectable newSource) {
		eDynamicSet(DiagramPackage.CONNECTION__SOURCE, DiagramPackage.Literals.CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connectable getTarget() {
		return (Connectable)eDynamicGet(DiagramPackage.CONNECTION__TARGET, DiagramPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectable basicGetTarget() {
		return (Connectable)eDynamicGet(DiagramPackage.CONNECTION__TARGET, DiagramPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Connectable newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, DiagramPackage.CONNECTION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Connectable newTarget) {
		eDynamicSet(DiagramPackage.CONNECTION__TARGET, DiagramPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Point> getWaypoints() {
		return (EList<Point>)eDynamicGet(DiagramPackage.CONNECTION__WAYPOINTS, DiagramPackage.Literals.CONNECTION__WAYPOINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.CONNECTION__SOURCE:
				Connectable source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, DiagramPackage.CONNECTABLE__OUTGOING_CONNECTIONS, Connectable.class, msgs);
				return basicSetSource((Connectable)otherEnd, msgs);
			case DiagramPackage.CONNECTION__TARGET:
				Connectable target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, DiagramPackage.CONNECTABLE__INCOMING_CONNECTIONS, Connectable.class, msgs);
				return basicSetTarget((Connectable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.CONNECTION__SOURCE:
				return basicSetSource(null, msgs);
			case DiagramPackage.CONNECTION__TARGET:
				return basicSetTarget(null, msgs);
			case DiagramPackage.CONNECTION__WAYPOINTS:
				return ((InternalEList<?>)getWaypoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DiagramPackage.CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DiagramPackage.CONNECTION__WAYPOINTS:
				return getWaypoints();
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
			case DiagramPackage.CONNECTION__SOURCE:
				setSource((Connectable)newValue);
				return;
			case DiagramPackage.CONNECTION__TARGET:
				setTarget((Connectable)newValue);
				return;
			case DiagramPackage.CONNECTION__WAYPOINTS:
				getWaypoints().clear();
				getWaypoints().addAll((Collection<? extends Point>)newValue);
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
			case DiagramPackage.CONNECTION__SOURCE:
				setSource((Connectable)null);
				return;
			case DiagramPackage.CONNECTION__TARGET:
				setTarget((Connectable)null);
				return;
			case DiagramPackage.CONNECTION__WAYPOINTS:
				getWaypoints().clear();
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
			case DiagramPackage.CONNECTION__SOURCE:
				return basicGetSource() != null;
			case DiagramPackage.CONNECTION__TARGET:
				return basicGetTarget() != null;
			case DiagramPackage.CONNECTION__WAYPOINTS:
				return !getWaypoints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
