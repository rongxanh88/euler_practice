import spock.lang.*


class MultiOf3and5Test extends Specification {
  
  def "find all multiples of 3 and 5 below 10"() {
    def limit = 10
    Multi3and5 calculator = new Multi3and5(limit)

    when:
    def result = calculator.multiples()

    then:
    result == [3, 5, 6, 9]
  }
}