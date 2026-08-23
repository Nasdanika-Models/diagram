package org.nasdanika.models.diagram.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.diagram.DiagramPackage;

public class DiagramEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return DiagramPackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://diagram.models.nasdanika.org/");
	}

}
