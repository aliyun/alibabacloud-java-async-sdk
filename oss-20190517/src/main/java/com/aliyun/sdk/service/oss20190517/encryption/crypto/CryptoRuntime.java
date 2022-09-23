package com.aliyun.sdk.service.oss20190517.encryption.crypto;


import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.Provider;
import java.security.Security;
import java.security.spec.RSAPrivateKeySpec;

public class CryptoRuntime {
    static final String BOUNCY_CASTLE_PROVIDER = "BC";
    private static final String BC_PROVIDER_FQCN = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    /**
     * Checks if the crypto mode is supported by the runtime.
     *
     * @throws UnsupportedOperationException if the necessary security provider
     *                                       cannot be found
     */
    public static void enableBouncyCastle() {
        if (!isBouncyCastleAvailable()) {
            addBouncyCastleProvider();
            if (!isBouncyCastleAvailable()) {
                throw new UnsupportedOperationException("The Bouncy castle library is not found.");
            }
        }
    }

    public static RSAPrivateKeySpec convertPemPKCS1ToPrivateKey(byte[] buffer) {
        try {
            Class<?> clz = Class.forName("org.bouncycastle.asn1.pkcs.RSAPrivateKey");
            Method method = clz.getMethod("getInstance", Object.class);
            Object obj = method.invoke(null, new Object[]{buffer});

            clz = Class.forName("org.bouncycastle.asn1.pkcs.RSAPrivateKey");
            method = clz.getMethod("getModulus", null);
            BigInteger modulus = (BigInteger) method.invoke(obj, null);

            method = clz.getMethod("getPrivateExponent", null);
            BigInteger exponent = (BigInteger) method.invoke(obj, null);

            return new RSAPrivateKeySpec(modulus, exponent);

        } catch (Exception e) {
            throw new UnsupportedOperationException("convertPemPKCS1ToPrivateKey fail.");
        }
    }

    private static synchronized boolean isBouncyCastleAvailable() {
        return Security.getProvider(BOUNCY_CASTLE_PROVIDER) != null;
    }

    private static synchronized void addBouncyCastleProvider() {
        if (isBouncyCastleAvailable()) {
            return;
        }
        try {
            @SuppressWarnings("unchecked")
            Class<Provider> c = (Class<Provider>) Class.forName(BC_PROVIDER_FQCN);
            Provider provider = c.newInstance();
            Security.addProvider(provider);
        } catch (Exception e) {
        }
    }
}

