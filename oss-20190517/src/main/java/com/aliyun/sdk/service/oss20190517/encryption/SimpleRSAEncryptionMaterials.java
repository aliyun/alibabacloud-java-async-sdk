package com.aliyun.sdk.service.oss20190517.encryption;

import com.aliyun.core.utils.Base64Util;
import com.aliyun.core.utils.StringUtils;
import com.aliyun.sdk.gateway.oss.exception.OSSClientException;
import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoRuntime;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.Field;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This provide a simple rsa encryption materials for client-side encryption.
 */
public class SimpleRSAEncryptionMaterials implements EncryptionMaterials {
    public static final String KEY_WRAP_ALGORITHM = "RSA/NONE/PKCS1Padding";

    // Enable bouncy castle provider
    static {
        CryptoRuntime.enableBouncyCastle();
    }

    private final LinkedHashMap<KeyPair, Map<String, String>> keyPairDescMaterials =
            new LinkedHashMap<KeyPair, Map<String, String>>();
    private final KeyPair keyPair;
    private final Map<String, String> desc;

    public SimpleRSAEncryptionMaterials(KeyPair keyPair) {
        assertParameterNotNull(keyPair, "KeyPair");
        this.keyPair = keyPair;
        desc = new HashMap<String, String>();
        keyPairDescMaterials.put(keyPair, desc);
    }

    public SimpleRSAEncryptionMaterials(KeyPair keyPair, Map<String, String> desc) {
        assertParameterNotNull(keyPair, "KeyPair");
        this.keyPair = keyPair;
        this.desc = (desc == null) ? new HashMap<String, String>() : new HashMap<String, String>(desc);
        keyPairDescMaterials.put(keyPair, desc);
    }

