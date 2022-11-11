package testClasses

/**
 * @author v.krylov
 */


class ExampleDoubleTestClass {
    fun beforeTestOne() {
        "before".addLog()
    }

    fun beforeTestTwo() {
        "before".addLog()
    }

    fun afterTestOne() {
        "after".addLog()
    }

    fun afterTestTwo() {
        "after".addLog()
    }
}
