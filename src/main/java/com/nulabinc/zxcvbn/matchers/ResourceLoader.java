package com.nulabinc.zxcvbn.matchers;

import java.io.InputStream;

class ResourceLoader {

    InputStream getInputStream(String path) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            InputStream resource = classLoader.getResourceAsStream(path);
            if (resource != null) {
                return resource;
            }
        }
        return ClassLoader.getSystemResourceAsStream(path);
    }
}
