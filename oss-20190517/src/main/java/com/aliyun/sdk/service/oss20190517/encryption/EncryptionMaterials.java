package com.aliyun.sdk.service.oss20190517.encryption;

/**
 * EncryptionMaterials is an interface used to implement different
 * encrypt/decrypt content materials providers.
 */
public interface EncryptionMaterials {
    /**
     * Encrypt the cek and iv and put the result into the given {@link ContentCryptoMaterial} instance.
     *
     * @param contentMaterial The materials that contans the content crypto info.
     */
    void encryptCEK(ContentCryptoMaterial contentMaterial);

    /**
     * Decrypt the secured cek and secured iv and put the result into the given {@link ContentCryptoMaterial}
     * instance
     *
     * @param contentMaterial The materials that contans the content crypto info.
     */
    void decryptCEK(ContentCryptoMaterial contentMaterial);
}