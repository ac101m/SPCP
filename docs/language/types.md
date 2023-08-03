# Types
SPCL is strongly typed and includes a simple but powerful type system modeled after the C type system.

## Built-in types
SPCL Implements a number of built-in types. Currently, the built-in types are restricted to signed and unsigned integers
of various sizes, and a boolean type which may take the value `true` or `false`.

**Unsigned integer types:**
```
u8      // Unsigned 8-bit integer
u16     // Unsigned 16-bit integer
u32     // Unsigned 32-bit integer
u64     // Unsigned 64-bit integer
```

**Signed integer types:**
```
i8      // Signed 8-bit integer
i16     // Signed 16-bit integer
i32     // Signed 32-bit integer
i64     // Signed 64-bit integer
```

**Boolean type:**
```
bool    // A variable which may take the value 'true' or 'false'
```

## Type specifiers
In SPCL, type specifiers are used in [variable declarations](variables.md#variables) and 
[function definitions](functions.md#function-definitions) to declare variable or function return types.

**Variable which contains an 8-bit integer:**
```
var myVariable: u8
```

**Function which returns an 8-bit integer:**
```
fun myFunction(): u8 { /* Function body */ }
```

## Constant types
A type can be made into a constant type by adding the `const` modifier to the type specifier in front of it. The const 
modifier always applies to the type on the right. Constant types cannot not be reassigned.

**Example constant type and erroneous assignment:**
```
const myConst: const u8 = 0
myConst = 1                     // This will cause a compile-time error
```

## Pointer types
Pointers are variables which store the address of a variable elsewhere in memory, they allow you to store and manipulate 
references to variables elsewhere in memory while maintaining strong typing. The pointer type modifier `*`, like the
constant modifier, applies to the type to the right.

**Examples pointer types:**
```
* u8        // Pointer to an unsigned 8 bit integer
* * u8      // Pointer to a pointer to an unsigned 8 bit integer
```

Const type modifiers may also be mixed into pointer types:

**Example const pointer types:**
```
* const u8              // Pointer to a constant unsigned 8 bit integer
const * u8              // Constant pointer to an unsigned 8 bit integer
const * const * u8      // Constant pointer to constant pointer to an 8 bit unsigned integer
```

Pointers can be created using the [address of and dereference operators](operators.md#pointer-operators), and may be
initialized with data using [array initializers](variables.md#arrays) or
[string literals](variables.md#string-literals).
