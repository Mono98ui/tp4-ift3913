package test;

import currencyConverter.Currency;
import currencyConverter.MainWindow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainWindowTest {


    ArrayList<Currency> listCurr;

    @BeforeEach
    void setUp() {
        listCurr = Currency.init();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void assertConvert() {
        //MainWindow.convert();
    }

    @Test
    void assertConvertNoCurr() {
        //HashMap<String, Double> exVal = curr.getExchangeValues();
        //assertNull(Currency.convert(-1.0,exVal.get("LOL")));
    }
}