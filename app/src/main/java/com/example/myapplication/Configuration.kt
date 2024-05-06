package com.example.myapplication

data class Configuration (
    val coffee: Boolean,
    val doubleCoffee: Boolean,
    val milk: Boolean,
    val cream: Boolean,
    val sugar: Boolean,
    val cinnamon: Boolean,
    val syrup: Boolean
)

class ConfigurationBuilder() {
    var coffee : Boolean = true
    var doubleCoffee : Boolean = false
    var milk : Boolean = false
    var cream : Boolean = false
    var sugar : Boolean = false
    var cinnamon : Boolean = false
    var syrup : Boolean = false

    fun setCoffee (value : Boolean): ConfigurationBuilder {
        this.coffee = value
        return this
    }

    fun setDoubleCoffee (value: Boolean): ConfigurationBuilder {
        this.doubleCoffee = value
        return this
    }

    fun setMilk (value: Boolean): ConfigurationBuilder {
        this.milk = value
        return this
    }
    fun setCream (value: Boolean): ConfigurationBuilder {
        this.cream = value
        return this
    }

    fun setSugar(value: Boolean): ConfigurationBuilder {
        this.sugar = value
        return this
    }

    fun setCinnamon (value: Boolean): ConfigurationBuilder {
        this.cinnamon = value
        return this
    }

    fun setSyrup (value: Boolean): ConfigurationBuilder {
        this.syrup = value
        return this
    }

    fun build(): Configuration {
        return Configuration(
            coffee = coffee,
            doubleCoffee = doubleCoffee,
            milk = milk,
            cream = cream,
            sugar = sugar,
            cinnamon = cinnamon,
            syrup = syrup
        )
    }
}
