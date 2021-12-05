package com.manhhavu.bchronos

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.manhhavu.bchronos")
		.start()
}

