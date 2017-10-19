import spock.lang.*

class FibonacciSpec extends Specification {

  def "first ten terms of fibonacci sequence"() {
    when:
    def terms = Fibonacci.termsLessThan(35)
    
    then:
    terms == [2, 8, 34]
  }

  def "sums even values from first ten terms of fibonacci sequence"() {
    when:
    def sum = Fibonacci.sumTerms(35)

    then:
    sum == 44
  }

  def "sums first 4 million terms of fibonacci sequence"() {
    when:
    def sum = Fibonacci.sumTerms(4000000)

    then:
    sum == 4613732
  }
}