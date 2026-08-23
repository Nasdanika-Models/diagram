```drawio-resource
../diagram.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of **diagrams as data**: what shapes exist, where they sit, what connects to what, which layer it is on - and, crucially, **which semantic element each shape depicts**.

It is the foundation model of the Nasdanika presentation/diagram model family - [Draw.io](https://drawio.models.nasdanika.org/), [PlantUML](https://plantuml.models.nasdanika.org/), [Visio](https://visio.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [Presentation](https://presentation.models.nasdanika.org/) - holding what those notations have in common so that each of them can hold only what makes it different.
It is inspired by the OMG [Diagram Definition](https://www.omg.org/spec/DD/) specification pragmatically, not literally.

Three uses follow from that position: a **diagram interchange and conversion layer**, a substrate for **[executable diagrams](https://docs.nasdanika.org/core/drawio/index.html)**, and a common source for **[semantic mapping](https://docs.nasdanika.org/core/mapping/index.html)**. One mapper, one executor, many notations - an executable PowerPoint is not a joke in this arrangement, it is the same interpreter with a different loader.

## The thesis

**The N x N problem is a metamodel problem.** Every diagramming tool has an export format and a handful of converters to the two or three formats its users complain about most.
Draw.io to PlantUML, Visio to Draw.io, PowerPoint to anything - each pair written separately, each losing something different.
A shared model turns N x N converters into N loaders plus N generators, and makes the thing in the middle queryable, diffable, and persistable rather than a transient parse tree.

**A diagram already carries semantics; the format throws them away.** When someone draws a box labeled "Payments API", that box *is* an architecture element.
The rectangle, the fill color, and the 240x120 bounds are the least interesting facts about it.
[`DiagramElement.modelElement`](references/eClassifiers/DiagramElement/index.html) is the one reference that changes the character of the whole model: it points at any `EObject` - an [architecture](https://architecture.models.nasdanika.org/) element, a [threat](https://threat.models.nasdanika.org/) asset, a [work](https://work.models.nasdanika.org/) item - so the picture and the meaning are one object graph instead of two artifacts and a naming convention between them.

**What is not here is deliberate.** There is no styling vocabulary, no theme, no font, no fill, no z-order, no animation, no slide transition. Those belong to the notation-specific models above this one, and to [`properties`](references/eClassifiers/DiagramElement/index.html) - a string-to-string map used as the carrier for tool-specific attributes and semantic-mapping configuration, the same composability technique the [Markdown model](https://markdown.models.nasdanika.org/) uses.
The core defines the vocabulary that survives conversion, not the pixels that do not.

## Position in the tower

A **rooftop** model on the **C4** floor of the [Nasdanika model tower](https://nasdanika.com/models.html): nothing in the tower depends on it, and it is therefore free to be thin.
Its own types extend [nxcore](https://nxcore.models.nasdanika.org/) `NamedElement` and take nothing else structurally - a diagram element does not need to be `Governed` or `Workable`, because the *thing it depicts* already is.

That is the design, not an omission: coupling to the floors below runs through `modelElement` as a reference rather than through inheritance. A shape on a slide depicts a threat asset; the asset carries the controls, risks, stages, roles, and open work, and the shape stays a shape. The rest of the tower - [architecture](https://architecture.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), [governance](https://governance.models.nasdanika.org/), [decision binding](https://DecisionBinding.models.nasdanika.org/), [decision analysis](https://DecisionAnalysis.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), [IAM](https://iam.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), [nxcore](https://nxcore.models.nasdanika.org/) - is reachable from any diagram element without being welded to it. See [Nasdanika Models](https://nasdanika.com/models.html) for the full picture.

## Competitive landscape

**The OMG stack: DD, DC, DI, and the per-notation interchange specs (UML DI, BPMN DI, SysML).** The nearest prior art and the direct inspiration. DD got the central abstraction right - a notation element that *depicts* a model element - and then wrapped it in an abstract/concrete syntax split, a style hierarchy, and per-notation DI packages that in practice exist only inside vendor modeling tools. BPMN DI is the success case, and even there interchange between tools is famously partial. What is taken here: `modelElement`, `Bounds`, `waypoints`, the layer notion. What is left: everything that made DD a specification to implement rather than a model to use.

**Tool-native formats: mxGraph XML (Draw.io), VSDX (Visio), OOXML/DrawingML (PowerPoint), Lucidchart, Miro, Figma, Excalidraw.** These are the *sources*, not the rivals. Each is expressive, each is an island, and each has a converter story that is pairwise and lossy. None of them has a concept of "the domain element this shape stands for", so the semantics live in the shape's text and in the reader's head.

**Diagram-as-code: Mermaid, PlantUML, Graphviz/DOT, D2, Structurizr DSL.** Text-first, version-controllable, and genuinely good - which is why [PlantUML](https://plantuml.models.nasdanika.org/) is a family member rather than a competitor. Their limit is that the source *is* the artifact: there is no object graph to query, no stable identity to reference from a risk register, and cross-references between diagrams are string matching. They make excellent input and output formats for a model, and a poor substitute for one.

**Graph interchange: GraphML, GEXF, DOT, Cytoscape, JSON Canvas.** Solve the topology half - nodes, edges, attribute bags - and stop there. No layers, no ports, no depiction link, no documentation, no provenance, and an untyped property bag where a metamodel should be. Fine for handing a graph to a layout or analysis library; not a place to keep a diagram estate.

**Eclipse modeling: GMF `notation.ecore`, Sirius, Graphiti, GLSP.** The closest technical relatives - GMF's notation model in particular is the same idea, a `View` with an `element` reference into the semantic model. The difference is purpose: those are the persistence format of a *diagram editor*, bound to GEF/Eclipse runtimes and to one editing tool. This model is an interchange and execution layer with no editor of its own - the editor is Draw.io, or Visio, or PowerPoint, or whatever the team already opens.

**Canvas and presentation SaaS: Miro, Mural, FigJam, Lucid, Canva, Google Slides.** Superb at real-time collaboration, and the export is a picture. They are where diagrams are made, and where diagrams go to stop being data.

**The actual competitor**, as everywhere else in the tower: a PNG pasted into a wiki page, a `.drawio` file in a repository that nothing parses, and a deck whose contents no one can query.

## What a typed model adds

**The depiction link is a first-class reference.** `modelElement` makes "which shapes depict this component" and "what does this box mean" navigable in both directions - outbound as an EMF reference, inbound via nxcore `Referrable.getReferrers`. Retiring a service in the architecture model becomes an impact query over every diagram in the estate rather than a hunt through image files.

**Provenance for free.** Because [`DiagramElement`](references/eClassifiers/DiagramElement/index.html) extends nxcore `NamedElement`, every shape has an `id`, documentation (inline, `docRef`, or `docSections`), `uris` as merge anchors, an `icon`, and `markers` - including Git markers, so a node traces back to the exact file, line, branch, and commit it was loaded from. A generated site can link a box on a diagram to the source of that box.

**One containment tree, all the nesting cases.** [`Diagram`](references/eClassifiers/Diagram/index.html) is itself a `DiagramElement` and `children` is typed on the base class, so a deck of slides, a Visio document of pages, a Draw.io document of tabs, and a group of shapes nested inside a shape are all the same structure - a tree keyed by `id`. Generic tooling written once (walk, select, transform, render) works on all of them.

**Ports and waypoints, because round trips need them.** [`Port`](references/eClassifiers/Port/index.html) is a pragmatic extension over OMG DD: a named attachment point with a relative `location` in 0..1 coordinates, so a connection anchored to the left edge of a box stays anchored after a conversion instead of snapping to the center. [`Connection`](references/eClassifiers/Connection/index.html) carries `source`/`target` with EMF opposites and `sourcePort`/`targetPort`, so topology is navigable without scanning, and `waypoints` preserve routing.

**Layers as data.** [`Layer`](references/eClassifiers/Layer/index.html) with `visible` and `locked` is the one piece of tool state worth keeping neutral, because it carries meaning: the "future state" layer, the "out of scope" layer, the locked background. Semantic mapping and executable-diagram processing routinely key off it.

**Extension without metamodel change.** `properties` and `tags` absorb whatever a source notation carries that this model does not model - a Draw.io style string, a PowerPoint placeholder index, a processor URI, a mapping rule - so supporting a new notation or a new interpreter is loader and capability work rather than a metamodel release. The metamodel stays micro on purpose.

## Applications

**Interchange and conversion.** Load a Visio drawing, save a Draw.io file. Load a PowerPoint deck, emit PlantUML. The pivot model is a real EMF resource in between - persistable as XMI/JSON/YAML, comparable with [EMF Compare](https://eclipse.dev/emf/compare/), and inspectable when a conversion goes wrong.

**Executable diagrams.** The [Drawio](https://docs.nasdanika.org/core/drawio/index.html) module already treats a diagram as a computational structure: elements carry processor URIs, the graph is wired into Java processors, and the picture runs. Lifting that onto a shared model means the interpreter stops being Draw.io-specific - the same processor wiring runs over a Visio drawing or a PowerPoint deck. **An executable PowerPoint**: slides as pages, shapes as processors, connections as message paths, and the deck stays a deck that a business audience can open.

**Semantic mapping.** [Mapping](https://docs.nasdanika.org/core/mapping/index.html) turns diagram elements into populated domain models - initialization, feature mapping, configuration, operations, invocation, with geometric comparators treating position as meaning. Written against this model rather than against a Draw.io-specific content provider, one mapping definition serves every notation in the family. The workshop draws in whatever tool it likes; the domain model comes out the same.

**Modernization.** Legacy diagram estates - Visio libraries, decades of decks, integration-platform canvases such as [BW5](https://bw5.models.nasdanika.org/) - reverse-engineered into a neutral model, mined for what they actually document, then regenerated onto a current stack. The same posture the tower takes with legacy code and legacy documents.

**Documentation and diagram sites.** Generate navigable, searchable web pages from diagrams: every shape a page, every connection a link, documentation and ownership attached, source markers pointing back to the file - with the same generation stack that produced this site.

**Diagram review and diff.** A model-level diff answers "what changed in this architecture diagram" with a list of added nodes and re-pointed connections instead of two images side by side. Diagrams become reviewable in a pull request.

**Layout as a service.** With topology, bounds, ports, and waypoints in a neutral model, [ELK](https://elk.models.nasdanika.org/) and force-directed layouts apply to any source notation - lay out a Visio drawing with an algorithm Visio does not have.

**AI-generated and AI-read diagrams.** A typed model is a far better contract for a language model than mxGraph XML: emit or read a small, documented structure, then validate that the result is structurally sound and that every shape depicts an approved element - before anything renders.

**Diagrams as governed artifacts.** Because `modelElement` reaches the tower, a diagram participates in the estate: shapes depicting threat assets, architecture elements under a control catalog, work items open against a component. The diagram stops being a picture *about* the model and becomes a view *of* it.

## Model overview

| Area | Types |
|------|-------|
| Geometry | [Point](references/eClassifiers/Point/index.html) (`x`, `y`), [Bounds](references/eClassifiers/Bounds/index.html) (`width`, `height`) |
| Base | [DiagramElement](references/eClassifiers/DiagramElement/index.html) - `tags`, `properties`, `modelElement`, `children` keyed by `id`; extends nxcore `NamedElement` |
| Structure | [Diagram](references/eClassifiers/Diagram/index.html) (nestable - document, page, slide, group), [Layer](references/eClassifiers/Layer/index.html) (`visible`, `locked`) |
| Notation | [Node](references/eClassifiers/Node/index.html) (`bounds`, `ports`, incoming/outgoing connections), [Port](references/eClassifiers/Port/index.html) (relative `location`), [Connection](references/eClassifiers/Connection/index.html) (`source`/`target`, `sourcePort`/`targetPort`, `waypoints`), [Label](references/eClassifiers/Label/index.html) (`text`) |
| Reused, not redefined | nxcore `NamedElement` / `ModelElement` / `Documented` / `Marked` / `Referrable` / `StringToStringMapEntry` |

## Relation to other Nasdanika work

**The family.** Notation-specific models extend this one with what makes each notation itself: [Draw.io](https://drawio.models.nasdanika.org/) with mxGraph styles and magic properties, [PlantUML](https://plantuml.models.nasdanika.org/) with diagram kinds and skin parameters, [Visio](https://visio.models.nasdanika.org/) with masters and stencils, [PowerPoint](https://powerpoint.models.nasdanika.org/) with slide layouts and placeholders, and [Presentation](https://presentation.models.nasdanika.org/) with the deck-level concerns presentation formats share.

**Adjacent models.** [ELK](https://elk.models.nasdanika.org/) for layout, [Graph](https://github.com/Nasdanika-Models/graph) for the processor wiring behind executable diagrams, [C4](https://c4.models.nasdanika.org/) as a worked notation-plus-semantics pairing, [ECharts](https://github.com/Nasdanika-Models/echarts) for the charting side of the same "picture as data" idea, and [Markdown](https://markdown.models.nasdanika.org/) as the other authoring surface - text where text is natural, geometry where geometry is.

**Tooling.** Models are loaded from their native formats, authored in [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) or as XMI/YAML/JSON, wired through the [capability framework](https://docs.nasdanika.org/core/capability/index.html), transformed with [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) or [NSML](https://github.com/Nasdanika-Models/nasdanika-semantic-mapping-language), and documented with the generation stack that built this site.
