/**
 * Precompiled [dokka-conventions.gradle.kts][Dokka_conventions_gradle] script plugin.
 *
 * @see Dokka_conventions_gradle
 */
public
class DokkaConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Dokka_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
