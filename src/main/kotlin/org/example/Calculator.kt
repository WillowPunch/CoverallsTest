package org.example

/**
 * Простой класс калькулятора, который выполняет базовые арифметические операции.
 */
class Calculator {
    /**
     * Складывает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    fun add(a: Double, b: Double): Double = a + b

    /**
     * Вычитает второе число из первого.
     *
     * @param a первое число
     * @param b второе число
     * @return разность a и b
     */
    fun subtract(a: Double, b: Double): Double = a - b

    /**
     * Умножает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return произведение a и b
     */
    fun multiply(a: Double, b: Double): Double = a * b

    /**
     * Делит первое число на второе.
     *
     * @param a первое число
     * @param b второе число
     * @return результат деления a на b
     * @throws IllegalArgumentException если b равно нулю
     */
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Деление на ноль невозможно")
        }
        return a / b
    }
} 