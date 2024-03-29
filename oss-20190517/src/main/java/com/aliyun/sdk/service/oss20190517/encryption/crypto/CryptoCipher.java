package com.aliyun.sdk.service.oss20190517.encryption.crypto;

import javax.crypto.*;

/**
 * Functions like a {@link Cipher} but provides only a subset of all the
 * interface methods of {@link Cipher}. This class is intended to be used in
 * lieu of the underlying Cipher directly whenever applicable. For example, this
 * class makes it easy to generate an inverse cipher, or to create an
 * "auxiliary" cipher for use with get-range or multi-part upload operations. A
 * subclass may also support the mark and reset operations to enable parts of a
 * plaintext to be re-processed which is useful for error recovery typical when
 * network transmission is involved.
 */
public class CryptoCipher {
    static final CryptoCipher Null = new CryptoCipher() {
    };
    private final Cipher cipher;
    private final CryptoScheme scheme;
    private final SecretKey secreteKey;
    private final int cipherMode;

    private CryptoCipher() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    CryptoCipher(Cipher cipher, CryptoScheme scheme, SecretKey secreteKey, int cipherMode) {
        this.cipher = cipher;
        this.scheme = scheme;
        this.secreteKey = secreteKey;
        this.cipherMode = cipherMode;
    }

    /**
     * Recreates a new instance of CipherLite from the current one.
     */
    public CryptoCipher recreate() {
        return scheme.createCryptoCipher(secreteKey, cipher.getIV(), this.cipherMode, cipher.getProvider());
    }

    public byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException {
        return cipher.doFinal();
    }

    /**
     * Continues a multiple-part encryption or decryption operation (depending on
     * how the underlying cipher was initialized), processing another data part.
     *
     * <p>
     * The first <code>inputLen</code> bytes in the <code>input</code> buffer,
     * starting at <code>inputOffset</code> inclusive, are processed, and the result
     * is stored in a new buffer.
     *
     * <p>
     * If <code>inputLen</code> is zero, this method returns <code>null</code>.
     *
     * @param input       the input buffer
     * @param inputOffset the offset in <code>input</code> where the input starts
     * @param inputLen    the input length
     * @return the new buffer with the result, or null if the underlying cipher is a
     * block cipher and the input data is too short to result in a new
     * block.
     * @throws IllegalStateException if the underlying cipher is in a wrong state (e.g., has
     *                               not been initialized)
     */
    public byte[] update(byte[] input, int inputOffset, int inputLen) {
        return cipher.update(input, inputOffset, inputLen);
    }
}
