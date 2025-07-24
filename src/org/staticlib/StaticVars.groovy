package org.staticlib

class StaticVars {
    static final List<String> SUPPORTED_APP_TYPES = ['springboot', 'nginx', 'php']
    static final Map<String, Integer> DEFAULT_PORTS = [
        springboot: 8080,
        nginx     : 80,
        php       : 9000
    ]

    static String getDefaultPort(String appType) {
        return DEFAULT_PORTS.get(appType?.toLowerCase(), 'UNKNOWN')
    }
}
