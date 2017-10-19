import spock.lang.*

class FibonacciSpec extends Specification {

  def "first ten terms of fibonacci sequence"() {
    when:
    def terms = Fibonacci.firstTerms(10)
    
    then:
    terms == [1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
  }

  def "sums first ten terms of fibonacci sequence"() {
    when:
    def sum = Fibonacci.sumTerms(10)

    then:
    sum == 231
  }
}