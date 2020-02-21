package cz.ackee.stringextensions

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class EmailValidationTest {

    @Test
    fun `Test valid email string`() {
        assertTrue("bob_black@company.cz".isValidEmail())
    }

    @Test
    fun `Test invalid email strings`() {
        assertFalse("@company.cz".isValidEmail())
        assertFalse("bobcompany.cz".isValidEmail())
        assertFalse("bob@company".isValidEmail())
        assertFalse("@company.cz".isValidEmail())
    }
}
