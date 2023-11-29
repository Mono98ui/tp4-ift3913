package test;

import currencyConverter.Currency;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {


    Currency curr;
    Currency nCurr;

    @BeforeEach
    void setUp() {
        curr =  new Currency("US Dollar", "USD");
        curr.defaultValues();
        //Nous avons trois classe:
        //[1-1 000 000], <1, >1 000 000\
        //On repete c jeux de text pour tout les currency
        //[1, 60 000, 1000000, -1, 1 000 001]
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void assertConvert() {
        HashMap<String, Double> exVal = curr.getExchangeValues();

        assertEquals(0.93, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(55800.0, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(930000.0, Currency.convert(1000000.0,exVal.get("EUR")));

        assertNull(Currency.convert(-1.0,exVal.get("EUR")));
        assertNull(Currency.convert( 1000001.0,exVal.get("EUR")));

    }
}