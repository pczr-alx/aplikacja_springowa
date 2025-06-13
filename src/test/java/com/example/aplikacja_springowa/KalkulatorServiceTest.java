package com.example.aplikacja_springowa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class KalkulatorServiceTest {
    private KalkulatorService kalkulatorService;

@BeforeEach
    void setUp() {
        kalkulatorService = new KalkulatorService();
    }

    @Test
    void obliczPlus() {
        assertEquals(5, kalkulatorService.oblicz(2, 3, "+"));
    }

    @Test
    void obliczMinus() {
        assertEquals(15, kalkulatorService.oblicz(20, 5, "-"));
    }

    @Test
    void obliczMnozenia() {
        assertEquals(12, kalkulatorService.oblicz(3, 4, "*"));
    }

    @Test
    void obliczDzielenie() {
        assertEquals(11, kalkulatorService.oblicz(33, 3, "/"));
    }

}



