# SPCP - Simple Portable Compiler Project

## About
Although portable compilers are nothing new (LLVM is a prime example), porting them to new instruction sets is a 
non-trivial undertaking. Real compilers have to support real software and they have to generate performant code for real 
CPUs. Because of this, they tend to be quite complicated!

The goal of this project is to deliver and maintain a _simple_ compiler which may be easily modified to emit machine 
code for arbitrary homebrew instruction sets.

## Deliverables
- Specification for a simple c-like programming language (TRCL). Syntax TBD.
  - Member functions in structs.
  - C-style pointer types.
  - No header files!
- A compiler with a parameterizable back-end which may be retargeted to generate machine code.
  - Method to describe machine to the compiler:
    - Register set.
    - Calling conventions.
    - Instruction set.
  - Parameterizable lowering process.
    - Architecture specific optimisations.
- An assembly parser/emitter for viewing generated assembly code.

How hard can it possibly be?
