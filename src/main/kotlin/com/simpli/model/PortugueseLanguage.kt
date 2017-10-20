package com.simpli.model

/**
 *
 * @author gil
 */
class PortugueseLanguage : LanguageHolder() {

    override fun language(): String {
        return "pt-br"
    }

    override fun cannotBeNull(propertyName: String): String {
        return propertyName + " não pode ser vazio"
    }

    override fun lengthCannotBeMoreThan(propertyName: String, size: Int): String {
        return "$propertyName possui um limite de $size caracteres"
    }

    override fun unexpectedError(): String {
        return "Erro inesperado, tente novamente mais tarde"
    }

    override fun invalidLogin(): String {
        return "Login inválido"
    }

    override fun pleaseLogin(): String {
        return "Por favor, faça login"
    }

    override fun errorSendingTheEmail(): String {
        return "Erro ao enviar o e-mail"
    }

    override fun theImageIsTooBig(): String {
        return "A imagem é muito grande"
    }

    override fun errorExecutingTheFunctionInThreadPool(): String {
        return "Erro executando a função na Thread Pool: "
    }

    override fun contactEmail(): String {
        return "E-mail de contato"
    }

    override fun invalidEntry(): String {
        return "Entrada inválida"
    }

    override fun isNotAValidEmail(propertyName: String): String {
        return propertyName + " não é um e-mail válido"
    }

    override fun isNotAValidCPF(propertyName: String): String {
        return propertyName + " não é um CPF válido"
    }

    override fun isNotAValidCNPJ(propertyName: String): String {
        return propertyName + " não é um CNPJ válido"
    }

    override fun alreadyExist(propertyName: String): String {
        return "Já existe uma entrada com $propertyName igual"
    }
}
