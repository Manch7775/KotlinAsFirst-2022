package lesson3.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.math.PI

class Tests {
    @Test
    @Tag("Example")
    fun factorial() {
        assertEquals(1.0, lesson4.task1.task1.factorial(0), 1e-5)
        assertEquals(1.0, lesson4.task1.task1.factorial(1), 1e-5)
        assertEquals(6.0, lesson4.task1.task1.factorial(3), 1e-5)
        assertEquals(120.0, lesson4.task1.task1.factorial(5), 1e-5)
        assertEquals(3628800.0, lesson4.task1.task1.factorial(10), 1e-5)
        assertEquals(2.43290200817664E18, lesson4.task1.task1.factorial(20), 1E10)
    }

    @Test
    @Tag("Example")
    fun isPrime() {
        assertFalse(lesson4.task1.task1.isPrime(1))
        assertTrue(lesson4.task1.task1.isPrime(2))
        assertTrue(lesson4.task1.task1.isPrime(5))
        assertTrue(lesson4.task1.task1.isPrime(11))
        assertFalse(lesson4.task1.task1.isPrime(4))
        assertFalse(lesson4.task1.task1.isPrime(9))
        assertFalse(lesson4.task1.task1.isPrime(15))
        var count = 0
        for (n in 2..7919) {
            if (lesson4.task1.task1.isPrime(n)) {
                count++
            }
        }
        assertEquals(1000, count)
        count = 0
        for (n in 2..1000000) {
            if (lesson4.task1.task1.isPrime(n)) {
                count++
            }
        }
        assertEquals(78498, count)
    }

    @Test
    @Tag("Example")
    fun isPerfect() {
        assertTrue(lesson4.task1.task1.isPerfect(6))
        assertTrue(lesson4.task1.task1.isPerfect(28))
        assertFalse(lesson4.task1.task1.isPerfect(100))
    }

    @Test
    @Tag("Example")
    fun digitCountInNumber() {
        assertEquals(1, lesson4.task1.task1.digitCountInNumber(0, 0))
        assertEquals(1, lesson4.task1.task1.digitCountInNumber(7, 7))
        assertEquals(0, lesson4.task1.task1.digitCountInNumber(21, 3))
        assertEquals(1, lesson4.task1.task1.digitCountInNumber(510, 5))
        assertEquals(3, lesson4.task1.task1.digitCountInNumber(4784041, 4))
        assertEquals(4, lesson4.task1.task1.digitCountInNumber(5373393, 3))
    }

    @Test
    @Tag("2")
    fun digitNumber() {
        assertEquals(1, lesson4.task1.task1.digitNumber(0))
        assertEquals(1, lesson4.task1.task1.digitNumber(7))
        assertEquals(2, lesson4.task1.task1.digitNumber(10))
        assertEquals(2, lesson4.task1.task1.digitNumber(99))
        assertEquals(3, lesson4.task1.task1.digitNumber(123))
        assertEquals(10, lesson4.task1.task1.digitNumber(Int.MAX_VALUE))
    }

    @Test
    @Tag("2")
    fun fib() {
        assertEquals(1, lesson4.task1.task1.fib(1))
        assertEquals(1, lesson4.task1.task1.fib(2))
        assertEquals(2, lesson4.task1.task1.fib(3))
        assertEquals(5, lesson4.task1.task1.fib(5))
        assertEquals(21, lesson4.task1.task1.fib(8))
        assertEquals(102334155, lesson4.task1.task1.fib(40))
        assertEquals(1134903170, lesson4.task1.task1.fib(45))
        assertEquals(1836311903, lesson4.task1.task1.fib(46))
        // Just to calculate it
        lesson4.task1.task1.fib(50)
    }

