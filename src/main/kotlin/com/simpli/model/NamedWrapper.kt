package com.simpli.model

import java.util.HashMap

class NamedWrapper<T>(name: String, obj: T) : HashMap<String, T>() {

    init {
        put(name, obj)
    }

}