package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.gateway.oss.exception.OSSClientException;
import com.aliyun.sdk.service.oss20190517.encryption.ContentCryptoMaterial;
import com.aliyun.sdk.service.oss20190517.encryption.ContentCryptoMode;
import com.aliyun.sdk.service.oss20190517.encryption.CryptoConfiguration;
import com.aliyun.sdk.service.oss20190517.encryption.EncryptionMaterials;
import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoCipher;
import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoScheme;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class CryptoModuleAesCtr extends CryptoModuleBase {
    final private CryptoScheme contentCryptoScheme;

    public CryptoModuleAesCtr(OSSDirect OSS,
                              EncryptionMaterials encryptionMaterials,
                              CryptoConfiguration cryptoConfig) {
        super(OSS, encryptionMaterials, cryptoConfig);
        this.contentCryptoScheme = CryptoScheme.AES_CTR;
    }

    /**
     * @return an array of bytes representing the content crypto cipher start counter.
     */
    @Override
    final byte[] generateIV() {
        final byte[] iv = new byte[contentCryptoScheme.getContentCipherIVLength()];
        cryptoConfig.getSecureRandom().nextBytes(iv);
        if (cryptoConfig.getContentCryptoMode().equals(ContentCryptoMode.AES_CTR_MODE)) {
            for (int i = 8; i < 12; i++) {
                iv[i] = 0;
            }
        }
        return iv;
    }

    /**
     * Returns a secret key for encrypting content.
     *
     * @return content encrypt key.
     */
    @Override
    final protected SecretKey generateCEK() {
        KeyGenerator generator;
        final String keygenAlgo = contentCryptoScheme.getKeyGeneratorAlgorithm();
        final int keyLength = contentCryptoScheme.getKeyLengthInBits();
        try {
            generator = KeyGenerator.getInstance(keygenAlgo);
            generator.init(keyLength, cryptoConfig.getSecureRandom());
            SecretKey secretKey = generator.generateKey();
            for (int retry = 0; retry < 9; retry++) {
                secretKey = generator.generateKey();
                if (secretKey.getEncoded()[0] != 0)
                    return secretKey;
            }
            throw new OSSClientException("Failed to generate secret key", null);
        } catch (NoSuchAlgorithmException e) {
            throw new OSSClientException("No such algorithm:" + keygenAlgo + ", " + e.getMessage(), e);
        }
    }

    @Override
    public String getContentCipherAlgorithm() {
        return contentCryptoScheme.getContentCipherAlgorithm();
    }

    /**
     * Creates a cipher from a {@link ContentCryptoMaterial} instance, it used to encrypt data.
     *
     * @param cekMaterial It provides the cek iv and crypto algorithm to build an crypto cipher.
     * @param cryptoRange The first element of the crypto range is the offset of the acquired object,
     *                    and it should be allgned with cipher block if it was not null.
     * @param skipBlock   the number of blocks should be skiped when the cipher created.
     * @return a {@link CryptoCipher} instance for encrypt data.
     */
    @Override
    final CryptoCipher createEncryptCryptoCipher(ContentCryptoMaterial cekMaterial, long[] cryptoRange, long skipBlock) {
        return createCryptoCipherFromContentCryptoMaterial(cekMaterial, Cipher.ENCRYPT_MODE, cryptoRange, skipBlock);
    }


    /**
     * Creates a cipher from a {@link ContentCryptoMaterial} instance, it used to decrypt data.
     *
     * @param cekMaterial It provides the cek iv and crypto algorithm to build an crypto cipher.
     * @param cryptoRange The first element of the crypto range is the offset of the acquired object,
     *                    and it should be allgned with cipher block if it was not null.
     * @param skipBlock   the number of blocks should be skiped when the cipher created.
     * @return a {@link CryptoCipher} instance for decrypt data.
     */
    @Override
    final CryptoCipher createDecryptCryptoCipher(ContentCryptoMaterial cekMaterial, long[] cryptoRange, long skipBlock) {
        return createCryptoCipherFromContentCryptoMaterial(cekMaterial, Cipher.DECRYPT_MODE, cryptoRange, skipBlock);
    }

    private CryptoCipher createCryptoCipherFromContentCryptoMaterial(ContentCryptoMaterial cekMaterial, int cipherMode,
                                                                     long[] cryptoRange, long skipBlock) {
        if (cipherMode != Cipher.ENCRYPT_MODE && cipherMode != Cipher.DECRYPT_MODE) {
            throw new OSSClientException("Invalid cipher mode.", null);
        }
        byte[] iv = cekMaterial.getIV();
        SecretKey cek = cekMaterial.getCEK();
        String cekAlgo = cekMaterial.getContentCryptoAlgorithm();
        CryptoScheme tmpContentCryptoScheme = CryptoScheme.fromCEKAlgo(cekAlgo);
        // Adjust the IV if needed
        boolean isRangeGet = (cryptoRange != null);
        if (isRangeGet) {
            iv = tmpContentCryptoScheme.adjustIV(iv, cryptoRange[0]);
        } else if (skipBlock > 0) {
            iv = CryptoScheme.incrementBlocks(iv, skipBlock);
        }
        return tmpContentCryptoScheme.createCryptoCipher(cek, iv, cipherMode, cryptoConfig.getContentCryptoProvider());
    }
}
