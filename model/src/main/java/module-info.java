import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.diagram.capability.DiagramEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.diagram {
	
	exports org.nasdanika.models.diagram;
	exports org.nasdanika.models.diagram.impl;
	exports org.nasdanika.models.diagram.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.architecture.c4;
	
	provides CapabilityFactory with 
		DiagramEPackageResourceSetCapabilityFactory;
	
}