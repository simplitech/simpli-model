package br.com.simpli.model

open class PageCollection<T>(var items: List<T>, var total: Int) {
    constructor() : this(emptyList(), 0)
}