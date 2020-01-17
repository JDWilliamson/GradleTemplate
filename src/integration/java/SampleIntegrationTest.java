import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class SampleIntegrationTest
{
    private Logger logger;

    @BeforeEach
    void setUp()
    {
        logger = mock(Logger.class);
    }

    @Test
    void given_When_Then()
    {
        assertTrue(true);
        verifyZeroInteractions(logger);
    }
}
