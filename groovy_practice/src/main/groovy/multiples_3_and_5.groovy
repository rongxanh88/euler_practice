class Multi3and5 {
  Integer limit;

  Multi3and5(limit) {
    this.limit = limit
  }

  def multiples() {
    def multiples = [] as List
    (1..<limit).each { n ->
      if (n % 3 == 0 || n % 5 == 0) {
        multiples.add(n)
      }
    }
    return multiples
  }

  def sumOfMultiples() {
    def numbers = this.multiples()
    return numbers.inject(0) { result, num -> result + num}
  }
}