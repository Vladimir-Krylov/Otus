/**
 * @author v.krylov
 */


import kotlin.reflect.KFunction
import kotlin.reflect.full.declaredMemberFunctions

private const val BEFORE = "before"
private const val AFTER = "after"

class TestWrapper<T : Any> : TestRunner<T> {
    private lateinit var memberFunctions: Collection<KFunction<*>>
    private lateinit var steps: T

    override fun runTest(steps: T, test: () -> Unit) {
        this.steps = steps
        memberFunctions = steps::class.declaredMemberFunctions

        runAllBefore()
        test()
        runAllAfter()
    }

    private fun runAllBefore() {
        memberFunctions.filter { it.name.startsWith(BEFORE) }.forEach {
            println("[$BEFORE] ${it.name}")
            it.call(steps)
        }
    }

    private fun runAllAfter() {
        memberFunctions.filter { it.name.startsWith(AFTER) }.forEach {
            println("[$AFTER] ${it.name}")
            it.call(steps)
        }
    }
}
