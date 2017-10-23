class PrimeNumber {
  static largestFactor(number) {
    def limit = 10000
    def primeNumbers = [] as List

    (3..limit).each { n ->
      if (primeCheck(n)) {
        primeNumbers.add(0, n)
      }
    }

    for (prime in primeNumbers) {
      if (number % prime == 0) {
        return prime
      }
    }

    return 0
  }

  static primeCheck(num) {
    def maxFactor = Math.round(num/2)
    def isPrime = true
    (2..maxFactor).each { i ->
      if (num % i == 0) {
        isPrime = false
      }
    }
    return isPrime
  }
}