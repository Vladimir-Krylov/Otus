/**
 * @author v.krylov
 */


interface TestRunner<T> {
    fun runTest(steps: T, test: () -> Unit)
}

