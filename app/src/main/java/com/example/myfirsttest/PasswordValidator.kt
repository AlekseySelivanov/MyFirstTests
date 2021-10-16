package com.example.myfirsttest

import android.text.Editable
import android.text.TextWatcher
import java.util.regex.Pattern

class PasswordValidator : TextWatcher {

    internal var isValid = false

    override fun afterTextChanged(editableText: Editable) {
        isValid = isValidPassword(editableText)
    }

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) = Unit

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) = Unit

    companion object {

        /**
         * Паттерн для сравнения.
         */
        private val PASSWORD_PATTERN = Pattern.compile(
            "[A-Z]{1}" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}"
        )

        fun isValidPassword(pass: CharSequence?): Boolean {
            return pass != null && PASSWORD_PATTERN.matcher(pass).matches() && pass.length > 8
        }
    }
}