package com.aliyun.sdk.service.oss20190517.encryption;

import java.io.Serializable;
import java.security.Provider;
import java.security.SecureRandom;

/**
 * The crypto configuration used to configure storage method of crypto info,
 * content crypto mode, secure random generator and content crypto provider.
 */
public class CryptoConfiguration implements Cloneable, Serializable {
    /**
     * Default crypto configuration.
     */
    public static final CryptoConfiguration DEFAULT = new CryptoConfiguration();
    private static final long serialVersionUID = -610360281849259785L;
    private static final SecureRandom SRAND = new SecureRandom();
    private ContentCryptoMode contentCryptoMode;
    private CryptoStorageMethod storageMethod;
    private Provider contentCryptoProvider;
    private SecureRandom secureRandom;

    public CryptoConfiguration() {
        this.contentCryptoMode = ContentCryptoMode.AES_CTR_MODE;
        this.storageMethod = CryptoStorageMethod.ObjectMetadata;
        this.secureRandom = SRAND;
        this.contentCryptoProvider = null;
    }

    public CryptoConfiguration(ContentCryptoMode contentCryptoMode,
                               CryptoStorageMethod storageMethod,
                               SecureRandom secureRandom,
                               Provider contentCryptoProvider) {
        this.contentCryptoMode = contentCryptoMode;
        this.storageMethod = storageMethod;
        this.secureRandom = secureRandom;
        this.contentCryptoProvider = contentCryptoProvider;
    }

    /**
     * Gets the content crypto mode to the specified crypto mode.
     *
     * @return contentCryptoMode
     * the content crypto mode {@link ContentCryptoMode}.
     */
    public ContentCryptoMode getContentCryptoMode() {
        return this.contentCryptoMode;
    }

    /**
     * Sets the content crypto mode to the specified crypto mode.
     *
     * @param contentCryptoMode the content crypto mode {@link ContentCryptoMode}.
     */
    public void setContentCryptoMode(ContentCryptoMode contentCryptoMode) {
        this.contentCryptoMode = contentCryptoMode;
    }

    /**
     * Gets the storage method.
     *
     * @return the storage method of the cryto information storing.
     */
    public CryptoStorageMethod getStorageMethod() {
        return this.storageMethod;
    }

    /**
     * Sets the storage method to the specified storage method.
     *
     * @param storageMethod the storage method of the cryto information sotoring.
     */
    public void setStorageMethod(CryptoStorageMethod storageMethod) {
        this.storageMethod = storageMethod;
    }

    /**
     * Sets the secure random to the specified secure random generator, and returns the updated
     * CryptoConfiguration object.
     *
     * @param secureRandom the secure random generator.
     * @return The updated CryptoConfiguration object.
     */
    public CryptoConfiguration withSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }

    /**
     * Gets the secure random to the specified secure random generator.
     *
     * @return secureRandom
     * the secure random generator.
     */
    public SecureRandom getSecureRandom() {
        return secureRandom;
    }

    /**
     * Sets the secure random to the specified secure random generator, and returns the updated
     * CryptoConfiguration object.
     *
     * @param secureRandom the secure random generator.
     */
    public void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    /**
     * Sets the content crypto provider the specified provider, and returns the updated
     * CryptoConfiguration object.
     *
     * @param contentCryptoProvider The provider to be used for crypto content.
     * @return The updated CryptoConfiguration object.
     */
    public CryptoConfiguration withContentCryptoProvider(Provider contentCryptoProvider) {
        this.contentCryptoProvider = contentCryptoProvider;
        return this;
    }

    /**
     * Gets the content crypto provider
     *
     * @return the provider to be used for crypto content.
     */
    public Provider getContentCryptoProvider() {
        return this.contentCryptoProvider;
    }

    /**
     * Sets the content crypto provider the specified provider.
     *
     * @param contentCryptoProvider The provider to be used for crypto content.
     */
    public void setContentCryptoProvider(Provider contentCryptoProvider) {
        this.contentCryptoProvider = contentCryptoProvider;
    }

    @Override
    public CryptoConfiguration clone() {
        CryptoConfiguration config = new CryptoConfiguration();
        config.setContentCryptoMode(contentCryptoMode);
        config.setSecureRandom(secureRandom);
        config.setStorageMethod(storageMethod);
        config.setContentCryptoProvider(contentCryptoProvider);
        return config;
    }
}
