// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutObjectRequest} extends {@link RequestModel}
 *
 * <p>PutObjectRequest</p>
 */
public class PutObjectRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private Boolean forbidOverwrite;

    @Header
    @NameInMap("x-oss-meta-*")
    private java.util.Map < String, String > metaData;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

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

    private PutObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.body = builder.body;
        this.bucket = builder.bucket;
        this.forbidOverwrite = builder.forbidOverwrite;
        this.metaData = builder.metaData;
        this.acl = builder.acl;
        this.sseDataEncryption = builder.sseDataEncryption;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.sseKeyId = builder.sseKeyId;
        this.storageClass = builder.storageClass;
        this.tagging = builder.tagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectRequest create() {
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
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return forbidOverwrite
     */
    public Boolean getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return metaData
     */
    public java.util.Map < String, String > getMetaData() {
        return this.metaData;
    }

    /**
     * @return acl
     */
    public String getAcl() {
        return this.acl;
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

    public static final class Builder extends Request.Builder<PutObjectRequest, Builder> {
        private String key; 
        private java.io.InputStream body; 
        private String bucket; 
        private Boolean forbidOverwrite; 
        private java.util.Map < String, String > metaData; 
        private String acl; 
        private String sseDataEncryption; 
        private String serverSideEncryption; 
        private String sseKeyId; 
        private String storageClass; 
        private String tagging; 

        private Builder() {
            super();
        } 

        private Builder(PutObjectRequest request) {
            super(request);
            this.key = request.key;
            this.body = request.body;
            this.bucket = request.bucket;
            this.forbidOverwrite = request.forbidOverwrite;
            this.metaData = request.metaData;
            this.acl = request.acl;
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
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
         * x-oss-forbid-overwrite.
         */
        public Builder forbidOverwrite(Boolean forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        /**
         * x-oss-meta-*.
         */
        public Builder metaData(java.util.Map < String, String > metaData) {
            this.putHeaderParameter("x-oss-meta-*", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * x-oss-object-acl.
         */
        public Builder acl(String acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * x-oss-object-acl.
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl.getValue());
            this.acl = acl.getValue();
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
        public PutObjectRequest build() {
            return new PutObjectRequest(this);
        } 

    } 

}
