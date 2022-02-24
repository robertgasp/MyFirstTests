package com.example.myfirsttests

import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_without_dog_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name_email"))
    }

    @Test
    fun emailValidator_with_wrong_domain_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email.com%"))
    }

    @Test
    fun emailValidator_with_wrong_domain2_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email.com_"))
    }

    @Test
    fun emailValidator_with_wrong_domain3_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email.com+"))
    }

    @Test
    fun emailValidator_correct_email_with_blank_space_at_the_end_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email.com "))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(null))
    }
}
