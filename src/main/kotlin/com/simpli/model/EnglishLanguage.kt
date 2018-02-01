package com.simpli.model

/**
 *
 * @author gil
 */
open class EnglishLanguage : LanguageHolder() {

    override fun language(): String {
        return "en-us"
    }

    override fun cannotBeNull(propertyName: String): String {
        return "$propertyName cannot be null"
    }

    override fun cannotBeNegative(propertyName: String): String {
        return "$propertyName cannot be a negative number"
    }

    override fun lengthCannotBeMoreThan(propertyName: String, size: Int): String {
        return "$propertyName length cannot be more than $size"
    }

    override fun unexpectedError(): String {
        return "Unexpected Error. Please try again later"
    }

    override fun invalidLogin(): String {
        return "Invalid Login"
    }

    override fun pleaseLogin(): String {
        return "Please Login"
    }

    override fun errorSendingTheEmail(): String {
        return "Error sending the e-mail"
    }

    override fun theImageIsTooBig(): String {
        return "The image is too big"
    }

    override fun errorExecutingTheFunctionInThreadPool(): String {
        return "Error executing the function in Thread Pool: "
    }

    override fun contactEmail(): String {
        return "Contact E-mail"
    }

    override fun invalidEntry(): String {
        return "Invalid Entry"
    }

    override fun isNotAValidEmail(propertyName: String): String {
        return "$propertyName is not a valid e-mail"
    }

    override fun isNotAValidCPF(propertyName: String): String {
        return "$propertyName is not a valid CPF"
    }

    override fun isNotAValidCNPJ(propertyName: String): String {
        return "$propertyName is not a valid CNPJ"
    }

    override fun alreadyExist(propertyName: String): String {
        return "There is already an entry with the same $propertyName"
    }
}
