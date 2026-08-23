/**
 */
package org.nasdanika.models.diagram.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.diagram.Bounds;
import org.nasdanika.models.diagram.DiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.impl.BoundsImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.BoundsImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundsImpl extends PointImpl implements Bounds {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.BOUNDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return (Double)eDynamicGet(DiagramPackage.BOUNDS__WIDTH, DiagramPackage.Literals.BOUNDS__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		eDynamicSet(DiagramPackage.BOUNDS__WIDTH, DiagramPackage.Literals.BOUNDS__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return (Double)eDynamicGet(DiagramPackage.BOUNDS__HEIGHT, DiagramPackage.Literals.BOUNDS__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		eDynamicSet(DiagramPackage.BOUNDS__HEIGHT, DiagramPackage.Literals.BOUNDS__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.BOUNDS__WIDTH:
				return getWidth();
			case DiagramPackage.BOUNDS__HEIGHT:
				return getHeight();
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
			case DiagramPackage.BOUNDS__WIDTH:
				setWidth((Double)newValue);
				return;
			case DiagramPackage.BOUNDS__HEIGHT:
				setHeight((Double)newValue);
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
			case DiagramPackage.BOUNDS__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DiagramPackage.BOUNDS__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case DiagramPackage.BOUNDS__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case DiagramPackage.BOUNDS__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BoundsImpl
