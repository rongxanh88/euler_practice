import spock.lang.*

class PrimeNumberTest extends Specification {

  def "find largest prime factor for 13195"() {
    def number = 13195

    when:
    def result = PrimeNumber.largestFactor(number)

    then:
    result == 29
  }

  def "find largest prime factor for 600851475143"() {
    def number = 600851475143

    when:
    def result = PrimeNumber.largestFactor(number)

    then:
    //change
    result == 0
  }
}