fun main(args: Array<String>) {
    fun zadacha4(string: String): Float {
        var n1 = ""
        var n2 = ""
        var op = ' '
        var isN1 = true

        for (char in string.replace(" ", "")) {
            if (char.isDigit() || char == '.') {
                if (isN1) {
                    n1 += char
                } else {
                    n2 += char
                }
            } else if (char in setOf('+', '-', '*', '/')) {
                op = char
                isN1 = false
            }
        }

        val num1 = n1.toFloat()
        val num2 = n2.toFloat()

        return when (op) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> 0.0f
        }
    }
    println( zadacha4(readln()))
}