package com.aliyun.sdk.service.oss20190517.encryption;

/**
 * The different storage method available for storing the encryption
 * information that accompanies encrypted objects in OSS.
 * <p>
 * ObjectMetadata is the default storage Method. If the ObjectMetadata mode is
 * used, then encryption information will be placed in the metadata of the
 * encrypted object stored in OSS.
 */
public enum CryptoStorageMethod {
    ObjectMetadata
}
