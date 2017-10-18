class Multi3and5 {
  Integer limit;

  Multi3and5(limit) {
    this.limit = limit
  }

  def multiples() {
    def multiples = [] as List
    for(int n = 1; n < limit; n++) {
      if (n % 3 == 0 || n % 5 == 0) {
        multiples.add(n)
      }
    }
    return multiples
  }
}