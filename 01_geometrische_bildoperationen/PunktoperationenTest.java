

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse PunktoperationenTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PunktoperationenTest
{
    private Beispielbild beispiel1;
    private Punktoperationen punktope1;

    /**
     * Konstruktor fuer die Test-Klasse PunktoperationenTest
     */
    public PunktoperationenTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        beispiel1 = new Beispielbild();
        punktope1 = new Punktoperationen();
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}