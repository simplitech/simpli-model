package br.com.simpli.model

import java.util.*

/**
 *
 * @author gil
 */
open class PagedResp<T> {
    var list: List<T> = LinkedList<T>()
    var recordsTotal: Int = 0

    constructor() {}

    constructor(list: List<T>) {
        this.list = list
    }

}
