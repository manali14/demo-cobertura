package demo

class SomeHelperSpec extends spock.lang.Specification {

    void 'test something'() {
        expect:
        new SomeHelper().methodOne() == 2112
    }

void 'test 2nd method'(){
expect:
new SomeHelper().methodTwo() == 42
}
}
