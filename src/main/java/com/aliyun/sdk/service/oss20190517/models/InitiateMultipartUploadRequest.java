// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InitiateMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>InitiateMultipartUploadRequest</p>
 */
public class InitiateMultipartUploadRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
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
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

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
    private String storageClass;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getEncodingType() {
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
    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return tagging
     */
    public String getTagging() {
        return this.tagging;
    }

    public static final class Builder extends Request.Builder<InitiateMultipartUploadRequest, Builder> {
        private String key; 
        private String cacheControl; 
        private String contentDisposition; 
        private String contentEncoding; 
        private String expires; 
        private String bucket; 
        private String encodingType; 
        private String forbidOverwrite; 
        private String sseDataEncryption; 
        private String serverSideEncryption; 
        private String sseKeyId; 
        private String storageClass; 
        private String tagging; 

        private Builder() {
            super();
        } 

        private Builder(InitiateMultipartUploadRequest request) {
            super(request);
            this.key = request.key;
            this.cacheControl = request.cacheControl;
            this.contentDisposition = request.contentDisposition;
            this.contentEncoding = request.contentEncoding;
            this.expires = request.expires;
            this.bucket = request.bucket;
            this.encodingType = request.encodingType;
            this.forbidOverwrite = request.forbidOverwrite;
            this.sseDataEncryption = request.sseDataEncryption;
            this.serverSideEncryption = request.serverSideEncryption;
            this.sseKeyId = request.sseKeyId;
            this.storageClass = request.storageClass;
            this.tagging = request.tagging;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * Cache-Control.
         */
        public Builder cacheControl(String cacheControl) {
            this.putHeaderParameter("Cache-Control", cacheControl);
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * Content-Disposition.
         */
        public Builder contentDisposition(String contentDisposition) {
            this.putHeaderParameter("Content-Disposition", contentDisposition);
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * Content-Encoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putHeaderParameter("Content-Encoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Expires.
         */
        public Builder expires(String expires) {
            this.putHeaderParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * encoding-type.
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * encoding-type.
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType.getValue());
            this.encodingType = encodingType.getValue();
            return this;
        }

        /**
         * x-oss-forbid-overwrite.
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        /**
         * x-oss-server-side-data-encryption.
         */
        public Builder sseDataEncryption(String sseDataEncryption) {
            this.putHeaderParameter("x-oss-server-side-data-encryption", sseDataEncryption);
            this.sseDataEncryption = sseDataEncryption;
            return this;
        }

        /**
         * x-oss-server-side-encryption.
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.putHeaderParameter("x-oss-server-side-encryption", serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * x-oss-server-side-encryption-key-id.
         */
        public Builder sseKeyId(String sseKeyId) {
            this.putHeaderParameter("x-oss-server-side-encryption-key-id", sseKeyId);
            this.sseKeyId = sseKeyId;
            return this;
        }

        /**
         * x-oss-storage-class.
         */
        public Builder storageClass(String storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        /**
         * x-oss-storage-class.
         */
        public Builder storageClass(StorageClass storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass.getValue());
            this.storageClass = storageClass.getValue();
            return this;
        }

        /**
         * x-oss-tagging.
         */
        public Builder tagging(String tagging) {
            this.putHeaderParameter("x-oss-tagging", tagging);
            this.tagging = tagging;
            return this;
        }

        @Override
        public InitiateMultipartUploadRequest build() {
            return new InitiateMultipartUploadRequest(this);
        } 

    } 

}
