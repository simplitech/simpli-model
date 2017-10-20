package com.simpli.model

/**
 *
 * @author gil
 */
class PagedResp<T> {
    var list: List<T>? = null
    var recordsTotal: Int = 0

    constructor() {}

    constructor(list: List<T>) {
        this.list = list
    }

}
