package testClasses

/**
 * @author v.krylov
 */


class ExampleSimpleTestClass {
    fun beforeTest() {
        "before".addLog()
    }

    fun afterTest() {
        "after".addLog()
    }
}
