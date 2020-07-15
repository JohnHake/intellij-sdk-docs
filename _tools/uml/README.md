# Working with PlantUML
* If you are unfamiliar with PlantUML, review the [quick start](https://plantuml.com/starting) instructions. 
* Install [Graphviz](https://plantuml.com/graphviz-dot) on your machine. 
* Get and install the [PlantUML Integration plugin](https://plugins.jetbrains.com/plugin/7017-plantuml-integration) for IntelliJ IDEA: 
  * Set the `GRAPHVIZ_DOT` system or environment property to point to the directory containing the Graphviz executable on your machine. 
    For example, `export GRAPHVIZ_DOT="/usr/local/Cellar/graphviz/2.42.3/bin/dot"` 
  * In the PlantUML plugin Settings (**Preferences/Settings \| Other Settings \| PlantUML**) set: 
    * The "Additional 'plantuml.include.path'" to be the absolute path to the directory containing the `jb-plantuml-theme.puml` file on your machine. 
      For example, `/<path to sdk root>/.tools/uml` or, if you have the IntelliJ-Community source code, `/<path to intellij-community root>/platform/docs/`. 
    * The "PlantUML config" to `!include jb-plantuml-theme.puml`
    
When a *.puml file is open in the IDE editor, the PlantUML Integration plugin will show a preview.

Please do not save a diagram in SVG format from the PlantUML plugin preview window. 
Instead, please use the Kotlin script because it will package fonts with the SVG image for a consistent display regardless of browser or platform.
For example, to save the UML diagram "myClassDiagram.puml" as SVG, please use the command line:

```bash
  .tools/uml $ kotlin build.main.kts myClassDiagram.puml
```
