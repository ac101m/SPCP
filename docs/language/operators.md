# Operators and expressions

## Expressions
Expressions are made up of operators and parentheses `()` and express computational operations. The result of an 
expression has a type which is inferred from the operators and their inputs.

Some operators operate on two values, one on either side, such as addition and subtraction:

```
lhs + rhs
lhs - rhs
```

Other operators are unary and operate on a single variable, such as the bitwise or logical not operators:

```
~rhs
!rhs
```

## Assignment operators
Assignment operators mutate the state of [variables](variables.md) by assigning a new value to them. The right hand side
is an expression to evaluate and the left hand side is a variable to which the result of the expression will be 
assigned. The types of the left and right hand sides must match or an error will occur at compile time.

**List of assignment operators:**
```
=       // Simple assignment assigns rhs to lhs
```

There is currently only one assignment operator, though more may be added in the future.

## Arithmetic operators
Arithmetic operators apply to [numeric types](types.md#built-in-types) and produce numeric results.

**List of arithmetic operators:**
```
+       // Sum of lhs and rhs
-       // Result of subtracting rhs from lhs
*       // Product of lhs and rhs
/       // Result fo dividing rhs by lhs
%       // Remainder when dividing rhs by lhs
```

In cases where expressions contain multiple operators, operations occur in the following order:
1) Parentheses
2) Division
3) Multiplication
4) Addition
5) Subtraction

**Example arithmetic expressions:**
```
a + b * c       // Multiplication happens first, due to operation order
(a + b) * c     // Addition happens first, due to parentheses
```

These operators can be applied to any two numeric values of any width. The width of the result will be the size of the 
larger of the two inputs.

**Example of unlike widths in arithmetic expressions:**
```
var a: u8 = 1
var b: u16 = 10

// Result will have the type u16
var result = a + b
```

## Bitwise operators
Bitwise operators can be used to perform arithmetic and logical shifts, as well as bit-masking operations. They can be
used on [integer types](types.md#built-in-types) of matching sizes.

**List of bitwise operators:**
```
&       // Bitwise and of lhs and rhs
|       // Bitwise or of lhs and rhs
^       // Bitwise xor of lhs and rhs
~       // Bitwise not of rhs
```

**List of shift operations:**
```
>>      // Right shift of rhs by lhs
<<      // Left shift of rhs by lhs
```

Right shifts will sign extend when operating on signed types.

## Comparison operators
Comparison operators compare numeric variables and produce boolean results. These are typically used as part of 
[control flow statements](conditional-statements.md) like if statements and for loops.

**List of relational operators:**
```
==      // true if lhs is equal to rhs, false otherwise
!=      // true if lhs is not equal to rhs, false otherwise
>       // true if lhs is greater than rhs, false otherwise
<       // true if lhs is less than rhs, false otherwise
>=      // true if lhs is greater than or equal to rhs, false otherwise
<=      // true if lhs is less than or equal to rhs, false otherwise
```

These operators may be used on any two variables with the same sign. Comparisons between signed and unsigned types will
result in a compile-time error.

## Boolean operators
Logical operators operate on boolean values and produce other boolean values.

**List of boolean operators:**
```
and     // true if both lhs and rhs are true, false otherwise
or      // true if either lhs or rhs are true, false otherwise
not     // true if rhs is false, false otherwise
```

**Example of expression using boolean operators:**
```
const a: bool = false
const b: bool = true
const c: bool = false

var result = ((not a) and b) or (not c)     // true
```

## Pointer operators
Pointer operators enable programmers to create and manipulate [pointer types](types.md#pointer-types).

**List of pointer operators:**
```
&       // Address-of operator, address of rhs
*       // Dereference operator, dereference rhs
[]      // Array access operator, array element of lhs
->      // Pointer access operator, access a member of an object pointed to by a pointer
```

Pointers can be created using the address-of operator and converted back to variable instances using the dereference
operator.

**Example of address of and dereference operator:**
```
var myVar: u8 = 16          // Create variable myVar
var myPtr: * u8 = &u8       // Obtain pointer to myVar with '&' operator
var myDeref: u8 = *myPtr    // Obtain the value pointed at by myPtr using the '*' operator
```

The array access operator is used to retrieve elements of an array from an array or pointer type without dereferencing
it first.

**Example usage of array access operator:**
```
var myArray: * u8 = [10]        // Create array of 10 unsigned 8 bit integers
var element3: u8 = myArray[3]   // Get the element at index 3 using array access operator
myArray[0] = 10                 // Set first element of array to 10 using array access operator
```

The pointer access operator allows the programmer to access members of a [structure](structures.md) from a pointer 
without dereferencing the pointer first.

**Example usage of pointer access operator:**
```
// Example struct
struct MyStruct {
    var x: u8 = 0
    var y: u8 = 0
}

// Create a struct instance and pointer to the struct
var structInstance: MyStruct
var structPtr: * MyStruct = &structInstance

// Get the "x" member from the struct without dereferencing the pointer
var x: u8 = structPtr->x
```
