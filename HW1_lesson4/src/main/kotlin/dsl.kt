/**
 * @author v.krylov
 */


fun <T : Any> testWrapper(initializer: TestWrapper<T>.() -> Unit): TestWrapper<T> {
    val testWrapper = TestWrapper<T>()
    testWrapper.initializer()
    return testWrapper
}
