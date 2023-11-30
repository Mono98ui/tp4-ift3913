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
        assertEquals(0.93,MainWindow.convert("US Dollar","Euro",listCurr,1.0));
        assertEquals(55800.0,MainWindow.convert("US Dollar","Euro",listCurr,60000.0));
        assertEquals(930000.0,MainWindow.convert("US Dollar","Euro",listCurr,1000000.0));
        assertEquals(0.0,MainWindow.convert("US Dollar","Euro",listCurr,-1.0));
        assertEquals(0.0,MainWindow.convert("US Dollar","Euro",listCurr,-1000001.0));
    }

    @Test
    void assertConvertNoCurr() {
        assertEquals(0.0,MainWindow.convert("US Dollar","TEST",listCurr,10.0));
    }
}