package de.integrata.oop.liskov;

public class UpperCaseCrypter implements Crypter {

	@Override
	public String crypt(String input) {
		return input.toUpperCase();
	}

	@Override
	public String decrypt(String input) {
		return input.toLowerCase();
	}

}
