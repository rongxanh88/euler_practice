import spock.lang.*

class MultiOf3and5Test extends Specification {

  def limit = 10
  Multi3and5 calculator = new Multi3and5(limit)

  def "find all multiples of 3 and 5 below 10"() {
    when:
    def result = calculator.multiples()

    then:
    result == [3, 5, 6, 9]
  }

  def "return sum of all multiples below 10"() {
    when:
    def result = calculator.sumOfMultiples()
    
    then:
    result == 23
  }

  def "return sum of all multiples below 1000"() {
    def limit = 1000
    Multi3and5 calculator1 = new Multi3and5(limit)

    when:
    def result = calculator1.sumOfMultiples()

    then:
    result == 233168
  }
}