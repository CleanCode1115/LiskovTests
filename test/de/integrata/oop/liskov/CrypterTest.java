package de.integrata.oop.liskov;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public abstract class CrypterTest {

	protected Crypter crypter;
	
	@Before
	public void setUp() {
		crypter = createCrypterToTest();
	}

	protected abstract Crypter createCrypterToTest();
	
	@Test
	public void testCryptAndDecryptReturnsOriginalString() {
		String cryptedString = crypter.crypt("Hallo");
		String decryptedString = crypter.decrypt(cryptedString);
		
		assertThat(decryptedString, is("Hallo"));
	}
}
