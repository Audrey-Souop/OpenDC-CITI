package org.opendc.web.ui.deployment;
@io.quarkus.Generated("Quarkus annotation processor")
public final class OpenDCUiConfig$$accessor {
    private OpenDCUiConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static boolean get_include(Object __instance) {
        return ((OpenDCUiConfig)__instance).include;
    }
    @SuppressWarnings("unchecked")
    public static void set_include(Object __instance, boolean include) {
        ((OpenDCUiConfig)__instance).include = include;
    }
    @SuppressWarnings("unchecked")
    public static Object get_apiBaseUrl(Object __instance) {
        return ((OpenDCUiConfig)__instance).apiBaseUrl;
    }
    @SuppressWarnings("unchecked")
    public static void set_apiBaseUrl(Object __instance, Object apiBaseUrl) {
        ((OpenDCUiConfig)__instance).apiBaseUrl = (String)apiBaseUrl;
    }
    @SuppressWarnings("unchecked")
    public static Object get_auth(Object __instance) {
        return ((OpenDCUiConfig)__instance).auth;
    }
    @SuppressWarnings("unchecked")
    public static void set_auth(Object __instance, Object auth) {
        ((OpenDCUiConfig)__instance).auth = (AuthConfiguration)auth;
    }
    @SuppressWarnings("unchecked")
    public static Object get_sentryDsn(Object __instance) {
        return ((OpenDCUiConfig)__instance).sentryDsn;
    }
    @SuppressWarnings("unchecked")
    public static void set_sentryDsn(Object __instance, Object sentryDsn) {
        ((OpenDCUiConfig)__instance).sentryDsn = (java.util.Optional<String>)sentryDsn;
    }
}
