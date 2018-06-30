package com.example.jokesProvider;

import org.junit.Test;

public class JokesProviderTests {
    @Test
    public void test() {
        JokesProvider jokesProvider = new JokesProvider();
        assert jokesProvider.tellAJoke().length() != 0;
    }
}