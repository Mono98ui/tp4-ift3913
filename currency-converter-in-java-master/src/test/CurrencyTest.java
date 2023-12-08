package test;

import currencyConverter.Currency;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {


    Currency currUSD;
    Currency currEuro;
    Currency currGBP;
    Currency currCHF;

    Currency currCAD;

    Currency currAUD;
    


    @BeforeEach
    void setUp() {
        currUSD =  new Currency("US Dollar", "USD");
        currUSD.defaultValues();

        currEuro =  new Currency("Euro", "Euro");
        currEuro.defaultValues();

        currGBP =  new Currency("British Pound", "GBP");
        currGBP.defaultValues();

        currCHF =  new Currency("Swiss Franc", "CHF");
        currCHF.defaultValues();

        currCAD =  new Currency("Canadian Dollar", "CAD");
        currCAD.defaultValues();

        currAUD =  new Currency("Australian Dollar", "AUD");
        currAUD.defaultValues();
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
        HashMap<String, Double> exVal = currUSD.getExchangeValues();

        assertEquals(Math.round(1.0 * 0.93 * 100d) / 100d, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(Math.round(60000.0 * 0.93 * 100d) / 100d, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(Math.round(1000000.0 * 0.93 * 100d) / 100d, Currency.convert(1000000.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert(-1.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert( 1000001.0,exVal.get("EUR")));

        exVal = currEuro.getExchangeValues();

        assertEquals(Math.round(1.0 * 1.0 * 100d) / 100d, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(Math.round(60000.0 * 1.0 * 100d) / 100d, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(Math.round(1000000.0 * 1.0 * 100d) / 100d, Currency.convert(1000000.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert(-1.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert( 1000001.0,exVal.get("EUR")));

        exVal = currGBP.getExchangeValues();

        assertEquals(Math.round(1.0 * 1.41 * 100d) / 100d, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(Math.round(60000.0 * 1.41 * 100d) / 100d, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(Math.round(1000000.0 * 1.41 * 100d) / 100d, Currency.convert(1000000.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert(-1.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert( 1000001.0,exVal.get("EUR")));

        exVal = currCHF.getExchangeValues();

        assertEquals(Math.round(1.0 * 0.93 * 100d) / 100d, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(Math.round(60000.0 * 0.93 * 100d) / 100d, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(Math.round(1000000.0 * 0.93 * 100d) / 100d, Currency.convert(1000000.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert(-1.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert( 1000001.0,exVal.get("EUR")));

        exVal = currCAD.getExchangeValues();

        assertEquals(Math.round(1.0 * 0.68 * 100d) / 100d, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(Math.round(60000.0 * 0.68* 100d) / 100d, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(Math.round(1000000.0 * 0.68 * 100d) / 100d, Currency.convert(1000000.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert(-1.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert( 1000001.0,exVal.get("EUR")));


        exVal = currAUD.getExchangeValues();

        assertEquals(Math.round(1.0 * 0.61 * 100d) / 100d, Currency.convert(1.0,exVal.get("EUR")));
        assertEquals(Math.round(60000.0 * 0.61 * 100d) / 100d, Currency.convert(60000.0,exVal.get("EUR")));
        assertEquals(Math.round(1000000.0 * 0.61 * 100d) / 100d, Currency.convert(1000000.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert(-1.0,exVal.get("EUR")));
        assertEquals(0.0,Currency.convert( 1000001.0,exVal.get("EUR")));


    }
}