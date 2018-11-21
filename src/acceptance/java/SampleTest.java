import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SampleTest
{
    private SampleTest sampleTest;

    @BeforeEach
    void setUp()
    {
        sampleTest = mock(SampleTest.class);
    }

    @Test
    void given_When_Then()
    {
        assertTrue(true);
        verifyZeroInteractions(sampleTest);
    }
}
