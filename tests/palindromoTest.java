import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromoTest {

    @Test
    public void testTele() {
        assertTrue(palindromo.esPalindromo("La tele letal"));
    }
    @Test
    public void testCadenavacia(){
        assertTrue(palindromo.esPalindromo(""));
    }
    @Test
    public void testCaracteres(){
        assertTrue(palindromo.esPalindromo("0_0 : @a-a@ : 0_0"));
    }
    @Test
    public void testEspalindromo(){
        assertTrue(palindromo.esPalindromo("No subas, abusón"));
    }
    @Test
    public void testNumero(){
        assertTrue(palindromo.esPalindromo("101101"));
    }
    @Test
    public void testNopalindomo(){
        assertFalse(palindromo.esPalindromo("@axsomosxc@"));
    }
}