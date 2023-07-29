package com.ac101m.spcp.utils

import java.io.File

data class SourceLocation(val sourceFile: File, val line: Int, val column: Int) {
    override fun toString(): String {
        return "$sourceFile [$line:$column]"
    }
}
