package com.aliyun.sdk.service.oss20190517.encryption;

import javax.crypto.SecretKey;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ContentCryptoMaterial implements Serializable {
    private static final long serialVersionUID = -2728152316155503945L;
    /**
     * Prevent sensitive information serializing.
     */
    protected transient SecretKey cek;
    /**
     * Prevent sensitive information serializing.
     */
    protected transient byte[] iv;
    protected String contentCryptoAlgorithm;
    protected byte[] encryptedCEK;
    protected byte[] encryptedIV;
    protected String keyWrapAlgorithm;
    protected Map<String, String> matdesc;

    public ContentCryptoMaterial() {
    }

    public ContentCryptoMaterial(SecretKey cek,
                                 byte[] iv,
                                 String contentCryptoAlgorithm,
                                 byte[] encryptedCEK,
                                 byte[] encryptedIV,
                                 String keyWrapAlgorithm,
                                 Map<String, String> matDesc) {
        this.cek = cek;
        this.iv = iv.clone();
        this.contentCryptoAlgorithm = contentCryptoAlgorithm;
        this.encryptedCEK = encryptedCEK.clone();
        this.encryptedIV = encryptedIV.clone();
        this.keyWrapAlgorithm = keyWrapAlgorithm;
        this.matdesc = Collections.unmodifiableMap(new TreeMap<String, String>(matDesc));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        if (cek != null) {
            for (int i = 0; i < cek.getEncoded().length; i++) {
                result = prime * result + cek.getEncoded()[i];
            }
        }

        if (iv != null) {
            for (int i = 0; i < iv.length; i++) {
                result = prime * result + iv[i];
            }
        }

        if (encryptedCEK != null) {
            for (int i = 0; i < encryptedCEK.length; i++) {
                result = prime * result + encryptedCEK[i];
            }
        }

        if (encryptedIV != null) {
            for (int i = 0; i < encryptedIV.length; i++) {
                result = prime * result + encryptedIV[i];
            }
        }

        result = prime * result + ((contentCryptoAlgorithm == null) ? 0 : contentCryptoAlgorithm.hashCode());
        result = prime * result + ((keyWrapAlgorithm == null) ? 0 : keyWrapAlgorithm.hashCode());
        result = prime * result + ((matdesc == null) ? 0 : matdesc.hashCode());
        return result;
    }

    /**
     * @return the content crypto algorithm name.
     */
    public String getContentCryptoAlgorithm() {
        return contentCryptoAlgorithm;
    }

    /**
     * Sets the content crypto algorithm to the specified algorithm.
     */
    public void setContentCryptoAlgorithm(String contentCryptoAlgorithm) {
        this.contentCryptoAlgorithm = contentCryptoAlgorithm;
    }

    /**
     * @return the content encryption key.
     */
    public SecretKey getCEK() {
        return cek;
    }

    /**
     * Sets the content encryption key to the specified key.
     */
    public void setCEK(SecretKey cek) {
        this.cek = cek;
    }

    /**
     * @return an array of bytes representing the content crypto cipher start counter.
     */
    public byte[] getIV() {
        return iv.clone();
    }

    /**
     * Sets the content crypto cipher start counter to the specified counter.
     */
    public void setIV(byte[] iv) {
        this.iv = iv;
    }

    /**
     * @return an array of bytes representing the encrypted content encrytion key.
     */
    public byte[] getEncryptedCEK() {
        return encryptedCEK.clone();
    }

    /**
     * Sets the encrypted content encryption key to the specified array.
     */
    public void setEncryptedCEK(byte[] encryptedCEK) {
        this.encryptedCEK = encryptedCEK.clone();
    }

    /**
     * @return an array of bytes representing the encrypted IV.
     */
    public byte[] getEncryptedIV() {
        return encryptedIV.clone();
    }

    /**
     * Sets the encrypted content crypto cipher start counter to the specified array.
     */
    public void setEncryptedIV(byte[] encryptedIV) {
        this.encryptedIV = encryptedIV.clone();
    }

    /**
     * @return the algorithm that it wraps content encrypt key(cek) to encrypted cek.
     */
    public String getKeyWrapAlgorithm() {
        return keyWrapAlgorithm;
    }

    /**
     * Sets the key wrap algorithm to the specified algorithm.
     */
    public void setKeyWrapAlgorithm(String keyWrapAlgorithm) {
        this.keyWrapAlgorithm = keyWrapAlgorithm;
    }

    /**
     * @return the description of the encryption materials
     */
    public Map<String, String> getMaterialsDescription() {
        return matdesc;
    }

    /**
     * Sets the description of the encryption materials
     */
    public void setMaterialsDescription(Map<String, String> matdesc) {
        this.matdesc = Collections.unmodifiableMap(new TreeMap<String, String>(matdesc));
    }


}

