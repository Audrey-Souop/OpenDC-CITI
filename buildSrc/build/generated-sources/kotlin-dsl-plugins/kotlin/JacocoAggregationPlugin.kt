/**
 * Precompiled [jacoco-aggregation.gradle.kts][Jacoco_aggregation_gradle] script plugin.
 *
 * @see Jacoco_aggregation_gradle
 */
public
class JacocoAggregationPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Jacoco_aggregation_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
