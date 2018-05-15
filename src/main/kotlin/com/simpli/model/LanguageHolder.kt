package com.simpli.model

import java.util.HashMap

/**
 *
 * @author gil
 */
abstract open class LanguageHolder {

    protected var dictionary: Map<String, String> = HashMap()

    operator fun get(o: String): String {
        return dictionary[o] ?: o
    }

    abstract fun language(): String
    abstract fun cannotBeNull(propertyName: String): String
    abstract fun cannotBeNegative(propertyName: String): String
    abstract fun lengthCannotBeMoreThan(propertyName: String, size: Int): String
    abstract fun unexpectedError(): String
    abstract fun invalidLogin(): String
    abstract fun pleaseLogin(): String
    abstract fun emailNotFound(): String
    abstract fun invalidToken(): String
    abstract fun expiredToken(): String
    abstract fun invalidEntry(): String
    abstract fun isNotAValidEmail(propertyName: String): String
    abstract fun isNotAValidCPF(propertyName: String): String
    abstract fun isNotAValidCNPJ(propertyName: String): String
    abstract fun errorSendingTheEmail(): String
    abstract fun contactEmail(): String
    abstract fun theImageIsTooBig(): String
    abstract fun errorExecutingTheFunctionInThreadPool(): String
    abstract fun alreadyExist(propertyName: String): String

}
