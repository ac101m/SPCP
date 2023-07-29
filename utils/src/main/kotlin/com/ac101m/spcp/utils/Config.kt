package com.ac101m.spcp.utils

import java.nio.charset.Charset

class Config {
    companion object {
        val COMPILER_CHAR_SET: Charset = Charset.forName("UTF-8")
        const val LINE_NUMBER_START = 1
        const val COLUMN_NUMBER_START = 1
    }
}
