package com.ac101m.spcp.language

/**
 * Built-in data-types and their identifier strings.
 */
enum class DataTypes(val identifier: String, val size: Int) {

    /** Unsigned integers */
    U8("u8", 1),
    U16("u16", 2),
    U32("u32", 4),
    U64("u64", 8),

    /** Signed integers */
    I8("i8", 1),
    I16("i16", 2),
    I32("i32", 4),
    I64("i64", 8)
}
