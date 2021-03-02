

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    private imp.Picture picture1;

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
    @BeforeEach
    public void setUp()
    {
        beispiel1 = new Beispielbild();
        geometri1 = new GeometrischeBildoperationen();
        picture1 = geometri1.dreheUm90GradLinks(beispiel1);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
