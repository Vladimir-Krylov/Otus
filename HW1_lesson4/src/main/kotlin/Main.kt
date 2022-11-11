import testClasses.*

/**
 * @author v.krylov
 */


fun main() {
    testWrapper {
        runTest(ExampleSimpleTestClass()) {
            println("----")
            println("       test running")
            println("----")
        }

        println("====")
        println("   ====")
        println("====")

        runTest(ExampleDoubleTestClass()) {
            println("----")
            println("       test running")
            println("----")
        }
    }
}

