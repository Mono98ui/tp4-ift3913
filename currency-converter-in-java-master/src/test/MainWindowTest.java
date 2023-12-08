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
    ArrayList<Currency> listCurrVide;

    @BeforeEach
    void setUp() {
        listCurr = Currency.init();
        listCurrVide = new ArrayList<Currency>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void assertConvert() {
        assertEquals(Math.round(1.0 * 0.93 * 100d) / 100d,MainWindow.convert("US Dollar","Euro",listCurr,1.0));
        assertEquals(Math.round(60000.0 * 0.93 * 100d) / 100d,MainWindow.convert("US Dollar","Euro",listCurr,60000.0));
        assertEquals(Math.round(1000000.0 * 0.93 * 100d) / 100d,MainWindow.convert("US Dollar","Euro",listCurr,1000000.0));
        assertEquals(0.0,MainWindow.convert("US Dollar","Euro",listCurr,-1.0));
        assertEquals(0.0,MainWindow.convert("US Dollar","Euro",listCurr,-1000001.0));

        assertEquals(Math.round(1.0 * 1.0 * 100d) / 100d,MainWindow.convert("Euro","Euro",listCurr,1.0));
        assertEquals(Math.round(60000.0 * 1.0 * 100d) / 100d,MainWindow.convert("Euro","Euro",listCurr,60000.0));
        assertEquals(Math.round(1000000.0 * 1.0 * 100d) / 100d,MainWindow.convert("Euro","Euro",listCurr,1000000.0));
        assertEquals(0.0,MainWindow.convert("Euro","Euro",listCurr,-1.0));
        assertEquals(0.0,MainWindow.convert("Euro","Euro",listCurr,-1000001.0));


        assertEquals(Math.round(1.0 * 0.93 * 100d) / 100d,MainWindow.convert("Swiss Franc","Euro",listCurr,1.0));
        assertEquals(Math.round(60000.0 * 0.93 * 100d) / 100d,MainWindow.convert("Swiss Franc","Euro",listCurr,60000.0));
        assertEquals(Math.round(1000000.0 * 0.93 * 100d) / 100d,MainWindow.convert("Swiss Franc","Euro",listCurr,1000000.0));
        assertEquals(0.0,MainWindow.convert("Swiss Franc","Euro",listCurr,-1.0));
        assertEquals(0.0,MainWindow.convert("Swiss Franc","Euro",listCurr,-1000001.0));

        assertEquals(Math.round(1.0 * 0.68  * 100d) / 100d,MainWindow.convert("Canadian Dollar","Euro",listCurr,1.0));
        assertEquals(Math.round(60000.0 * 0.68  * 100d) / 100d,MainWindow.convert("Canadian Dollar","Euro",listCurr,60000.0));
        assertEquals(Math.round(1000000.0 * 0.68  * 100d) / 100d,MainWindow.convert("Canadian Dollar","Euro",listCurr,1000000.0));
        assertEquals(0.0,MainWindow.convert("Canadian Dollar","Euro",listCurr,-1.0));
        assertEquals(0.0,MainWindow.convert("Canadian Dollar","Euro",listCurr,-1000001.0));

        assertEquals(Math.round(1.0 * 0.61  * 100d) / 100d,MainWindow.convert("Australian Dollar","Euro",listCurr,1.0));
        assertEquals(Math.round(60000.0 * 0.61 * 100d) / 100d,MainWindow.convert("Australian Dollar","Euro",listCurr,60000.0));
        assertEquals(Math.round(1000000.0 * 0.61 * 100d) / 100d,MainWindow.convert("Australian Dollar","Euro",listCurr,1000000.0));
        assertEquals(0.0,MainWindow.convert("Australian Dollar","Euro",listCurr,-1.0));
        assertEquals(0.0,MainWindow.convert("Australian Dollar","Euro",listCurr,-1000001.0));


    }
    
    @Test
    void assertWhiteBoxA(){
        assertEquals(0.93,MainWindow.convert("US Dollar","Euro",listCurr,1.0));
        assertEquals(0.0,MainWindow.convert("US Dollar",null,listCurr,1.0));
        assertEquals(0.0,MainWindow.convert("US Dollar","Euro",listCurrVide,1.0));
        assertEquals(0.0,MainWindow.convert(null,"Euro",listCurr,1.0));
    }

    @Test
    void assertWhiteBoxB(){
        assertEquals(0.0,MainWindow.convert("US Dollar",null,listCurrVide,1.0));
        assertEquals(0.0,MainWindow.convert("US Dollar","TEST",listCurr,1.0));
        assertEquals(0.93,MainWindow.convert("US Dollar","Euro",listCurr,1.0));

    }
}