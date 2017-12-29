package org.kolokolov.oop

open class User(val name: String, val email: String) {
    override fun toString(): String {
        return "User($name, $email)"
    }
}

class FacebookUser(name: String, email: String) : User(name,email) {
    override fun toString(): String {
        return "FacebookUser($name, $email)"
    }
}


fun main(args: Array<String>) {
    val user: User = FacebookUser("Alex", "alex@mail.com")
    println(user)
}