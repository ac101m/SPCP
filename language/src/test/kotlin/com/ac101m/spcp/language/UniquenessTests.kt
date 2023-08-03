package com.ac101m.spcp.language

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * A set of really dumb tests to ensure that nothing stupid has been done
 * with the language keywords!
 */
class UniquenessTests {
    @Test
    fun `keywords token strings are all unique`() {
        val keywords = Keywords.entries.toTypedArray()
        val tokenSet = keywords.map { it.identifier }.toSet()
        assertThat(tokenSet.size).isEqualTo(keywords.size)
    }

    @Test
    fun `datatype token strings are all unique`() {
        val dataTypes = DataTypes.entries.toTypedArray()
        val tokenSet = dataTypes.map { it.identifier }.toSet()
        assertThat(tokenSet.size).isEqualTo(dataTypes.size)
    }
}
