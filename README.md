# SPCP - Simple Portable Compiler Project

## About
Although portable compilers are nothing new (LLVM is a prime example), porting them to new instruction sets is a 
non-trivial undertaking. Real compilers have to support real software and they have to generate performant code for real 
CPUs. Because of this, they tend to be quite complicated!

The goal of this project is to deliver and maintain a _simple_ compiler which may be easily modified to emit machine 
code for arbitrary homebrew instruction sets.

## Project progress
- 🟢 Initial language definition, datatypes, syntax, includes etc
- 🔵 Parsing and generation of an abstract syntax tree (AST)
- 🔴 Textmate grammar for syntax highlighting
- 🔴 Syntax checking, readable error messages and so such
- 🔴 IR definition and generation from the AST
- 🔴 Machine description framework, registers, calling conventions, instructions, stack, endiness etc etc
- 🔴 Lowering framework, including software substitutions for missing operations on the target architecture
- 🔴 Optimisation passes, both generic and back-end specific.
- 🔴 Documentation and guides on defining a back end for your ISA!

🟢 = future work, 🔵 = In progress, 🔴 = Done
