package de.integrata.oop.liskov;

public class IdentityCrypterTest extends CrypterTest {

	@Override
	protected Crypter createCrypterToTest() {
		return new IdentityCrypter();
	}

}
