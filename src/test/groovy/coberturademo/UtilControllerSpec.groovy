package coberturademo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UtilController)
class UtilControllerSpec extends Specification {

     void "test index action"() {
        when:
        controller.index()

        then:
        response.text == "Hello"
    }

    void "test test action"() {
        when:
        controller.index1()

        then:
        response.text == "Hey"
    }
}
