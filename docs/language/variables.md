# Variables and constants

## Variables
Variable declarations in SPCL consist of up to four parts; the variable mode (either `var` or `const`), the variable 
name, the [type specifier](types.md#type-specifiers) and the initialising expression.

**Breakdown:**
```
var foo: u16 = 100
 │   │    │     └ Initialising expression = 10
 │   │    └ Type = Unsigned 16 bit integer
 │   └ Name = foo
 └ Mode = variable
```

Some of these fields are optional depending on how the variable is declared and initialised. For example, variables
may be left un-initialized, in which case their initial values are undefined.

**Optional initialisation:**
```
var myVariable: u8          // Declare an unsigned 8 bit variable but don't assign a value
var myVariable: u8 = 10     // Declare an unsigned 8 bit variable and assign a value of 10
```

Variables may also be initialised using arbitrary expressions including
[function calls](functions.md#function-definitions) and arithmetic expressions. In cases where the type of the 
initialising expression is known, the type specifier can be omitted.

**Example initialisation from function call:**
```
fun functionThatReturnsU8(): u8 {
    /* Do stuff */
}

var myVariable: u8 = functionThatReturnsU8()    // Initialise from function call
var myVariable = functionThatReturnsU8()        // Type specifier inferred from function return type
```

**Example initialisation using an arithmetic expression:**
```
var variable1: u8 = 10
var variable2 = variable1 + 1    // Type inferred from initialising expression
```

## Constants
Constants work the same way as variables, however they cannot be re-assigned and therefore must be initialised at
declaration time.

**Example constant declarations:**
```
const myConst: const u8 = 4     // Declare a constant 8 bit unsigned integer and assign a value of 4
const myConst: const u8         // This is an error
```

In the case of a constant declaration, the leading modifier in the type specifier may be omitted:

```
const myConst: u8 = 4           // Same meaning as above
```

## Arrays
[Pointers](types.md#pointer-types) may be initialised using array initializers. Array initializers allow programmers to 
memory on the stack for arrays of variables and initialise a pointer directly so that it points at that memory.

**Example of pointer array initialization:**
```
var myArray: * u8 = [4]             // Create an array of 4 uninitialized 8 bit integers
var myArray: * u8 = {10, 3, 4, 7}   // Create an array of 4 8 bit integers an initialise their values
```

Multidimensional arrays may also be used to initialize nested pointers:

**Example array initialzer user with multidimensional array:**
```
var myArray: * * u8 = [2][2]                // Array of 2 arrays of 2 8 bit unsigned integers
var myArray: * * u8 = {{0, 1}, {2, 3}}      // As above, but initialized with values
```

In cases where the number of layers of the array initializer is less than the level of pointer nesting, the outermost
pointer is used as the array and the remainder of the [type specifier](types.md#type-specifiers) is used as the array
type.

```
var myArray: * * u8 = [4]       // Array of 4 pointers to 8 bit unsigned integers
```

In cases where the number of levels in the array initializer is greater than the level of pointer nesting, a compile
time error will occur:

```
var myArray: * u8 = [2][2]      // Erroneous initializer, array dimension don't match pointer type
```

## String literals
Pointers to unsigned 8-bit integers may also be initialized using a string literal. When a const type is initialized in
this way, a reference to the base string literal is used, otherwise memory is allocated and the string is copied.

**Example pointer string literal initialization:**
```
// Create a pointer, allocate memory and copy the string from the base string literal
var myString: * u8 = "Hello world!"

// Create a pointer, initialialize it so that it points at the base string literal
var myString: * const u8 = "Hello world!"
```