    @Test
    @Tag("2")
    fun minDivisor() {
        assertEquals(2, lesson4.task1.task1.minDivisor(2))
        assertEquals(3, lesson4.task1.task1.minDivisor(75))
        assertEquals(5, lesson4.task1.task1.minDivisor(75 / 3))
        assertEquals(97, lesson4.task1.task1.minDivisor(97))
        assertEquals(7, lesson4.task1.task1.minDivisor(49))
        assertEquals(17, lesson4.task1.task1.minDivisor(8653))
        assertEquals(2124679, lesson4.task1.task1.minDivisor(2124679))
        assertEquals(1073676287, lesson4.task1.task1.minDivisor(1073676287))
        assertEquals(Int.MAX_VALUE, lesson4.task1.task1.minDivisor(Int.MAX_VALUE))
    }

    @Test
    @Tag("2")
    fun maxDivisor() {
        assertEquals(1, lesson4.task1.task1.maxDivisor(17))
        assertEquals(12, lesson4.task1.task1.maxDivisor(24))
        assertEquals(59, lesson4.task1.task1.maxDivisor(177))
        assertEquals(17, lesson4.task1.task1.maxDivisor(34))
        assertEquals(7, lesson4.task1.task1.maxDivisor(49))
        assertEquals(509, lesson4.task1.task1.maxDivisor(8653))
        assertEquals(1, lesson4.task1.task1.maxDivisor(2124679))
        assertEquals(1, lesson4.task1.task1.maxDivisor(1073676287))
        assertEquals(1, lesson4.task1.task1.maxDivisor(Int.MAX_VALUE))
    }

    @Test
    @Tag("2")
    fun collatzSteps() {
        assertEquals(0, lesson4.task1.task1.collatzSteps(1))
        assertEquals(1, lesson4.task1.task1.collatzSteps(2))
        assertEquals(7, lesson4.task1.task1.collatzSteps(3))
        assertEquals(5, lesson4.task1.task1.collatzSteps(5))
        assertEquals(6, lesson4.task1.task1.collatzSteps(10))
        assertEquals(7, lesson4.task1.task1.collatzSteps(20))
        assertEquals(6, lesson4.task1.task1.collatzSteps(64))
        assertEquals(25, lesson4.task1.task1.collatzSteps(100))
        assertEquals(7, lesson4.task1.task1.collatzSteps(128))
        assertEquals(111, lesson4.task1.task1.collatzSteps(1000))
        assertEquals(128, lesson4.task1.task1.collatzSteps(100000))
    }

    @Test
    @Tag("3")
    fun lcm() {
        assertEquals(13, lesson4.task1.task1.lcm(13, 13))
        assertEquals(8, lesson4.task1.task1.lcm(2, 8))
        assertEquals(24, lesson4.task1.task1.lcm(6, 8))
        assertEquals(975, lesson4.task1.task1.lcm(39, 75))
        assertEquals(13384091, lesson4.task1.task1.lcm(1357, 9863))
        assertEquals(1339310349, lesson4.task1.task1.lcm(13579, 98631))
        assertEquals(2089830349, lesson4.task1.task1.lcm(23579, 88631))
        assertEquals(2022222222, lesson4.task1.task1.lcm(2, 1011111111))
        assertEquals(2022222222, lesson4.task1.task1.lcm(1011111111, 2))
    }

    @Test
    @Tag("3")
    fun isCoPrime() {
        assertTrue(lesson4.task1.task1.isCoPrime(25, 49))
        assertFalse(lesson4.task1.task1.isCoPrime(6, 8))
        assertTrue(lesson4.task1.task1.isCoPrime(17, 97))
        assertFalse(lesson4.task1.task1.isCoPrime(37, 111))
        assertTrue(lesson4.task1.task1.isCoPrime(1234567890, 908765431))
        assertTrue(lesson4.task1.task1.isCoPrime(2109876543, 1234567891))
    }

    @Test
    @Tag("3")
    fun revert() {
        assertEquals(87431, lesson4.task1.task1.revert(13478))
        assertEquals(0, lesson4.task1.task1.revert(0))
        assertEquals(3, lesson4.task1.task1.revert(3))
        assertEquals(111, lesson4.task1.task1.revert(111))
        assertEquals(17571, lesson4.task1.task1.revert(17571))
        assertEquals(123456789, lesson4.task1.task1.revert(987654321))
    }

