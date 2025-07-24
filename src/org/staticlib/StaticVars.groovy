package org.staticlib

class StaticVars {
    static final List<String> APP_TYPES = ['springboot', 'nginx', 'php']
    static final Map<String, Integer> DEFAULT_PORTS = [
        springboot: 8080,
        nginx     : 80,
        php       : 9000
    ]

    static List<String> getAppTypes() {
        return APP_TYPES
    }

    static String getDefaultPort(String appType) {
        return DEFAULT_PORTS.get(appType?.toLowerCase(), 'UNKNOWN')
    }
}
