package com.Apartments.apartments.services;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
    public EncryptPassword() {
    }
        public String encrypt(String password)
        {
            String encryptedPassword;
            BigInteger conversion = null;
            MessageDigest digest = null;
            try {
                digest = MessageDigest.getInstance("MD5");
                digest.update(password.getBytes());
                byte[] result = digest.digest();
                conversion= new BigInteger(1, result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            encryptedPassword=conversion.toString(16);
            return encryptedPassword;
        }
    }

