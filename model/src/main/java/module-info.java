import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.diagram.capability.DiagramArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.diagram.capability.DiagramEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.diagram.capability.DiagramResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.diagram.capability.DiagramResourceFactoryCapabilityFactory;

module org.nasdanika.models.diagram.Diagram {
	
	exports org.nasdanika.models.diagram;
	exports org.nasdanika.models.diagram.impl;
	exports org.nasdanika.models.diagram.util;
	exports org.nasdanika.models.diagram.loader;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	
	requires flexmark;
	requires flexmark.profile.pegdown;
	requires transitive flexmark.util.ast;
	requires flexmark.util.collection;
	requires flexmark.util.visitor;
	requires flexmark.util.data;
	requires flexmark.util.misc;
	requires flexmark.util.sequence;
	requires flexmark.util.builder;
	requires flexmark.ext.attributes;
	requires flexmark.ext.tables;
	requires flexmark.ext.definition;
	requires flexmark.ext.gfm.tasklist; 	
	
	provides CapabilityFactory with 
		DiagramEPackageResourceSetCapabilityFactory,
		DiagramResourceFactoryCapabilityFactory,
		DiagramResourceContentsHandlerCapabilityFactory,
		DiagramArrayResourceContentsHandlerCapabilityFactory;
	
}