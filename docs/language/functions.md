# Functions

## Function definitions
Functions may have any number of parameters and a single return value. Parameters follow the same syntax as 
[variable definitions](variables.md#variable-declaration). Both parameters and return types are optional.

**Simple function definition:**
```
fun myFunction() {
    /* Do something */
}
```

Functions may have any number of parameters, separated by commas. Parameters use the same syntax as regular
[variable declarations](variables.md#variable-declaration) and when The function is called, argument and return value
assignment follows normal [variable assignment rules](variables.md#variable-assignment).

**Function with parameters:**
```
fun myFunction(var arg1: u8, const arg2: u8) {
    /* Do something with arguments */
}
```

Functions may also have a return type which follows the function name and parameter list:

**Example function with a return type:**
```
fun myFunction(): u8 {
    /* Do something */
    return 42
}
```

## The main function
Every program begins with a main function which serves as the entry point for the program. This will typically be
defined in the projects [build entry point](builds-and-imports.md#build-entrypoint).

The main function must be named `main` and takes no arguments. The main function may optionally return an integer value
of any [built in integer type](types.md#built-in-types).

**With return type:**
```
fun main(): i16 {
    /* With return type */
    return -1
}
```

**With no return type:**
```
fun main() {
    /* No return type */
}
```
