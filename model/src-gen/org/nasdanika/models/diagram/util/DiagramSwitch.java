/**
 */
package org.nasdanika.models.diagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.diagram.*;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.diagram.DiagramPackage
 * @generated
 */
public class DiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiagramPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.BOUNDS: {
				Bounds bounds = (Bounds)theEObject;
				T result = caseBounds(bounds);
				if (result == null) result = casePoint(bounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = caseNamedElement(diagramElement);
				if (result == null) result = caseModelElement(diagramElement);
				if (result == null) result = caseStringIdentity(diagramElement);
				if (result == null) result = caseDocumented(diagramElement);
				if (result == null) result = caseMarked(diagramElement);
				if (result == null) result = caseReferrable(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = caseDiagramElement(diagram);
				if (result == null) result = caseNamedElement(diagram);
				if (result == null) result = caseModelElement(diagram);
				if (result == null) result = caseStringIdentity(diagram);
				if (result == null) result = caseDocumented(diagram);
				if (result == null) result = caseMarked(diagram);
				if (result == null) result = caseReferrable(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseDiagramElement(layer);
				if (result == null) result = caseNamedElement(layer);
				if (result == null) result = caseModelElement(layer);
				if (result == null) result = caseStringIdentity(layer);
				if (result == null) result = caseDocumented(layer);
				if (result == null) result = caseMarked(layer);
				if (result == null) result = caseReferrable(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.CONNECTABLE: {
				Connectable connectable = (Connectable)theEObject;
				T result = caseConnectable(connectable);
				if (result == null) result = caseDiagramElement(connectable);
				if (result == null) result = caseNamedElement(connectable);
				if (result == null) result = caseModelElement(connectable);
				if (result == null) result = caseStringIdentity(connectable);
				if (result == null) result = caseDocumented(connectable);
				if (result == null) result = caseMarked(connectable);
				if (result == null) result = caseReferrable(connectable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseConnectable(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = caseStringIdentity(node);
				if (result == null) result = caseDocumented(node);
				if (result == null) result = caseMarked(node);
				if (result == null) result = caseReferrable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseConnectable(port);
				if (result == null) result = caseDiagramElement(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseModelElement(port);
				if (result == null) result = caseStringIdentity(port);
				if (result == null) result = caseDocumented(port);
				if (result == null) result = caseMarked(port);
				if (result == null) result = caseReferrable(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseDiagramElement(connection);
				if (result == null) result = caseNamedElement(connection);
				if (result == null) result = caseModelElement(connection);
				if (result == null) result = caseStringIdentity(connection);
				if (result == null) result = caseDocumented(connection);
				if (result == null) result = caseMarked(connection);
				if (result == null) result = caseReferrable(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseNode(label);
				if (result == null) result = caseConnectable(label);
				if (result == null) result = caseDiagramElement(label);
				if (result == null) result = caseNamedElement(label);
				if (result == null) result = caseModelElement(label);
				if (result == null) result = caseStringIdentity(label);
				if (result == null) result = caseDocumented(label);
				if (result == null) result = caseMarked(label);
				if (result == null) result = caseReferrable(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBounds(Bounds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectable(Connectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramSwitch
