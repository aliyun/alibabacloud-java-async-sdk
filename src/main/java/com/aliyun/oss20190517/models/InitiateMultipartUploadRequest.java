// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InitiateMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>InitiateMultipartUploadRequest</p>
 */
public class InitiateMultipartUploadRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String xOssForbidOverwrite;

    @Header
    @NameInMap("x-oss-storage-class")
    private String xOssStorageClass;

    @Header
    @NameInMap("x-oss-tagging")
    private String xOssTagging;

    @Header
    @NameInMap("x-oss-server-side-encryption")
    private String xOssServerSideEncryption;

    @Header
    @NameInMap("x-oss-server-side-data-encryption")
    private String xOssServerSideDataEncryption;

    @Header
    @NameInMap("x-oss-server-side-encryption-key-id")
    private String xOssServerSideEncryptionKeyId;


    private InitiateMultipartUploadRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.encodingType = builder.encodingType;
        this.xOssForbidOverwrite = builder.xOssForbidOverwrite;
        this.xOssStorageClass = builder.xOssStorageClass;
        this.xOssTagging = builder.xOssTagging;
        this.xOssServerSideEncryption = builder.xOssServerSideEncryption;
        this.xOssServerSideDataEncryption = builder.xOssServerSideDataEncryption;
        this.xOssServerSideEncryptionKeyId = builder.xOssServerSideEncryptionKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateMultipartUploadRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    /**
     * @return xOssForbidOverwrite
     */
    public String xOssForbidOverwrite() {
        return this.xOssForbidOverwrite;
    }

    /**
     * @return xOssStorageClass
     */
    public String xOssStorageClass() {
        return this.xOssStorageClass;
    }

    /**
     * @return xOssTagging
     */
    public String xOssTagging() {
        return this.xOssTagging;
    }

    /**
     * @return xOssServerSideEncryption
     */
    public String xOssServerSideEncryption() {
        return this.xOssServerSideEncryption;
    }

    /**
     * @return xOssServerSideDataEncryption
     */
    public String xOssServerSideDataEncryption() {
        return this.xOssServerSideDataEncryption;
    }

    /**
     * @return xOssServerSideEncryptionKeyId
     */
    public String xOssServerSideEncryptionKeyId() {
        return this.xOssServerSideEncryptionKeyId;
    }

    public static final class Builder extends Request.Builder<InitiateMultipartUploadRequest.Builder> {
        private String bucket; 
        private String key; 
        private String encodingType; 
        private String xOssForbidOverwrite; 
        private String xOssStorageClass; 
        private String xOssTagging; 
        private String xOssServerSideEncryption; 
        private String xOssServerSideDataEncryption; 
        private String xOssServerSideEncryptionKeyId; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>encoding-type.</p>
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder xOssForbidOverwrite(String xOssForbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", xOssForbidOverwrite);
            this.xOssForbidOverwrite = xOssForbidOverwrite;
            return this;
        }

        /**
         * <p>x-oss-storage-class.</p>
         */
        public Builder xOssStorageClass(String xOssStorageClass) {
            this.putHeaderParameter("x-oss-storage-class", xOssStorageClass);
            this.xOssStorageClass = xOssStorageClass;
            return this;
        }

        /**
         * <p>x-oss-tagging.</p>
         */
        public Builder xOssTagging(String xOssTagging) {
            this.putHeaderParameter("x-oss-tagging", xOssTagging);
            this.xOssTagging = xOssTagging;
            return this;
        }

        /**
         * <p>x-oss-server-side-encryption.</p>
         */
        public Builder xOssServerSideEncryption(String xOssServerSideEncryption) {
            this.putHeaderParameter("x-oss-server-side-encryption", xOssServerSideEncryption);
            this.xOssServerSideEncryption = xOssServerSideEncryption;
            return this;
        }

        /**
         * <p>x-oss-server-side-data-encryption.</p>
         */
        public Builder xOssServerSideDataEncryption(String xOssServerSideDataEncryption) {
            this.putHeaderParameter("x-oss-server-side-data-encryption", xOssServerSideDataEncryption);
            this.xOssServerSideDataEncryption = xOssServerSideDataEncryption;
            return this;
        }

        /**
         * <p>x-oss-server-side-encryption-key-id.</p>
         */
        public Builder xOssServerSideEncryptionKeyId(String xOssServerSideEncryptionKeyId) {
            this.putHeaderParameter("x-oss-server-side-encryption-key-id", xOssServerSideEncryptionKeyId);
            this.xOssServerSideEncryptionKeyId = xOssServerSideEncryptionKeyId;
            return this;
        }

        public InitiateMultipartUploadRequest build() {
            return new InitiateMultipartUploadRequest(this);
        } 

    } 

}
