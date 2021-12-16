// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutObjectRequest} extends {@link RequestModel}
 *
 * <p>PutObjectRequest</p>
 */
public class PutObjectRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private Boolean forbidOverwrite;

    @Header
    @NameInMap("x-oss-meta-*")
    private java.util.Map < String, String > metaData;

    @Header
    @NameInMap("x-oss-object-acl")
    private ObjectACL acl;

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
    public ObjectACL getAcl() {
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
        private java.io.InputStream body; 
        private String bucket; 
        private Boolean forbidOverwrite; 
        private java.util.Map < String, String > metaData; 
        private ObjectACL acl; 
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
         * <p>body.</p>
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder forbidOverwrite(Boolean forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        /**
         * <p>x-oss-meta-*.</p>
         */
        public Builder metaData(java.util.Map < String, String > metaData) {
            this.putHeaderParameter("x-oss-meta-*", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>x-oss-object-acl.</p>
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
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

        public PutObjectRequest build() {
            return new PutObjectRequest(this);
        } 

    } 

}
