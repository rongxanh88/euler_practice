class Fibonacci {
  static sumTerms(limit) {
    def terms = termsLessThan(limit)
    return terms.inject(0) { result, num -> result + num }
  }

  static termsLessThan(limit) {
    Map fibMap = [:]
    def terms = [] as List
    def n = 2
    
    while (true) {
      def term = fib(n, fibMap)

      if (term > limit) {
        break
      } else if (term % 2 == 0) {
        terms.add(term)
      }
      n++
    }
   return terms 
  }

  static fib(num, fibMap) {
    if (num == 0 || num == 1) {
      return num
    }

    if (fibMap[num]) {
      return fibMap[num]
    } else {
      fibMap[num] = fib(num - 1, fibMap) + fib(num - 2, fibMap)
    }
    return fibMap[num]
  }
}