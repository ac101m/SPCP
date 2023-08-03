# Structures
Structs are a data management feature that allows programmers to group related variables together and manage them
collectively.

## Structure definitions
A structure definition consists of the `struct` keyword, followed by a name and a body containing struct members
consisting of [variable declarations](variables.md#variables) and 
[function definitions](functions.md#function-definitions).

**Example struct definition:**
```
struct Coordinates {
    var x: i8 = 0
    var y: i8 = 0
    
    fun sum(): i8 {
        return x + y
    }
}
```

The above code declares a new struct type called `Coordinates` with two member variables `x` and `y` of type u8, each 
with an initial value of zero, and a member function which will return the sum of the x and y variables.

## Structure instantiation
Once defined, a struct type may be used in a [type specifier](types.md#type-specifiers) within a 
[variable](variables.md#variables) or [constant](variables.md#constants) declaration to instantiate an instance of the 
struct.

**Example struct instantiation:**
```
var coordinates: Coordinates

coordinates.x = 13
coordinates.y = 37

var sum = coordinates.sum()
```

## Structure initialisation
Structures may be initialised at instantiation time using a list.

**Example struct initialisation:**
```
var coordinates: Coordinates = {10, 20}
```

Elements in the initializer list will be used to initialise variables in the struct in the order that their declarations
appear in the struct. The values in the list override any default initial values defined in the struct  itself.
