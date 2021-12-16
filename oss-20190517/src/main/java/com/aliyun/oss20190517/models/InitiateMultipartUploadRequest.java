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
    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("Cache-Control")
    private String cacheControl;

    @Header
    @NameInMap("Content-Disposition")
    private String contentDisposition;

    @Header
    @NameInMap("Content-Encoding")
    private String contentEncoding;

    @Header
    @NameInMap("Expires")
    private String expires;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("encoding-type")
    private EncodeType encodingType;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String forbidOverwrite;

    @Header
    @NameInMap("x-oss-server-side-data-encryption")
    private String sseDataEncryption;

    @Header
    @NameInMap("x-oss-server-side-encryption")
    private String serverSideEncryption;

    @Header
    @NameInMap("x-oss-server-side-encryption-key-id")
    private String sseKeyId;

    @Header
    @NameInMap("x-oss-storage-class")
    private StorageClass storageClass;

    @Header
    @NameInMap("x-oss-tagging")
    private String tagging;


    private InitiateMultipartUploadRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.cacheControl = builder.cacheControl;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.expires = builder.expires;
        this.bucket = builder.bucket;
        this.encodingType = builder.encodingType;
        this.forbidOverwrite = builder.forbidOverwrite;
        this.sseDataEncryption = builder.sseDataEncryption;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.sseKeyId = builder.sseKeyId;
        this.storageClass = builder.storageClass;
        this.tagging = builder.tagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateMultipartUploadRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return cacheControl
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * @return contentDisposition
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return expires
     */
    public String getExpires() {
        return this.expires;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return encodingType
     */
    public EncodeType getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return forbidOverwrite
     */
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return sseDataEncryption
     */
    public String getSseDataEncryption() {
        return this.sseDataEncryption;
    }

    /**
     * @return serverSideEncryption
     */
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * @return sseKeyId
     */
    public String getSseKeyId() {
        return this.sseKeyId;
    }

    /**
     * @return storageClass
     */
    public StorageClass getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return tagging
     */
    public String getTagging() {
        return this.tagging;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String cacheControl; 
        private String contentDisposition; 
        private String contentEncoding; 
        private String expires; 
        private String bucket; 
        private EncodeType encodingType; 
        private String forbidOverwrite; 
        private String sseDataEncryption; 
        private String serverSideEncryption; 
        private String sseKeyId; 
        private StorageClass storageClass; 
        private String tagging; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>Cache-Control.</p>
         */
        public Builder cacheControl(String cacheControl) {
            this.putHeaderParameter("Cache-Control", cacheControl);
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * <p>Content-Disposition.</p>
         */
        public Builder contentDisposition(String contentDisposition) {
            this.putHeaderParameter("Content-Disposition", contentDisposition);
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * <p>Content-Encoding.</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putHeaderParameter("Content-Encoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>Expires.</p>
         */
        public Builder expires(String expires) {
            this.putHeaderParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>encoding-type.</p>
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        /**
         * <p>x-oss-server-side-data-encryption.</p>
         */
        public Builder sseDataEncryption(String sseDataEncryption) {
            this.putHeaderParameter("x-oss-server-side-data-encryption", sseDataEncryption);
            this.sseDataEncryption = sseDataEncryption;
            return this;
        }

        /**
         * <p>x-oss-server-side-encryption.</p>
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.putHeaderParameter("x-oss-server-side-encryption", serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * <p>x-oss-server-side-encryption-key-id.</p>
         */
        public Builder sseKeyId(String sseKeyId) {
            this.putHeaderParameter("x-oss-server-side-encryption-key-id", sseKeyId);
            this.sseKeyId = sseKeyId;
            return this;
        }

        /**
         * <p>x-oss-storage-class.</p>
         */
        public Builder storageClass(StorageClass storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>x-oss-tagging.</p>
         */
        public Builder tagging(String tagging) {
            this.putHeaderParameter("x-oss-tagging", tagging);
            this.tagging = tagging;
            return this;
        }

        public InitiateMultipartUploadRequest build() {
            return new InitiateMultipartUploadRequest(this);
        } 

    } 

}
