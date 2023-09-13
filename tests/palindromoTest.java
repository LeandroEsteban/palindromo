import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromoTest {

    @Test
    public void testEsPalabraValida_Numero() {
        assertFalse(palindromo.esPalabraValida("200"));
    }

    @Test
    public void testCadenavacia() {
        assertTrue(palindromo.esPalindromo(""));
        assertTrue(palindromo.esPalindromo("aaabccbaaa"));
        assertFalse(palindromo.esPalindromo("ahabccbaaa"));
        assertFalse(palindromo.esPalindromo("La tele leta"));
    }
}