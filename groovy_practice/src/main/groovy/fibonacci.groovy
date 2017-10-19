class Fibonacci {
  static sumTerms(numTerms) {
    def terms = firstTerms(numTerms)
    return terms.inject(0) { result, num -> result + num }
  }

  static firstTerms(limit) {
    def terms = [] as List
    (1..limit).each { n ->
      terms.add(fib(n + 1))
    }
   return terms 
  }

  static fib(num) {
    if (num == 0 || num == 1) {
      return num
    }

    return fib(num - 1) + fib(num - 2)
  }
}