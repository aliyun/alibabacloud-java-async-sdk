package com.aliyun.sdk.service.oss20190517.encryption.internal;

public interface CryptoHeaders {
    String CRYPTO_KEY = "client-side-encryption-key";
    String CRYPTO_IV = "client-side-encryption-start";
    String CRYPTO_CEK_ALG = "client-side-encryption-cek-alg";
    String CRYPTO_WRAP_ALG = "client-side-encryption-wrap-alg";
    String CRYPTO_MATDESC = "client-side-encryption-matdesc";
    String CRYPTO_DATA_SIZE = "client-side-encryption-data-size";
    String CRYPTO_PART_SIZE = "client-side-encryption-part-size";
    String CRYPTO_UNENCRYPTION_CONTENT_LENGTH = "client-side-encryption-unencrypted-content-length";
    String CRYPTO_UNENCRYPTION_CONTENT_MD5 = "client-side-encryption-unencrypted-content-md5";

    String X_OSS_META_CRYPTO_KEY = "x-oss-meta-" + CRYPTO_KEY;
    String X_OSS_META_CRYPTO_IV = "x-oss-meta-" + CRYPTO_IV;
    String X_OSS_META_CRYPTO_CEK_ALG = "x-oss-meta-" + CRYPTO_CEK_ALG;
    String X_OSS_META_CRYPTO_WRAP_ALG = "x-oss-meta-" + CRYPTO_WRAP_ALG;
    String X_OSS_META_CRYPTO_MATDESC = "x-oss-meta-" + CRYPTO_MATDESC;
    String X_OSS_META_CRYPTO_DATA_SIZE = "x-oss-meta-" + CRYPTO_DATA_SIZE;
    String X_OSS_META_CRYPTO_PART_SIZE = "x-oss-meta-" + CRYPTO_PART_SIZE;
    String X_OSS_META_CRYPTO_UNENCRYPTION_CONTENT_LENGTH = "x-oss-meta-" + CRYPTO_UNENCRYPTION_CONTENT_LENGTH;
    String X_OSS_META_CRYPTO_UNENCRYPTION_CONTENT_MD5 = "x-oss-meta-" + CRYPTO_UNENCRYPTION_CONTENT_MD5;

}

