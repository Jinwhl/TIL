// 짝수 합 누적 Case 1
fun main(){
    var sum = 0 // sum = 0 으로 초기화
    
    for (i in 1..100){
        if (i % 2 != 0) continue // 홀수인 case에 대해서 아무런 동작하지 않고 아래 실행
        sum += i // 짝수일 경우 i 값을 sum 에 누적
    }
    
    println("sum : $sum")
}

// 짝수 합 누적 Case 2
fun main(){
    var sum = 0
    
    for (i in 2..100 step 2){ // i = 2, 4, 6 ,..., 100
        sum += i
    }
    
    println("sum : $sum")
}

// 홀수만큼 별 쌓기
fun main(){
    var n = 15
    
    for (i in 1..n){
        if (i % 2 == 0) continue // 짝수인 case에 대해서 아무런 동작하지 않고 아래 실행
        for (j in 1..i){
            print('*')
        }
        println()
    }
}
