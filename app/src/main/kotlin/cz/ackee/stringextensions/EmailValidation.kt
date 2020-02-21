package cz.ackee.stringextensions

object EmailValidation {

    val EMAIL_REGEX = """[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,64}""".toRegex()
}
