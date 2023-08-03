# Conditional statements
Conditional statements allow the manipulation of program flow depending on the state of variables at runtime. SPCL
currently supports the following conditional statements:
- If-else statements
- For loops
- While loops
- Do-while loops

## If-else statements
If statements consist of the `if` keyword, followed by a [boolean expression](operators.md#expressions) condition, then 
a statement or block of statements to be executed conditionally. If the condition expression evaluates as `true`, the
statements will be executed, otherwise they will not.

**Example usage of if statement:**
```
if (a < b) {
    /* Do something */
}
```

If statement may also be nested arbitrarily:

```
if (a < b) {
    /* Do something */
    if (b + a < 10) {
        /* Do something else */
    }
}
```

Following an if statement is an optional else statement:

**Example usage of else block:**
```
if (a < b) {
    /* Do something */
} else {
    /* Do something esle */
}
```

Else blocks may also themselves be more if statements:

**Example else-if block:**
```
if (a < b) {
    /* Do something */
} else if (a + b < 10) {
    /* Do something else */
} else {
    /* Failing all else, do this */
}
```

## For loops
For loops consist of the `for` keyword, followed by an initializing statement to run before the first iteration, an
exit condition which will end the loop when x evaluates false, and an incrementing expression which is executed at the
end of each iteration.

**Example of for loop syntax:**
```
     ┌ Initializing statement
     │         ┌ Exit condition
     │         │       ┌ Increment expression
for (u8 i = 0; i < 10; i = i + 1) {
    /* Do this repeatedly */
}
```

In the case of this for loop, the loop will execute 10 times with i starting at zero and working it's way up

## While loops
While loops will run the block repeatedly until the [boolean expression](operators.md#relational-operators) at the
beginning of the loop is no longer met.

**Example of while loop syntax:**
```
while (a < b) {
    /* Do this repeatedly */
}
```

## Do-while loops
Do while loops work the same way as while loops, however the condition is evaluated at the end of each loop rather than
at the beginning.

**Example of do-while loop syntax:**
```
do {
    /* Do this repeatedly */
} while (a < b)
```
