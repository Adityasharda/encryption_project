package com.encrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Main2 {
	static Cipher cipher;

	public static void main(String[] args) throws Exception 
	{
		KeyGenerator keygen=KeyGenerator.getInstance("AES");
		keygen.init(128);
		SecretKey secretkey=keygen.generateKey();
		cipher=Cipher.getInstance("AES");
		
		String plaintxt="hello how r u?";
		String key=secretkey.toString();
		System.out.println(" secret key: "+key);
		String encryptedtxt=encrypt(plaintxt, secretkey);
		System.out.println("encrypted txt: "+encryptedtxt);
		
		String decryptedtxt=decrypt(encryptedtxt, secretkey);
		System.out.println("decrypted txt: "+decryptedtxt);
	}
	public static String encrypt(String plaintxt,SecretKey secretkey) throws Exception
	{
		byte [] plaintxtbyte=plaintxt.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, secretkey);
		byte [] encryptedbyte=cipher.doFinal(plaintxtbyte);
		Base64.Encoder encoder=Base64.getEncoder();
		String encryptedtxt=encoder.encodeToString(encryptedbyte);
		
		
		return encryptedtxt;
		
	}
	public static String decrypt(String encryptedtxt,SecretKey secretkey) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException
	{
		Base64.Decoder decoder=Base64.getDecoder();
		byte []encryptedtxtbyte=decoder.decode(encryptedtxt);
		cipher.init(Cipher.DECRYPT_MODE, secretkey);
		byte [] decreptedbyte=cipher.doFinal(encryptedtxtbyte);
		String decryptedtxt=new String(decreptedbyte);
		return decryptedtxt;
	}

}
