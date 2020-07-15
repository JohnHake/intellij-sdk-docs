import java.nio.file.Paths

print("Called with ")
var numArgs = args.size
print(numArgs)
println(" arguments.")
if (numArgs > 0) {
  println("Called with args:")
  args.forEach {
    println("- $it")
  }
}
val outDir = Paths.get("out").toAbsolutePath()
print("Absolute path is: ")
println(outDir.fileName.toString())