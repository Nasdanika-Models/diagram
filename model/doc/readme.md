```drawio-resource
../diagram.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of **diagrams as data**: what shapes exist, where they sit, what connects to what, which layer it is on, what each of them is documented as - and, where there are any, **which semantic elements each shape depicts**.
A diagram element is a model element in its own right, so a diagram is a model even when it has been mapped to nothing.

It is the foundation model of the Nasdanika presentation/diagram model family - [Draw.io](https://drawio.models.nasdanika.org/), [PlantUML](https://plantuml.models.nasdanika.org/), [Visio](https://visio.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [Presentation](https://presentation.models.nasdanika.org/) - holding what those notations have in common so that each of them can hold only what makes it different.
It is inspired by the OMG [Diagram Definition](https://www.omg.org/spec/DD/) specification pragmatically, not literally.

Four uses follow from that position: a **diagram interchange and conversion layer**; a **documented, queryable model of diagrams that were never mapped to anything** - the [drawio-site](https://github.com/Nasdanika-Templates/drawio-site) case; a substrate for **[executable diagrams](https://docs.nasdanika.org/core/drawio/index.html)**; and a common source for **[semantic mapping](https://docs.nasdanika.org/core/mapping/index.html)**.
One mapper, one executor, many notations - an executable PowerPoint is not a joke in this arrangement, it is the same interpreter with a different loader.

## The thesis

**The N x N problem is a metamodel problem.** Every diagramming tool has an export format and a handful of converters to the two or three formats its users complain about most.
Draw.io to PlantUML, Visio to Draw.io, PowerPoint to anything - each pair written separately, each losing something different.
A shared model turns N x N converters into N loaders plus N generators, and makes the thing in the middle queryable, diffable, and persistable rather than a transient parse tree.

**A diagram already carries semantics; the format throws them away.** When someone draws a box labeled "Payments API", that box *is* an architecture element.
The rectangle, the fill color, and the 240x120 bounds are the least interesting facts about it.
[`DiagramElement.semanticElements`](references/eClassifiers/DiagramElement/index.html) is the one reference that changes the character of the whole model: it points at any `EObject`s - an [architecture](https://architecture.models.nasdanika.org/) element, a [threat](https://threat.models.nasdanika.org/) asset, a [work](https://work.models.nasdanika.org/) item - so the picture and the meaning are one object graph instead of two artifacts and a naming convention between them.
That is the far end of a ramp rather than an entry fee: where there is no domain model to point at, the diagram element carries the meaning itself.

The name is deliberate. OMG DI calls this reference `modelElement`, which only works if the diagram is *not* a model.
Here it is one, and [`DiagramElement`](references/eClassifiers/DiagramElement/index.html) is itself an nxcore `ModelElement` - so the reference is named for the distinction that actually matters, the one [Sirius](https://eclipse.dev/sirius/) draws between the *semantic* model and the *representation* model, and the one this project's [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) machinery is already named after.

**What is not here is deliberate.** There is no styling vocabulary, no theme, no font, no fill, no z-order, no animation, no slide transition. Those belong to the notation-specific models above this one, and to [`properties`](references/eClassifiers/DiagramElement/index.html) - a string-to-string map used as the carrier for tool-specific attributes and semantic-mapping configuration, the same composability technique the [Markdown model](https://markdown.models.nasdanika.org/) uses.
The core defines the vocabulary that survives conversion, not the pixels that do not.

## Position in the tower

A **rooftop** model on the **[C4](https://c4.models.nasdanika.org/)** floor of the [Nasdanika model tower](https://nasdanika.com/models.html).
Being a rooftop means nothing in the tower depends on it, which is what lets it stay thin.
Standing on the C4 floor means everything from C4 and [architecture](https://architecture.models.nasdanika.org/) down is available to it, which is what lets it be more than geometry.

### Meaning without a target model

The narrow reading of [`semanticElements`](references/eClassifiers/DiagramElement/index.html) is that a diagram element is merely a *pointer*: the shape is notation, the meaning lives elsewhere, look over there.
That reading is too narrow, because plenty of diagrams are never mapped to a formal model - and should not have to be.

A diagram is already a tree and a graph of named elements, which is structurally very close to what an [architecture](https://architecture.models.nasdanika.org/) model is: elements containing elements, connected by relationships.
Give those elements stable identity, documentation, ownership, and a stage, and you have something worth generating from, searching, querying, and reviewing - with no mapping configuration and no domain metamodel existing at all.

That is the bet the [drawio-site template](https://github.com/Nasdanika-Templates/drawio-site) makes.
Point the Nasdanika CLI at a `.drawio` file whose elements carry a bit of documentation and a handful of properties - `doc-ref`, `icon`, `role`, `sort-key` - and a navigable, searchable documentation site comes out.
Its own README calls this "a form of a lightweight semantic mapping which uses just a few properties", with full [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) as the upgrade path.
Nothing was typed; a great deal became useful.

### A ramp, not a switch

Between a picture and a domain model there is a gradient, and this model is designed to let a team stop anywhere on it:

* **Pixel-deep.** Boxes, arrows, and labels. What most diagrams are, and a perfectly reasonable place to be.
* **Diagram as model.** The same boxes, now with `id`s, documentation, `tags`, `properties`, owners, and stages. Generate a site from it, search it, diff it in a pull request, run it as an [executable diagram](https://docs.nasdanika.org/core/drawio/index.html). Elements stay untyped - the diagram *is* the model.
* **Semantically mapped.** `semanticElements` points into a domain model, and the diagram becomes a view of an estate that other tools also read and write. Those links may be drawn by hand, produced by a mapping run, or - the direction being taken next - *computed*, so that a shape declares a query instead of a list.

Each step is optional, each is incremental, and none of them invalidates the work done on the step before.
Deciding to map a diagram later does not mean re-drawing it; the documentation and identity added on the middle rung are exactly what the mapping keys off.

The floor placement is what makes the middle rung real.
Sitting on C4 puts [architecture](https://architecture.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), [governance](https://governance.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), [IAM](https://iam.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), and [nxcore](https://nxcore.models.nasdanika.org/) beneath this model, so a diagram element can be documented, owned, staged, and governed **in its own right** rather than by proxy.

And the top rung stays available throughout: a shape can depict an architecture element *and* carry its own documentation, owner, and open work items.
The two are not alternatives - `semanticElements` adds a dimension rather than replacing one.
See [Nasdanika Models](https://nasdanika.com/models.html) for the full picture of the tower.

## Competitive landscape

**The OMG stack: DD, DC, DI, and the per-notation interchange specs (UML DI, BPMN DI, SysML).** The nearest prior art and the direct inspiration.
DD got the central abstraction right - a notation element that *depicts* a model element - and then wrapped it in an abstract/concrete syntax split, a style hierarchy, and per-notation DI packages that in practice exist only inside vendor modeling tools.
BPMN DI is the success case, and even there interchange between tools is famously partial.
What is taken here: the depiction reference (renamed to `semanticElements`, and made multi-valued), `Bounds`, `waypoints`, the layer notion.
What is left: everything that made DD a specification to implement rather than a model to use.

**Tool-native formats: mxGraph XML (Draw.io), VSDX (Visio), OOXML/DrawingML (PowerPoint), Lucidchart, Miro, Figma, Excalidraw.**
These are the *sources*, not the rivals.
Each is expressive, each is an island, and each has a converter story that is pairwise and lossy.
None of them has a concept of "the domain element this shape stands for", so the semantics live in the shape's text and in the reader's head.

**Diagram-as-code: Mermaid, PlantUML, Graphviz/DOT, D2, Structurizr DSL.** Text-first, version-controllable, and genuinely good - which is why [PlantUML](https://plantuml.models.nasdanika.org/) is a family member rather than a competitor.
Their limit is that the source *is* the artifact: there is no object graph to query, no stable identity to reference from a risk register, and cross-references between diagrams are string matching.
They make excellent input and output formats for a model, and a poor substitute for one.

**Graph interchange: GraphML, GEXF, DOT, Cytoscape, JSON Canvas.** Solve the topology half - nodes, edges, attribute bags - and stop there.
No layers, no ports, no depiction link, no documentation, no provenance, and an untyped property bag where a metamodel should be.
Fine for handing a graph to a layout or analysis library; not a place to keep a diagram estate.

**Eclipse modeling: GMF `notation.ecore`, Sirius, Graphiti, GLSP.** The closest technical relatives - GMF's notation model in particular is the same idea, a `View` with an `element` reference into the semantic model.
Two differences. Purpose: those are the persistence format of a *diagram editor*, bound to GEF/Eclipse runtimes and to one editing tool, whereas this model is an interchange and execution layer with no editor of its own - the editor is Draw.io, or Visio, or PowerPoint, or whatever the team already opens.
And direction: a GMF `View` without its semantic element is an orphan, because the notation model exists to render something else; here an unmapped element is a first-class documented element, and mapping is an upgrade rather than a precondition.

**Canvas and presentation SaaS: Miro, Mural, FigJam, Lucid, Canva, Google Slides.** Superb at real-time collaboration, and the export is a picture.
They are where diagrams are made, and where diagrams go to stop being data.
These can also be the *sources*, not the rivals.

**The actual competitor**, as everywhere else in the tower: a PNG pasted into a wiki page, a `.drawio` file in a repository that nothing parses, and a deck whose contents no one can query.

## What a typed model adds

**Diagram elements are model elements.** Because [`DiagramElement`](references/eClassifiers/DiagramElement/index.html) extends requirements `Satisfier`, every shape has an `id`, a name, documentation (inline, `docRef`, `docContents`, or `docSections`), `uris` as merge anchors, an `icon`, ... - before anything is mapped anywhere.
A box on a whiteboard export becomes a documented, addressable, federatable element, and the tree of boxes is a tree that generic tooling can walk.
This is the rung most diagrams should be on, and for many of them it is the last rung they need.

**The depiction link is a first-class reference, when there is one.** `semanticElements` makes "which shapes depict this component" and "what does this box mean" navigable in both directions - outbound as an EMF reference, inbound via nxcore `Referrable.getReferrers`.
Retiring a service in the architecture model becomes an impact query over every diagram in the estate rather than a hunt through image files.
Empty, it costs nothing: an unmapped element is still a full element.

**Depiction is many-to-many, because drawings are.** `semanticElements` is multi-valued on purpose.
A box is not always one thing: a "Forest" depicts a collection of trees, a container stands for a group of people or a pool of resources, a shape represents an iteration over something.
Single-valued depiction - OMG DI's `modelElement`, GMF's `View.element` - forces those cases into either a fake aggregate object in the domain model or a naming convention in a property bag.
Here the box points at the collection, and the other direction is a `getReferrers` query, so "how many shapes depict this tree" and "what does this box cover" are both answerable.

**Depiction can be computed, not just enumerated**. Enumerating a collection by hand does not scale - a "Forest" box with four hundred hand-maintained references is worse than no model at all, because it is wrong within a week.
`semanticElementsSelector`, typed as an nxcore [`Evaluator`](https://nxcore.models.nasdanika.org/) (SpEL, Groovy, or any JSR-223 script, documented and marked like everything else), lets a shape declare *what it depicts* rather than *which objects it depicts*: every `Tree` under this package, every service tagged `payments`, the contents of a directory, the results of a SQL or JQL query.
The shape stops being a snapshot and becomes a standing question.
[Sirius](https://eclipse.dev/sirius/) reached the same conclusion from the editor side with its semantic-candidates expressions; the difference is that here the expression lives in an interchangeable model rather than in a viewpoint specification bound to one tool.
The explicit list stays available and stays primary - the selector is an alternative source of links, not a replacement for drawing them.

**Provenance for free.** nxcore `Marked` gives every element `markers` - including Git markers, so a node traces back to the exact file, line, branch, and commit it was loaded from.
A generated site can link a box on a diagram to the source of that box, and a derived value can be traced through the elements it was computed from.

**One containment tree, all the nesting cases.** [`Diagram`](references/eClassifiers/Diagram/index.html) is itself a `DiagramElement` and `children` is typed on the base class, so a deck of slides, a Visio document of pages, a Draw.io document of tabs, and a group of shapes nested inside a shape are all the same structure - a tree keyed by `id`.
Generic tooling written once (walk, select, transform, render) works on all of them.

**Ports and waypoints, because round trips need them.** [`Port`](references/eClassifiers/Port/index.html) is a pragmatic extension over OMG DD: a named attachment point with a relative `location` in 0..1 coordinates, so a connection anchored to the left edge of a box stays anchored after a conversion instead of snapping to the center.
[`Connection`](references/eClassifiers/Connection/index.html) carries `source`/`target` with EMF opposites, so topology is navigable without scanning, and `waypoints` preserve routing.

**Layers as data.** [`Layer`](references/eClassifiers/Layer/index.html) with `visible` and `locked` is the one piece of tool state worth keeping neutral, because it carries meaning: the "future state" layer, the "out of scope" layer, the locked background, the merge driver's conflicts layer. 

**Extension without metamodel change.** `properties` and `tags` absorb whatever a source notation carries that this model does not model - a Draw.io style string, a PowerPoint placeholder index, a processor URI, a mapping rule - so supporting a new notation or a new interpreter is loader and capability work rather than a metamodel release.
The metamodel stays micro on purpose.

## Applications

**Interchange and conversion.** Load a Visio drawing, save a Draw.io file.
Load a PowerPoint deck, emit PlantUML.
The pivot model is a real EMF resource in between - persistable as XMI/JSON/YAML, comparable with [EMF Compare](https://eclipse.dev/emf/compare/), and inspectable when a conversion goes wrong.

**Executable diagrams.** The [Drawio](https://docs.nasdanika.org/core/drawio/index.html) module already treats a diagram as a computational structure: elements carry processor URIs, the graph is wired into Java processors, and the picture runs.
Lifting that onto a shared model means the interpreter stops being Draw.io-specific - the same processor wiring runs over a Visio drawing or a PowerPoint deck. **An executable PowerPoint**: slides as pages, shapes as processors, connections as message paths, and the deck stays a deck that a business audience can open.

**Semantic mapping.** [Mapping](https://docs.nasdanika.org/core/mapping/index.html) turns diagram elements into populated domain models - initialization, feature mapping, configuration, operations, invocation, with geometric comparators treating position as meaning.
Written against this model rather than against a Draw.io-specific content provider, one mapping definition serves every notation in the family.
The workshop draws in whatever tool it likes; the domain model comes out the same.

**Modernization.** Legacy diagram estates - Visio libraries, decades of decks, integration-platform canvases such as [BW5](https://bw5.models.nasdanika.org/) - reverse-engineered into a neutral model, mined for what they actually document, then regenerated onto a current stack.
The same posture the tower takes with legacy code and legacy documents.

**Documentation and diagram sites.** Generate navigable, searchable web pages straight from diagrams: every shape a page, every connection a link, documentation and ownership attached, source markers pointing back to the file - with the same generation stack that produced this site.
The [drawio-site template](https://github.com/Nasdanika-Templates/drawio-site) is this application in ready-to-fork form, driven by a GitHub Action and a handful of element properties; generalized onto this model, the same pipeline runs over a Visio drawing or a deck.
It is also the cheapest on-ramp in the tower: a team publishes a useful site on day one and can add semantics later, on the same diagrams.

A real life example - an architect drew a a diagram on a whiteboard.
A picture was taken and given to GitHub Copilot (Opus 4.6) with a request to generate a Draw.io diagram.
Then the generated diagram was used to generate a documentation site.

**Diagram review and diff.** A model-level diff answers "what changed in this architecture diagram" with a list of added nodes and re-pointed connections instead of two images side by side.
Diagrams become reviewable in a pull request.

**Live diagrams**. With a computed `semanticElementsSelector`, a shape tracks a query rather than a fixed set: a box covering "everything in this Jira filter", "every module under this directory", or "every container running an out-of-support runtime". The drawing is authored once and answers differently as the estate changes - which is the honest fix for the real failure mode of diagram estates, where the picture is accurate on the day it is drawn and misleading forever after.

**Layout as a service.** With topology, bounds, ports, and waypoints in a neutral model, [ELK](https://elk.models.nasdanika.org/) and force-directed layouts apply to any source notation.

**Mergeable diagrams: machine-generated structure plus human insight.** The failure mode of every generated diagram is the second run.
A diagram is derived from a source of truth, a person then adds the things the generator could not know - grouping the boxes that belong to one team, annotating the one connection that matters, moving a cluster where it reads better - and the next regeneration flattens all of it.
So the diagram gets generated once, enriched, and then quietly frozen, which is how living documentation becomes documentation again.

The fix is **three-way merge**, as outlined in [Beyond Human Layout: How ELK + Draw.io Unlock a New Era of Visual Understanding](https://medium.com/nasdanika/draw-io-elk-eclipse-layout-kernel-93bc6879fc16): the previous generation as the base, the fresh generation as one side, the human-edited drawing as the other.
That is ordinary version-control machinery, and it needs exactly what a model provides and a picture format does not - stable identity, so an element is recognized as *the same* element across all three versions rather than as a deletion plus an addition.
`children` keyed by `id`, nxcore `uris` as merge anchors, and `markers` recording where each element came from are what make the three-way comparison meaningful instead of a wall of false conflicts.
What the source still says is refreshed, what a person added is kept, and what has disappeared from the source is retired rather than silently dropped.

The delivery vehicle is a Java merge class wrapped in a [Nasdanika CLI](https://docs.nasdanika.org/) command - which happens to be exactly the shape Git wants of a **custom merge driver**.
Registered in `.gitattributes`, it receives the ancestor, ours, and theirs: the same three inputs, from the tool teams already use. `git merge` on a diagram then does something sensible instead of line-diffing machine-written XML that has no line structure worth merging and is often stored compressed anyway.
It also widens the scenario past regeneration - two people editing the same drawing on two branches is the same three-way merge and gets the same treatment - and because the merge runs on the shared model rather than on a file format, one driver serves the whole family, provided the loader and generator round-trip.
Which is what the ports and waypoints above are for.

Conflicts then get the same treatment as everything else here: as data, not as markers in a file. Strategies for surfacing them resolve through the [capability framework](https://docs.nasdanika.org/core/capability/index.html), so *how* a conflict is presented is a plug-in decision rather than a property of the merge algorithm - and different notations and pipelines may want different answers.
One strategy emits **conflict elements** into the drawing itself: tagged, queryable shapes on their own layer, which can be switched off while reading, queried across a whole repository ("which diagrams still have unresolved conflicts"), and deleted in bulk once settled - `Layer.visible` and `locked` earning their place.
Another reproduces the classic three-way merge UI without anyone having to build one: for each conflicted page it adds four pages to the document - ancestor, ours, theirs, and the merged page carrying the conflict shapes.
Because `Diagram` nests, adding pages is only adding children; because conflicts are elements, resolving one is an edit like any other.
The person settles the conflict in Draw.io, looking at the diagram, rather than in a text editor looking at XML.

The sources are already models in this ecosystem: [Java](https://github.com/Nasdanika-Models/java) and coverage, [Maven](https://maven.models.nasdanika.org/) dependencies, [SQL](https://sql.models.nasdanika.org/) schemas, [Jira](https://github.com/Nasdanika-Models/jira) issues, [GitLab](https://github.com/Nasdanika-Models/gitlab) projects and contributors, [Azure](https://github.com/Nasdanika-Models/azure) resources, [Kubernetes](https://kubernetes.models.nasdanika.org/) workloads, [C4](https://c4.models.nasdanika.org/) views, [PlantUML](https://plantuml.models.nasdanika.org/), and AI-generated text.
Because they converge on one diagram model, the merge is not only generated-against-edited but also **source-against-source**: dependencies, schema, issues, and runtime in one drawing, which is the picture no single tool will ever produce because no single tool holds all four.

ELK is what keeps the result readable, because a merged graph is not a laid-out graph.
Re-running layered, orthogonal, radial, or force-based layout over the union turns a merge from a diff someone has to tidy afterwards into a diagram that opens correctly - "a well-laid-out diagram compresses hours of reading into seconds of comprehension", and large structures are past the point where a human should be placing boxes at all.
Generate, enrich, regenerate, merge, re-lay out, review the diff in a pull request, repeat.
That loop is the whole point of treating diagrams as data, and it is the one workflow a picture format cannot support at all.

**AI-generated and AI-read diagrams.** A typed model is a far better contract for a language model than mxGraph XML: emit or read a small, documented structure, then validate that the result is structurally sound and that every shape depicts an approved element - before anything renders.

**Diagrams as governed artifacts.** A diagram participates in the estate from either direction.
Unmapped, its own elements carry ownership, stages, and documentation - "who owns this box, when was it last reviewed, is it still current" answered about the diagram itself, which is the question most diagram estates cannot answer at all.
Mapped, `semanticElements` reaches the tower: shapes depicting threat assets, architecture elements under a control catalog, work items open against a component.
Either way the diagram stops being a picture *about* the model and becomes a model.

## Model overview

| Area | Types |
|------|-------|
| Geometry | [Point](references/eClassifiers/Point/index.html) (`x`, `y`), [Bounds](references/eClassifiers/Bounds/index.html) (`width`, `height`) |
| Base | [DiagramElement](references/eClassifiers/DiagramElement/index.html) - `tags`, `properties`, `semanticElements` (optional, many-valued), `children` keyed by `id`; extends nxcore `NamedElement`, so identity, documentation, `uris`, `icon`, and markers come with it |
| Structure | [Diagram](references/eClassifiers/Diagram/index.html) (nestable - document, page, slide, group), [Layer](references/eClassifiers/Layer/index.html) (`visible`, `locked`) |
| Notation | [Node](references/eClassifiers/Node/index.html) (`bounds`, `ports`, incoming/outgoing connections), [Port](references/eClassifiers/Port/index.html) (relative `location`), [Connection](references/eClassifiers/Connection/index.html) (`source`/`target`, `waypoints`), [Label](references/eClassifiers/Label/index.html) (`text`) |
| Reused, not redefined | nxcore `NamedElement` / `ModelElement` / `Documented` / `Marked` / `Referrable` / `StringToStringMapEntry`; ownership, stages, and governance aspects available from the floors below rather than re-invented here |
| In progress | `semanticElementsSelector` - an nxcore `Evaluator` computing `semanticElements` from a query instead of an enumerated list; three-way merge as a CLI command doubling as a Git merge driver, with conflict-rendering strategies resolved as capabilities |

## Relation to other Nasdanika work

**The family.** Notation-specific models extend this one with what makes each notation itself: [Draw.io](https://drawio.models.nasdanika.org/) with mxGraph styles and magic properties, [PlantUML](https://plantuml.models.nasdanika.org/) with diagram kinds and skin parameters, [Visio](https://visio.models.nasdanika.org/) with masters and stencils, [PowerPoint](https://powerpoint.models.nasdanika.org/) with slide layouts and placeholders, and [Presentation](https://presentation.models.nasdanika.org/) with the deck-level concerns presentation formats share.

**Adjacent models.** [ELK](https://elk.models.nasdanika.org/) for layout, [Graph](https://github.com/Nasdanika-Models/graph) for the processor wiring behind executable diagrams, [C4](https://c4.models.nasdanika.org/) as a worked notation-plus-semantics pairing, [ECharts](https://github.com/Nasdanika-Models/echarts) for the charting side of the same "picture as data" idea, and [Markdown](https://markdown.models.nasdanika.org/) as the other authoring surface - text where text is natural, geometry where geometry is.

**Templates.** [drawio-site](https://github.com/Nasdanika-Templates/drawio-site) is the fork-and-go starting point: a repository, a GitHub Action, and a `.drawio` file that publishes itself as a documentation site - the middle rung of the ramp with nothing to install.

**Tooling.** Models are loaded from their native formats, authored in [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) or as XMI/YAML/JSON, wired through the [capability framework](https://docs.nasdanika.org/core/capability/index.html), transformed with [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) or [NSML](https://github.com/Nasdanika-Models/nasdanika-semantic-mapping-language), and documented with the generation stack that built this site.
