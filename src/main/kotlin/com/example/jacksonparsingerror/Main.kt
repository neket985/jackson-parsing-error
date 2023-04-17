package com.example.jacksonparsingerror

import com.example.datamodule.BigEntityAtModule
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

object Main{
    private val mapper = jacksonObjectMapper().apply {
        disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    }
    private val row = "{\"field1\":\"qq\"}"

    fun parseSample() {
//        val mapped = mapper.readValue<BigEntity>(row)
        val mapped = mapper.readValue<BigEntityAtModule>(row)
        println(mapped)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        parseSample()
    }
}