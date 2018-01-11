package com.simpli.model

import java.util.HashMap

class NamedWrapper<T>() : HashMap<String, T>() {

    constructor(name: String, obj: T): this() {
        put(name, obj)
    }

}