    /**
     * Gets a rsa private key from PKCS1 pem string.
     *
     * @return a new rsa private key
     */
    public static RSAPrivateKey getPrivateKeyFromPemPKCS1(final String privateKeyStr) {
        try {
            String adjustStr = privateKeyStr.replace("-----BEGIN PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("-----BEGIN RSA PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("-----END PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("-----END RSA PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("\n", "");

            CryptoRuntime.enableBouncyCastle();

            byte[] buffer = Base64Util.decodeString(adjustStr);
            RSAPrivateKeySpec keySpec = CryptoRuntime.convertPemPKCS1ToPrivateKey(buffer);

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);

        } catch (Exception e) {
            throw new OSSClientException("get private key from PKCS1 pem String error." + e.getMessage(), e);
        }
    }

    /**
     * Gets a rsa private key from PKCS8 pem string.
     *
     * @return a new rsa private key
     */
    public static RSAPrivateKey getPrivateKeyFromPemPKCS8(final String privateKeyStr) {
        try {
            String adjustStr = privateKeyStr.replace("-----BEGIN PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("-----BEGIN RSA PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("-----END PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("-----END RSA PRIVATE KEY-----", "");
            adjustStr = adjustStr.replace("\n", "");

            byte[] buffer = Base64Util.decodeString(adjustStr);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        } catch (Exception e) {
            throw new OSSClientException("Get private key from PKCS8 pem String error: " + e.getMessage(), e);
        }
    }

    /**
     * Gets a rsa public key from PKCS8 pem string.
     *
     * @return a new rsa public key
     */
    public static RSAPublicKey getPublicKeyFromPemX509(final String publicKeyStr) {
        try {
            String adjustStr = publicKeyStr.replace("-----BEGIN PUBLIC KEY-----", "");
            adjustStr = adjustStr.replace("-----BEGIN RSA PUBLIC KEY-----", "");
            adjustStr = adjustStr.replace("-----END PUBLIC KEY-----", "");
            adjustStr = adjustStr.replace("-----END RSA PUBLIC KEY-----", "");
            adjustStr = adjustStr.replace("\n", "");

            byte[] buffer = Base64Util.decodeString(adjustStr);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);

            return (RSAPublicKey) keyFactory.generatePublic(keySpec);
        } catch (Exception e) {
            throw new OSSClientException("Get public key from X509 pem String error." + e.getMessage(), e);
        }
    }

    /**
     * Add a key pair and its descrption for decrypting data.
     *
     * @param keyPair     The RSA key pair.
     * @param description The descripton of encryption materails.
     */
    public synchronized void addKeyPairDescMaterial(KeyPair keyPair, Map<String, String> description) {
        assertParameterNotNull(keyPair, "keyPair");
        if (description != null) {
            keyPairDescMaterials.put(keyPair, new HashMap<String, String>(description));
        } else {
            keyPairDescMaterials.put(keyPair, new HashMap<String, String>());
        }
    }

    /**
     * Find the specifed key pair for decrypting by the specifed descrption.
     *
     * @param desc The encryption description.
     * @return the lastest specifed key pair that matchs the descrption, otherwise return null.
     */
    private KeyPair findKeyPairByDescription(Map<String, String> desc) {
        if (desc == null) {
            return null;
        }
        for (Map.Entry<KeyPair, Map<String, String>> entry : keyPairDescMaterials.entrySet()) {
            if (desc.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * Gets the lastest key-value in the LinedHashMap.
     */
    private <K, V> Map.Entry<K, V> getTailByReflection(LinkedHashMap<K, V> map)
            throws NoSuchFieldException, IllegalAccessException {
        Field tail = map.getClass().getDeclaredField("tail");
        tail.setAccessible(true);
        return (Map.Entry<K, V>) tail.get(map);
    }

    /**
     * Encrypt the content encryption key(cek) and iv, and put the result into
     * {@link ContentCryptoMaterial}.
     *
     * @param contentMaterial The materials that contans all content crypto info,
     *                        it must be constructed on outside and filled with the iv cek parameters.
     *                        Then it will be builed with the encrypted cek ,encrypted iv, key wrap
     *                        algorithm and encryption materials description by this method.
     */
    @Override
    public void encryptCEK(ContentCryptoMaterial contentMaterial) {
        assertParameterNotNull(contentMaterial, "ContentCryptoMaterialRW");
        assertParameterNotNull(contentMaterial.getCEK(), "ContentCryptoMaterialRW#getCEK()");
        assertParameterNotNull(contentMaterial.getIV(), "ContentCryptoMaterialRW#getIV()");
        try {
            Key key = keyPair.getPublic();
            Cipher cipher = Cipher.getInstance(KEY_WRAP_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key, new SecureRandom());
            byte[] encryptedCEK = cipher.doFinal(contentMaterial.getCEK().getEncoded());
            byte[] encryptedIV = cipher.doFinal(contentMaterial.getIV());

            contentMaterial.setEncryptedCEK(encryptedCEK);
            contentMaterial.setEncryptedIV(encryptedIV);
            contentMaterial.setKeyWrapAlgorithm(KEY_WRAP_ALGORITHM);
            contentMaterial.setMaterialsDescription(desc);
        } catch (Exception e) {
            throw new OSSClientException("Unable to encrypt content encryption key or iv." + e.getMessage(), e);
        }
    }

    /**
     * Decrypt the encrypted content encryption key(cek) and encrypted iv and put
     * the result into {@link ContentCryptoMaterial}.
     *
     * @param contentMaterial The materials that contans all content crypto info,
     *                        it must be constructed on outside and filled with
     *                        the encrypted cek ,encrypted iv, key wrap algorithm,
     *                        encryption materials description and cek generator
     *                        algothrim. Then it will be builded with the cek and iv.
     */
    @Override
    public void decryptCEK(ContentCryptoMaterial contentMaterial) {
        assertParameterNotNull(contentMaterial, "ContentCryptoMaterialRW");
        assertParameterNotNull(contentMaterial.getEncryptedCEK(), "ContentCryptoMaterialRW#getEncryptedCEK");
        assertParameterNotNull(contentMaterial.getEncryptedIV(), "ContentCryptoMaterialRW#getEncryptedIV");
        assertParameterNotNull(contentMaterial.getKeyWrapAlgorithm(), "ContentCryptoMaterialRW#getKeyWrapAlgorithm");

        if (!contentMaterial.getKeyWrapAlgorithm().equalsIgnoreCase(KEY_WRAP_ALGORITHM)) {
            throw new OSSClientException(
                    "Unrecognize your object key wrap algorithm: " + contentMaterial.getKeyWrapAlgorithm(), null);
        }

        try {
            KeyPair keyPair = findKeyPairByDescription(contentMaterial.getMaterialsDescription());
            if (keyPair == null) {
                Map.Entry<KeyPair, Map<String, String>> entry = getTailByReflection(keyPairDescMaterials);
                keyPair = entry.getKey();
            }

            Key key = keyPair.getPrivate();
            Cipher cipher = Cipher.getInstance(KEY_WRAP_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] cekBytes = cipher.doFinal(contentMaterial.getEncryptedCEK());
            byte[] iv = cipher.doFinal(contentMaterial.getEncryptedIV());
            SecretKey cek = new SecretKeySpec(cekBytes, "");

            contentMaterial.setCEK(cek);
            contentMaterial.setIV(iv);
        } catch (Exception e) {
            throw new OSSClientException("Unable to decrypt the secured content key and iv. " + e.getMessage(), e);
        }
    }

    private void assertParameterNotNull(Object parameterValue, String errorMessage) {
        if (parameterValue == null)
            throw new IllegalArgumentException(errorMessage);
    }
}
