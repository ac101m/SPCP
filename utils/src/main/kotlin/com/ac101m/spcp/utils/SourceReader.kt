package com.ac101m.spcp.utils

import java.io.File
import java.io.InputStream
import java.io.InputStreamReader

/**
 * A stream reader which will keep track of line and column numbers.
 */
class SourceReader(inputStream: InputStream): InputStreamReader(inputStream, Config.COMPILER_CHAR_SET) {
    var line = Config.LINE_NUMBER_START
    var column = Config.COLUMN_NUMBER_START

    companion object {
        fun ofFile(file: File): SourceReader {
            require(file.exists()) {
                "No such file $file."
            }

            require(file.isFile) {
                "$file is not a file."
            }

            return SourceReader(file.inputStream())
        }
    }

    /**
     * Get next char, keep track of line and column.
     */
    override fun read(): Int {
        val char = super.read()

        if (char < 0) {
            return char
        }

        if (Char(char) == '\n') {
            column = 1
            line += 1
        } else {
            column += 1
        }

        return char
    }
}
