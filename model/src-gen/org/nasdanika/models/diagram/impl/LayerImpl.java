/**
 */
package org.nasdanika.models.diagram.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.diagram.DiagramPackage;
import org.nasdanika.models.diagram.Layer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.impl.LayerImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.LayerImpl#isLocked <em>Locked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends DiagramElementImpl implements Layer {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisible() {
		return (Boolean)eDynamicGet(DiagramPackage.LAYER__VISIBLE, DiagramPackage.Literals.LAYER__VISIBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisible(boolean newVisible) {
		eDynamicSet(DiagramPackage.LAYER__VISIBLE, DiagramPackage.Literals.LAYER__VISIBLE, newVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocked() {
		return (Boolean)eDynamicGet(DiagramPackage.LAYER__LOCKED, DiagramPackage.Literals.LAYER__LOCKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(boolean newLocked) {
		eDynamicSet(DiagramPackage.LAYER__LOCKED, DiagramPackage.Literals.LAYER__LOCKED, newLocked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.LAYER__VISIBLE:
				return isVisible();
			case DiagramPackage.LAYER__LOCKED:
				return isLocked();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.LAYER__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case DiagramPackage.LAYER__LOCKED:
				setLocked((Boolean)newValue);
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
			case DiagramPackage.LAYER__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case DiagramPackage.LAYER__LOCKED:
				setLocked(LOCKED_EDEFAULT);
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
			case DiagramPackage.LAYER__VISIBLE:
				return isVisible() != VISIBLE_EDEFAULT;
			case DiagramPackage.LAYER__LOCKED:
				return isLocked() != LOCKED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LayerImpl
