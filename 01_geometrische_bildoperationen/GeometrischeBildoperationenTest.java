

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse GeometrischeBildoperationenTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GeometrischeBildoperationenTest
{
    private Beispielbild beispiel1;
    private GeometrischeBildoperationen geometri1;

    /**
     * Konstruktor fuer die Test-Klasse GeometrischeBildoperationenTest
     */
    public GeometrischeBildoperationenTest()
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
        geometri1 = new GeometrischeBildoperationen();
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
