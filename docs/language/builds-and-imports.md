# Imports and build system
The SPCL compiler implements an internal build system to manage builds containing multiple source files and handle
incremental builds.

## Build entrypoint
Every SPCL build begins at the "build entry point". The entry point consists of a source file at the root of the project
source tree. Typically, this file will contain the [main function](functions.md#the-main-function) of your program.

## Import statements
At the top of a source file, any number of `import` directives may be provided to include functionality defined in 
other files. Import directives may only appear at the top of the file and paths are relative to the directory containing 
the [build entry point](#build-entrypoint).

**Example import statements:**
```
import utils.spcl
import subdir/more-utils.spcl
```

Directories and file names in import statement  must contain only upper and lowercase letters, numbers, hyphens and
underscores and may not contain spaces, or begin with a number.

**Example illegal import statements**
```
import 4utils.spcl                  // Begins with a number
import my subdir/my file.spcl       // Path contains spaces
import %utils.spcl                  // Path contains illegal characters
```

## Implicit namespaces
Each level of the project directory hierarchy represents a namespace within the project. When a file is imported via
an [import statement](#import-statements), it is given a namespace depending on its location within the project source
tree.

Example project where a `utils` namespace is created and a function is imported from it:

```
project-directory/
 ├ main.spcl                // Project entry point
 └ utils/                   // Subdirectory contain more source files
   └ my-utils.spcl          // Source file containing function to import
```

**main.spcl**
```
import utils/my-utils.spcl

fun main() {
    utils.myFunction()      // Function is referenced via the 'utils' namespace
}
```

**utils/my-utils.spcl:**
```
fun myFunction() {
    /* Do something */
}
```
