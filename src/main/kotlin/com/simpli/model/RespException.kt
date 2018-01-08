package com.simpli.model

import java.io.IOException

/**
 *
 * @author gil
 */
open class RespException : IOException {
    var code: Int? = null

    constructor(text: String) : super(text) {}

    constructor(code: Int?, text: String) : super(text) {
        this.code = code
    }
}
