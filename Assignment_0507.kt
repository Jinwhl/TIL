// 짝수 합 누적 Case 1
fun main(){
    var sum = 0 // sum = 0 으로 초기화
    
    for (i in 1..100){
        if (i % 2 != 0) continue // i = 홀수 case는 생략하고 아래 실행
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
        if (i % 2 == 0) continue // i = 짝수 case는 생략하고 아래 실행
        for (j in 1..i){
            print('*')
        }
        println()
    }
}

/* i = 홀수 case 또는 짝수 case를 생략하지 않고
 * for (i in 1..100) {if (i % 2 == 0) {sum += i}} 처럼 작성할수도 있지만
 * continue 사용해보고 싶어서 위와 같이 작성했음
 * 주석의 중요함을 느낌.
 * */
