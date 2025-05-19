package org.opendc.web.ui.deployment;
@io.quarkus.Generated("Quarkus annotation processor")
public final class AuthConfiguration$$accessor {
    private AuthConfiguration$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_domain(Object __instance) {
        return ((AuthConfiguration)__instance).domain;
    }
    @SuppressWarnings("unchecked")
    public static void set_domain(Object __instance, Object domain) {
        ((AuthConfiguration)__instance).domain = (java.util.Optional<String>)domain;
    }
    @SuppressWarnings("unchecked")
    public static Object get_clientId(Object __instance) {
        return ((AuthConfiguration)__instance).clientId;
    }
    @SuppressWarnings("unchecked")
    public static void set_clientId(Object __instance, Object clientId) {
        ((AuthConfiguration)__instance).clientId = (java.util.Optional<String>)clientId;
    }
    @SuppressWarnings("unchecked")
    public static Object get_audience(Object __instance) {
        return ((AuthConfiguration)__instance).audience;
    }
    @SuppressWarnings("unchecked")
    public static void set_audience(Object __instance, Object audience) {
        ((AuthConfiguration)__instance).audience = (java.util.Optional<String>)audience;
    }
}
