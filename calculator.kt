
fun main() {
    println("계산기입니다.")

    do {
        println("두 개의 숫자와 연산기호를 입력하세요.")

        print("1번 숫자를 입력하세요: ")
        val num1 = readLine()?.toDoubleOrNull()

        print("연산기호를 입력하세요 (+, -, *, /, %) 혹은 종료하려면 x를 입력하세요: ")
        val operator = readLine()

        print("2번 숫자를 입력하세요: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (operator == "x") {
            println("프로그램을 종료합니다.")
            return
        }

        if (num1 == null || num2 == null) {
            println("오류: 올바른 숫자를 입력하세요.")
            continue
        }

        val result = when (operator) {
            "+" -> {
                val res = num1 + num2
                println("결과는 $res 입니다.")
                res
            }
            "-" -> {
                val res = num1 - num2
                println("결과는 $res 입니다.")
                res
            }
            "*" -> {
                val res = num1 * num2
                println("결과는 $res 입니다.")
                res
            }
            "/" -> {
                if (num2 == 0.0) {
                    println("0으로 나눌 수 없습니다.")
                    continue
                }
                val res = num1 / num2
                println("결과는 $res 입니다.")
                res
            }
            "%" -> {
                val res = num1 % num2
                println("결과는 $res 입니다.")
                res
            }
            else -> {
                println("오류: 올바른 연산기호를 입력하세요.")
                continue
            }
        }

        print("더 계산하시겠습니까? (y/n): ")
    } while (readLine()?.uppercase() == "Y")

    println("프로그램을 종료합니다.")
}