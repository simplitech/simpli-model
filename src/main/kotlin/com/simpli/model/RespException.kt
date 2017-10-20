package com.simpli.model

/**
 *
 * @author gil
 */
class RespException : RuntimeException {
    var code: Int? = null

    constructor(text: String) : super(text) {}

    constructor(code: Int?, text: String) : super(text) {
        this.code = code
    }
}
