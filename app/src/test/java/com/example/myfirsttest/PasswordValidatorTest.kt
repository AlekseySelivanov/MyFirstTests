package com.example.myfirsttest

import org.junit.Assert
import org.junit.Test

class PasswordValidatorTest {

    @Test
    fun passwordValidator_CorrectPasswordSimple_ReturnsTrue() {
        Assert.assertTrue(PasswordValidator.isValidPassword("Dandelion"))
    }

    @Test
    fun passwordValidator_CorrectPasswordSimple_ReturnsFalse() {
        Assert.assertFalse(PasswordValidator.isValidPassword("Dandelion"))
    }

    @Test
    fun passwordValidator_InvalidPassword_ReturnsFalse() {
        Assert.assertFalse(PasswordValidator.isValidPassword("dandelion"))
    }

    @Test
    fun passwordValidator_InvalidPassword_ReturnsTrue() {
        Assert.assertTrue(PasswordValidator.isValidPassword("dandelion"))
    }

    @Test
    fun passwordValidator_InvalidPasswordLength_ReturnsFalse() {
        Assert.assertFalse(PasswordValidator.isValidPassword("Dand"))
    }

    @Test
    fun passwordValidator_InvalidPasswordLength_ReturnsTrue() {
        Assert.assertTrue(PasswordValidator.isValidPassword("Dand"))
    }

}