# Publishing UML in SDK Documents
UML diagrams are developed and previewed using PlantUML.
The final SVG image of a UML diagram should be produced from a PUML file using the `build.main.kts` script.

## Working with PlantUML
* If you are unfamiliar with PlantUML, review the [quick start](https://plantuml.com/starting) instructions. 
* Install [Graphviz](https://plantuml.com/graphviz-dot) on your machine. 
* Get and install the [PlantUML Integration plugin](https://plugins.jetbrains.com/plugin/7017-plantuml-integration) for IntelliJ IDEA: 
  * Set the `GRAPHVIZ_DOT` system or environment property to point to the directory containing the Graphviz executable on your machine. 
    For example, `export GRAPHVIZ_DOT="/usr/local/Cellar/graphviz/2.42.3/bin/dot"` 
  * In the PlantUML plugin Settings (**Preferences/Settings \| Other Settings \| PlantUML**) set: 
    * The "Additional 'plantuml.include.path'" to be the absolute path to the directory containing the `jb-plantuml-theme.puml` file on your machine. 
      For example, `/<path to sdk root>/_tools/uml/`. 
    * The "PlantUML config" to `!include jb-plantuml-theme.puml`
    
When a PUML file is open in the IDE editor, the PlantUML Integration plugin will show a preview.
Please do not publish a diagram in SVG format from the PlantUML plugin preview window except for test and review purposes.

# Working With the build.main.kts Script
Please prepare an SVG image of a UML diagram (*.puml file) for publication using the build.main.kts Kotlin script because it will package fonts with the SVG image for a consistent display regardless of browser or platform.

To set-up the script, set-up the `UML to SVG` [run configuration](https://www.jetbrains.com/help/idea/run-debug-configuration-kotlin-script.html):
 * Script file: set to the _absolute_ path to the script.
   For example, `/Users/<user name>/Documents/source/sdk/_tools/uml/build.main.kts`
 * Program arguments: set to the _relative_ path from the Script file directory to the PUML file to be converted.
   For example, `../../reference_guide/img/publish.puml`
 * Working directory: set to the _relative_ path from the project (sdk root) directory to the Script file directory.
   For example, `_tools/uml` 

Continuing the above example Program arguments example, selecting the `UML TO SVG` run configuration and clicking on the **Run** icon will create `publish.svg` from `publish.puml` in the `/reference_guide/img/` directory.  
To convert other PUML files, substitute their relative path and filename from the Script file directory in the Program arguments field of the run configuration.