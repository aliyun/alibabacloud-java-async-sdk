package com.aliyun.sdk.service.oss20190517.encryption.crypto;

import com.aliyun.sdk.gateway.oss.exception.OSSClientException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.nio.ByteBuffer;
import java.security.Provider;

public abstract class CryptoScheme {
    public static final int BLOCK_SIZE = 16;
    public static final CryptoScheme AES_CTR = new AesCtr();

    // Enable bouncy castle provider
    static {
        CryptoRuntime.enableBouncyCastle();
    }

    /**
     * Increment the rightmost 64 bits of a 16-byte counter by the specified delta.
     * Both the specified delta and the resultant value must stay within the
     * capacity of 64 bits. (Package private for testing purposes.)
     *
     * @param counter    a 16-byte counter.
     * @param blockDelta the number of blocks (16-byte) to increment
     */
    public static byte[] incrementBlocks(byte[] counter, long blockDelta) {
        if (blockDelta == 0)
            return counter;
        if (counter == null || counter.length != 16)
            throw new IllegalArgumentException();

        ByteBuffer bb = ByteBuffer.allocate(8);
        for (int i = 12; i <= 15; i++)
            bb.put(i - 8, counter[i]);
        long val = bb.getLong() + blockDelta; // increment by delta
        bb.rewind();
        byte[] result = bb.putLong(val).array();

        for (int i = 8; i <= 15; i++)
            counter[i] = result[i - 8];
        return counter;
    }

    public static CryptoScheme fromCEKAlgo(String cekAlgo) {
        if (AES_CTR.getContentCipherAlgorithm().equals(cekAlgo)) {
            return AES_CTR;
        }
        throw new UnsupportedOperationException("Unsupported content encryption scheme: " + cekAlgo);
    }

    public abstract String getKeyGeneratorAlgorithm();

    public abstract int getKeyLengthInBits();

    public abstract String getContentCipherAlgorithm();

    public abstract int getContentCipherIVLength();

    public abstract byte[] adjustIV(byte[] iv, long dataStartPos);

    /**
     * This is a factory method to create CryptoCipher.
     */
    public CryptoCipher newCryptoCipher(Cipher cipher, SecretKey cek, int cipherMode) {
        return new CryptoCipher(cipher, this, cek, cipherMode);
    }

    public CryptoCipher createCryptoCipher(SecretKey cek, byte[] iv, int cipherMode, Provider provider) {
        try {
            Cipher cipher = null;
            if (provider != null) {
                cipher = Cipher.getInstance(getContentCipherAlgorithm(), provider);
            } else {
                cipher = Cipher.getInstance(getContentCipherAlgorithm());
            }
            cipher.init(cipherMode, cek, new IvParameterSpec(iv));
            return newCryptoCipher(cipher, cek, cipherMode);
        } catch (Exception e) {
            throw new OSSClientException("Unable to build cipher: " + e.getMessage(), e);
        }
    }
}
