/**
 */
package org.nasdanika.models.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.diagram.DiagramElement;
import org.nasdanika.models.diagram.DiagramPackage;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.diagram.impl.DiagramElementImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.DiagramElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.DiagramElementImpl#getSemanticElements <em>Semantic Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.diagram.impl.DiagramElementImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends NamedElementImpl implements DiagramElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getTags() {
		return (EList<String>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__TAGS, DiagramPackage.Literals.DIAGRAM_ELEMENT__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getProperties() {
		return (EMap<String, String>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__PROPERTIES, DiagramPackage.Literals.DIAGRAM_ELEMENT__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getSemanticElements() {
		return (EList<EObject>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS, DiagramPackage.Literals.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DiagramElement> getChildren() {
		return (EList<DiagramElement>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__CHILDREN, DiagramPackage.Literals.DIAGRAM_ELEMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case DiagramPackage.DIAGRAM_ELEMENT__TAGS:
				return getTags();
			case DiagramPackage.DIAGRAM_ELEMENT__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				return getSemanticElements();
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				return getChildren();
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
			case DiagramPackage.DIAGRAM_ELEMENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				getSemanticElements().clear();
				getSemanticElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends DiagramElement>)newValue);
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
			case DiagramPackage.DIAGRAM_ELEMENT__TAGS:
				getTags().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				getSemanticElements().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				getChildren().clear();
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
			case DiagramPackage.DIAGRAM_ELEMENT__TAGS:
				return !getTags().isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__PROPERTIES:
				return !getProperties().isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				return !getSemanticElements().isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramElementImpl
