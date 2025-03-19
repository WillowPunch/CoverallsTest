package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.assertThrows

@DisplayName("Тесты для класса Calculator")
class CalculatorTest {
    
    private val calculator = Calculator()
    
    @Test
    @DisplayName("Проверка сложения двух чисел")
    fun testAdd() {
        assertEquals(4.0, calculator.add(2.0, 2.0), "2 + 2 должно равняться 4")
        assertEquals(0.0, calculator.add(0.0, 0.0), "0 + 0 должно равняться 0")
        assertEquals(-2.0, calculator.add(-1.0, -1.0), "-1 + (-1) должно равняться -2")
        assertEquals(1.5, calculator.add(0.5, 1.0), "0.5 + 1 должно равняться 1.5")
    }
    
    @ParameterizedTest
    @CsvSource(
        "5.0, 3.0, 2.0",
        "10.0, 5.0, 5.0",
        "0.0, 0.0, 0.0",
        "-3.0, -5.0, 2.0"
    )
    @DisplayName("Параметризованный тест на вычитание")
    fun testSubtract(a: Double, b: Double, expected: Double) {
        assertEquals(expected, calculator.subtract(a, b), 
            "$a - $b должно равняться $expected")
    }
    
    @Test
    @DisplayName("Проверка умножения двух чисел")
    fun testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), "2 * 3 должно равняться 6")
        assertEquals(0.0, calculator.multiply(5.0, 0.0), "5 * 0 должно равняться 0")
        assertEquals(-8.0, calculator.multiply(4.0, -2.0), "4 * (-2) должно равняться -8")
        assertEquals(2.5, calculator.multiply(1.0, 2.5), "1 * 2.5 должно равняться 2.5")
    }
    
    @Test
    @DisplayName("Проверка деления двух чисел")
    fun testDivide() {
        assertEquals(2.0, calculator.divide(10.0, 5.0), "10 / 5 должно равняться 2")
        assertEquals(2.5, calculator.divide(5.0, 2.0), "5 / 2 должно равняться 2.5")
        assertEquals(0.0, calculator.divide(0.0, 5.0), "0 / 5 должно равняться 0")
        assertEquals(-2.0, calculator.divide(10.0, -5.0), "10 / (-5) должно равняться -2")
    }
    
    @Test
    @DisplayName("Проверка выброса исключения при делении на ноль")
    fun testDivideByZero() {
        val exception = assertThrows<IllegalArgumentException> {
            calculator.divide(10.0, 0.0)
        }
        assertEquals("Деление на ноль невозможно", exception.message)
    }
} 