    @Test
    @Tag("3")
    fun isPalindrome() {
        assertTrue(lesson4.task1.task1.isPalindrome(3))
        assertFalse(lesson4.task1.task1.isPalindrome(3653))
        assertTrue(lesson4.task1.task1.isPalindrome(15751))
        assertTrue(lesson4.task1.task1.isPalindrome(24688642))
        assertFalse(lesson4.task1.task1.isPalindrome(Int.MAX_VALUE))
        assertTrue(lesson4.task1.task1.isPalindrome(2147447412))
    }

    @Test
    @Tag("3")
    fun hasDifferentDigits() {
        assertTrue(lesson4.task1.task1.hasDifferentDigits(323))
        assertTrue(lesson4.task1.task1.hasDifferentDigits(54))
        assertTrue(lesson4.task1.task1.hasDifferentDigits(222266666))
        assertFalse(lesson4.task1.task1.hasDifferentDigits(0))
        assertFalse(lesson4.task1.task1.hasDifferentDigits(777))
        assertTrue(lesson4.task1.task1.hasDifferentDigits(31122))
    }

    @Test
    @Tag("4")
    fun sin() {
        assertEquals(0.0, lesson4.task1.task1.sin(0.0, 1e-5), 1e-5)
        assertEquals(1.0, lesson4.task1.task1.sin(PI / 2.0, 1e-5), 1e-5)
        assertEquals(0.0, lesson4.task1.task1.sin(PI, 1e-5), 1e-5)
        assertEquals(-1.0, lesson4.task1.task1.sin(3.0 * PI / 2.0, 1e-5), 1e-5)
        assertEquals(0.0, lesson4.task1.task1.sin(100 * PI, 1e-5), 1e-5)
        assertNotEquals(kotlin.math.sin(1.0), lesson4.task1.task1.sin(1.0, 1.0))
        assertNotEquals(kotlin.math.sin(-0.5), lesson4.task1.task1.sin(-0.5, 1.0))
    }

    @Test
    @Tag("4")
    fun cos() {
        assertEquals(1.0, lesson4.task1.task1.cos(0.0, 1e-5), 1e-5)
        assertEquals(0.0, lesson4.task1.task1.cos(PI / 2.0, 1e-5), 1e-5)
        assertEquals(-1.0, lesson4.task1.task1.cos(PI, 1e-5), 1e-5)
        assertEquals(0.0, lesson4.task1.task1.cos(3.0 * PI / 2.0, 1e-5), 1e-5)
        assertEquals(1.0, lesson4.task1.task1.cos(100 * PI, 1e-5), 1e-5)
        assertNotEquals(kotlin.math.cos(1.0), lesson4.task1.task1.cos(1.0, 1.0))
        assertNotEquals(kotlin.math.cos(0.5), lesson4.task1.task1.cos(-0.5, 1.0))
    }

    @Test
    @Tag("4")
    fun squareSequenceDigit() {
        assertEquals(1, lesson4.task1.task1.squareSequenceDigit(1))
        assertEquals(4, lesson4.task1.task1.squareSequenceDigit(2))
        assertEquals(5, lesson4.task1.task1.squareSequenceDigit(7))
        assertEquals(6, lesson4.task1.task1.squareSequenceDigit(12))
        assertEquals(0, lesson4.task1.task1.squareSequenceDigit(17))
        assertEquals(9, lesson4.task1.task1.squareSequenceDigit(27))
    }

    @Test
    @Tag("5")
    fun fibSequenceDigit() {
        assertEquals(1, lesson4.task1.task1.fibSequenceDigit(1))
        assertEquals(1, lesson4.task1.task1.fibSequenceDigit(2))
        assertEquals(3, lesson4.task1.task1.fibSequenceDigit(4))
        assertEquals(2, lesson4.task1.task1.fibSequenceDigit(9))
        assertEquals(5, lesson4.task1.task1.fibSequenceDigit(14))
        assertEquals(2, lesson4.task1.task1.fibSequenceDigit(20))
    }
}