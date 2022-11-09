@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var count = 1
    var number = abs(n)
    while (number > 9) {
        number /= 10
        count++
    }
    return count
}
/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int {
    var a = 1
    var b = 1
    var s = 0
    for (i in 1..n) {
        a = b
        b = s
        s = a + b
    }
    return s
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int {
    for (i in 2..sqrt(n.toDouble()).toInt() + 1) {
        if (n % i == 0) {
            return i
        }
    }
    return n
}


/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int = n / minDivisor(n)

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int {
    var n = x
    var i = 0
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
        } else if (n % 2 == 1) {
            n = 3 * n + 1
        }
        i++
    }
    return i
}

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int {
    var a = m
    var b = n
    while (a != b) {
        if (a > b)
            a -= b
        else
            b -= a
    }
    return n * m / a
}

/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean {
    var a = m
    var b = n
    while (b != 0) {
        val c = a
        a = b
        b = c % b
    }
    return a == 1
}


/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
    var a = n
    var b = 0
    while (a >= 1) {
        b = b * 10 + a % 10
        a /= 10
    }
    return b
}

/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean = revert(n) == n

/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean {
    val n = abs(n)
    if (n == 0)
        return false
    var d = 1
    var x = 0
    while (d < n) {
        d *= 10
        x++
    }
    if (x > 10)
        x = 10
    val k = n % 10
    d = 10
    for (i in 1 until x) {
        if ((n / d) % 10 != k)
            return true
        d *= 10
    }
    return false
}

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double {
    fun factorial(x: Int): Double {
        var i = x
        var a = 1.0
        while (i != 0) {
            a *= i
            i--
        }
        return a
    }

    var x = x
    while (x > 2*PI)
        x -= 2 * PI
    while (x < -2*PI)
        x += 2 * PI
    var c = 0.0
    var s = 1
    var d = x.pow(s) / factorial(s)
    var z = 1
    while (abs(d) >= eps) {
        c += z * d
        z = -z
        s += 2
        d = x.pow(s) / factorial(s)
    }
    return c
}

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double {
    fun factorial(x: Int): Double {
        var i = x
        var a = 1.0
        while (i != 0) {
            a *= i
            i--
        }
        return a
    }

    var x = x
    while (x > 2 * PI)
        x -= 2 * PI
    while (x < -2 * PI)
        x += 2 * PI
    var c = 0.0
    var s = 0
    var d = x.pow(s) / factorial(s)
    var z = 1
    while (d >= eps) {
        c += z * d
        z = -z
        s += 2
        d = x.pow(s) / factorial(s)
    }
    return c
}

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int {
    fun Int.pow(x: Int): Long {
        var y = 1L
        for (i in 1..x)
            y *= this
        return y
    }
    var k = 1
    var m = n
    var a = k * k.toLong()
    var s = 1
    while (m > 0) {
        if (s == 0) {
            k++
            a = k * k.toLong()
            s = 1
            while (10.pow(s) <= a)
                s++
        }
        m--
        s--
    }
    return (a / 10.pow(s) % 10).toInt()
}


/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int {
    fun fib(n: Int): Long {
        var a = 1L
        var b = 1L
        var s = 0L
        for (i in 1..n) {
            a = b
            b = s
            s = a + b
        }
        return s
    }

    fun Int.pow(x: Int): Long {
        var y = 1L
        for (i in 1..x)
            y *= this
        return y
    }

    var k = 1
    var m = n
    var a = fib(k)
    var s = 1
    while (m > 0) {
        if (s == 0) {
            k++
            a = fib(k)
            s = 1
            while (10.pow(s) <= a)
                s++
        }
        m--
        s--
    }
    return (a / 10.pow(s) % 10).toInt()
}
