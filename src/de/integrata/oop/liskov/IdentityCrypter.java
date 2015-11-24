package de.integrata.oop.liskov;

public class IdentityCrypter implements Crypter {

	@Override
	public String crypt(String input) {
		return input;
	}

	@Override
	public String decrypt(String input) {
		return input;
	}

}
