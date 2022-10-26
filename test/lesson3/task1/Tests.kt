package lesson3.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.math.PI

class Tests {
    @Test
    @Tag("Example")
    fun factorial() {
        assertEquals(1.0, lesson3.factorial(0), 1e-5)
        assertEquals(1.0, lesson3.factorial(1), 1e-5)
        assertEquals(6.0, lesson3.factorial(3), 1e-5)
        assertEquals(120.0, lesson3.factorial(5), 1e-5)
        assertEquals(3628800.0, lesson3.factorial(10), 1e-5)
        assertEquals(2.43290200817664E18, lesson3.factorial(20), 1E10)
    }

    @Test
    @Tag("Example")
    fun isPrime() {
        assertFalse(lesson3.isPrime(1))
        assertTrue(lesson3.isPrime(2))
        assertTrue(lesson3.isPrime(5))
        assertTrue(lesson3.isPrime(11))
        assertFalse(lesson3.isPrime(4))
        assertFalse(lesson3.isPrime(9))
        assertFalse(lesson3.isPrime(15))
        var count = 0
        for (n in 2..7919) {
            if (lesson3.isPrime(n)) {
                count++
            }
        }
        assertEquals(1000, count)
        count = 0
        for (n in 2..1000000) {
            if (lesson3.isPrime(n)) {
                count++
            }
        }
        assertEquals(78498, count)
    }

    @Test
    @Tag("Example")
    fun isPerfect() {
        assertTrue(lesson3.isPerfect(6))
        assertTrue(lesson3.isPerfect(28))
        assertFalse(lesson3.isPerfect(100))
    }

    @Test
    @Tag("Example")
    fun digitCountInNumber() {
        assertEquals(1, lesson3.digitCountInNumber(0, 0))
        assertEquals(1, lesson3.digitCountInNumber(7, 7))
        assertEquals(0, lesson3.digitCountInNumber(21, 3))
        assertEquals(1, lesson3.digitCountInNumber(510, 5))
        assertEquals(3, lesson3.digitCountInNumber(4784041, 4))
        assertEquals(4, lesson3.digitCountInNumber(5373393, 3))
    }

    @Test
    @Tag("2")
    fun digitNumber() {
        assertEquals(1, lesson3.digitNumber(0))
        assertEquals(1, lesson3.digitNumber(7))
        assertEquals(2, lesson3.digitNumber(10))
        assertEquals(2, lesson3.digitNumber(99))
        assertEquals(3, lesson3.digitNumber(123))
        assertEquals(10, lesson3.digitNumber(Int.MAX_VALUE))
    }

    @Test
    @Tag("2")
    fun fib() {
        assertEquals(1, lesson3.fib(1))
        assertEquals(1, lesson3.fib(2))
        assertEquals(2, lesson3.fib(3))
        assertEquals(5, lesson3.fib(5))
        assertEquals(21, lesson3.fib(8))
        assertEquals(102334155, lesson3.fib(40))
        assertEquals(1134903170, lesson3.fib(45))
        assertEquals(1836311903, lesson3.fib(46))
        // Just to calculate it
        lesson3.fib(50)
    }

    @Test
    @Tag("2")
    fun minDivisor() {
        assertEquals(2, lesson3.minDivisor(2))
        assertEquals(3, lesson3.minDivisor(75))
        assertEquals(5, lesson3.minDivisor(75 / 3))
        assertEquals(97, lesson3.minDivisor(97))
        assertEquals(7, lesson3.minDivisor(49))
        assertEquals(17, lesson3.minDivisor(8653))
        assertEquals(2124679, lesson3.minDivisor(2124679))
        assertEquals(1073676287, lesson3.minDivisor(1073676287))
        assertEquals(Int.MAX_VALUE, lesson3.minDivisor(Int.MAX_VALUE))
    }

    @Test
    @Tag("2")
    fun maxDivisor() {
        assertEquals(1, lesson3.maxDivisor(17))
        assertEquals(12, lesson3.maxDivisor(24))
        assertEquals(59, lesson3.maxDivisor(177))
        assertEquals(17, lesson3.maxDivisor(34))
        assertEquals(7, lesson3.maxDivisor(49))
        assertEquals(509, lesson3.maxDivisor(8653))
        assertEquals(1, lesson3.maxDivisor(2124679))
        assertEquals(1, lesson3.maxDivisor(1073676287))
        assertEquals(1, lesson3.maxDivisor(Int.MAX_VALUE))
    }

    @Test
    @Tag("2")
    fun collatzSteps() {
        assertEquals(0, lesson3.collatzSteps(1))
        assertEquals(1, lesson3.collatzSteps(2))
        assertEquals(7, lesson3.collatzSteps(3))
        assertEquals(5, lesson3.collatzSteps(5))
        assertEquals(6, lesson3.collatzSteps(10))
        assertEquals(7, lesson3.collatzSteps(20))
        assertEquals(6, lesson3.collatzSteps(64))
        assertEquals(25, lesson3.collatzSteps(100))
        assertEquals(7, lesson3.collatzSteps(128))
        assertEquals(111, lesson3.collatzSteps(1000))
        assertEquals(128, lesson3.collatzSteps(100000))
    }

