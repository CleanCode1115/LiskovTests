package de.integrata.oop.liskov;

import org.junit.Ignore;
import org.junit.Test;

public class UpperCaseCrpyterTest extends CrypterTest {

	@Override
	protected Crypter createCrypterToTest() {
		return new UpperCaseCrypter();
	}

	@Override
	@Test
	@Ignore("non liskov")
	public void testCryptAndDecryptReturnsOriginalString() {
	}

	
	
}
