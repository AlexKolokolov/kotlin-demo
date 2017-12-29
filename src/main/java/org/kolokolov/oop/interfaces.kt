package org.kolokolov.oop

interface Clickable {
    fun click()
}

abstract class ViewElement(val id: String) {
    open fun renderElement() {
        println("Element [$id] is rendering")
    }
}

class Button(id: String) : Clickable, ViewElement(id) {
    override fun click() {
        println("Button [$id] is being clicked")
    }

    override fun renderElement() {
        print("Button ")
        super.renderElement()
    }
}

fun main(args: Array<String>) {
    val button = Button("Start Button")
    button.renderElement()
    button.click()
}