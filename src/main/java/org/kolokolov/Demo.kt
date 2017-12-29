package org.kolokolov

fun main(args: Array<String>) {
    val person = Person("Alex", Contacts("Chumatskaya str., 8, 6", "0674930342", "kolokolov_a@ukr.net"))
    sendEmail(person)
}

fun sendEmail(person: Person?) {
    val email = person?.contacts?.email?: return
    println("Sending email to $email")
}

class Contacts(var address: String, var phoneNumber: String, var email: String?)

class Person(val name: String, val contacts: Contacts?)