    @Test
    @Tag("3")
    fun lcm() {
        assertEquals(13, lesson3.lcm(13, 13))
        assertEquals(8, lesson3.lcm(2, 8))
        assertEquals(24, lesson3.lcm(6, 8))
        assertEquals(975, lesson3.lcm(39, 75))
        assertEquals(13384091, lesson3.lcm(1357, 9863))
        assertEquals(1339310349, lesson3.lcm(13579, 98631))
        assertEquals(2089830349, lesson3.lcm(23579, 88631))
        assertEquals(2022222222, lesson3.lcm(2, 1011111111))
        assertEquals(2022222222, lesson3.lcm(1011111111, 2))
    }

    @Test
    @Tag("3")
    fun isCoPrime() {
        assertTrue(lesson3.isCoPrime(25, 49))
        assertFalse(lesson3.isCoPrime(6, 8))
        assertTrue(lesson3.isCoPrime(17, 97))
        assertFalse(lesson3.isCoPrime(37, 111))
        assertTrue(lesson3.isCoPrime(1234567890, 908765431))
        assertTrue(lesson3.isCoPrime(2109876543, 1234567891))
    }

    @Test
    @Tag("3")
    fun revert() {
        assertEquals(87431, lesson3.revert(13478))
        assertEquals(0, lesson3.revert(0))
        assertEquals(3, lesson3.revert(3))
        assertEquals(111, lesson3.revert(111))
        assertEquals(17571, lesson3.revert(17571))
        assertEquals(123456789, lesson3.revert(987654321))
    }

    @Test
    @Tag("3")
    fun isPalindrome() {
        assertTrue(lesson3.isPalindrome(3))
        assertFalse(lesson3.isPalindrome(3653))
        assertTrue(lesson3.isPalindrome(15751))
        assertTrue(lesson3.isPalindrome(24688642))
        assertFalse(lesson3.isPalindrome(Int.MAX_VALUE))
        assertTrue(lesson3.isPalindrome(2147447412))
    }

    @Test
    @Tag("3")
    fun hasDifferentDigits() {
        assertTrue(lesson3.hasDifferentDigits(323))
        assertTrue(lesson3.hasDifferentDigits(54))
        assertTrue(lesson3.hasDifferentDigits(222266666))
        assertFalse(lesson3.hasDifferentDigits(0))
        assertFalse(lesson3.hasDifferentDigits(777))
        assertTrue(lesson3.hasDifferentDigits(31122))
    }

    @Test
    @Tag("4")
    fun sin() {
        assertEquals(0.0, lesson3.sin(0.0, 1e-5), 1e-5)
        assertEquals(1.0, lesson3.sin(PI / 2.0, 1e-5), 1e-5)
        assertEquals(0.0, lesson3.sin(PI, 1e-5), 1e-5)
        assertEquals(-1.0, lesson3.sin(3.0 * PI / 2.0, 1e-5), 1e-5)
        assertEquals(0.0, lesson3.sin(100 * PI, 1e-5), 1e-5)
        assertNotEquals(kotlin.math.sin(1.0), lesson3.sin(1.0, 1.0))
        assertNotEquals(kotlin.math.sin(-0.5), lesson3.sin(-0.5, 1.0))
    }

    @Test
    @Tag("4")
    fun cos() {
        assertEquals(1.0, lesson3.cos(0.0, 1e-5), 1e-5)
        assertEquals(0.0, lesson3.cos(PI / 2.0, 1e-5), 1e-5)
        assertEquals(-1.0, lesson3.cos(PI, 1e-5), 1e-5)
        assertEquals(0.0, lesson3.cos(3.0 * PI / 2.0, 1e-5), 1e-5)
        assertEquals(1.0, lesson3.cos(100 * PI, 1e-5), 1e-5)
        assertNotEquals(kotlin.math.cos(1.0), lesson3.cos(1.0, 1.0))
        assertNotEquals(kotlin.math.cos(0.5), lesson3.cos(-0.5, 1.0))
    }

    @Test
    @Tag("4")
    fun squareSequenceDigit() {
        assertEquals(1, lesson3.squareSequenceDigit(1))
        assertEquals(4, lesson3.squareSequenceDigit(2))
        assertEquals(5, lesson3.squareSequenceDigit(7))
        assertEquals(6, lesson3.squareSequenceDigit(12))
        assertEquals(0, lesson3.squareSequenceDigit(17))
        assertEquals(9, lesson3.squareSequenceDigit(27))
    }

    @Test
    @Tag("5")
    fun fibSequenceDigit() {
        assertEquals(1, lesson3.fibSequenceDigit(1))
        assertEquals(1, lesson3.fibSequenceDigit(2))
        assertEquals(3, lesson3.fibSequenceDigit(4))
        assertEquals(2, lesson3.fibSequenceDigit(9))
        assertEquals(5, lesson3.fibSequenceDigit(14))
        assertEquals(2, lesson3.fibSequenceDigit(20))
    }
}