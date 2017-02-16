/*This module for the checking of simple encryption and decryption of the string using AES.
simple image encryption and decryption will be done after this module.
*/
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
		/* this part generates the 128 bit key using AES*/
		KeyGenerator keygen=KeyGenerator.getInstance("AES");
		keygen.init(128);
		SecretKey secretkey=keygen.generateKey();
		cipher=Cipher.getInstance("AES");
		
		String plaintxt="hello how r u?";
		String key=secretkey.toString();//Here a key is generated.
		System.out.println(" secret key: "+key);
		String encryptedtxt=encrypt(plaintxt, secretkey);//This module encrypt the plaintext using key.
		System.out.println("encrypted txt: "+encryptedtxt);
		
		String decryptedtxt=decrypt(encryptedtxt, secretkey);//This module decrypt the encrypted text and return original value.
		System.out.println("decrypted txt: "+decryptedtxt);
	}
	
	/* This module for the encryption of the text*/
	public static String encrypt(String plaintxt,SecretKey secretkey) throws Exception
	{
		byte [] plaintxtbyte=plaintxt.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, secretkey);
		byte [] encryptedbyte=cipher.doFinal(plaintxtbyte);
		Base64.Encoder encoder=Base64.getEncoder();
		String encryptedtxt=encoder.encodeToString(encryptedbyte);
		
		
		return encryptedtxt;
		
	}
	
	/* This module for the decription of the encrypted text*/
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
