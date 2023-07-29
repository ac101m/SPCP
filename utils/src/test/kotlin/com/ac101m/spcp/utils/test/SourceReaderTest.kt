package com.ac101m.spcp.utils.test

import com.ac101m.spcp.utils.Config
import com.ac101m.spcp.utils.SourceReader
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


class SourceReaderTest {
    @Test
    fun `source location is tracked correctly`() {
        val testString = "Hello\n\nWorld\n!"
        val reader = SourceReader(testString.byteInputStream())

        while (reader.read() != -1) {
            reader.read()
        }

        assertThat(reader.line).isEqualTo(Config.LINE_NUMBER_START + 3)
        assertThat(reader.column).isEqualTo(Config.COLUMN_NUMBER_START + 1)
    }
}
