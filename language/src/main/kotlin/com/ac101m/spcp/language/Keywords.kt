package com.ac101m.spcp.language

/**
 * The set of top-level keywords recognised by the compiler.
 * When parsing a source file, the parser will look for these keywords first to direct
 * further parsing.
 */
enum class Keywords(val identifier: String) {
    /**
     * Appears at the top of files, indicates to the compiler that an additional file should be
     * included as part of the program.
     */
    INCLUDE_DIRECTIVE("include"),

    /**
     * Begins a struct definition.
     */
    STRUCT_DEFINITION("struct"),

    /**
     * Begins a function definition.
     */
    FUNCTION_DEFINITION("fun"),

    /**
     * Begins a variable declaration.
     */
    VARIABLE_DECLARATION("var"),

    /**
     * Begins a constant declaration.
     */
    CONSTANT_DECLARATION("const")
}
