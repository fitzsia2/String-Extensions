package com.example.stringextensions

fun String.isValidEmail(): Boolean {
    return EmailValidation.EMAIL_REGEX.matches(this)
}
