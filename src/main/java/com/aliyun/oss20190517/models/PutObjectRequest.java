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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private Boolean forbidOverwrite;

    @Header
    @NameInMap("x-oss-server-side-encryption")
    private String sse;

    @Header
    @NameInMap("x-oss-server-side-data-encryption")
    private String sseDataEncryption;

    @Header
    @NameInMap("x-oss-server-side-encryption-key-id")
    private String sseKeyId;

    @Header
    @NameInMap("x-oss-object-acl")
    private ObjectACL acl;

    @Header
    @NameInMap("x-oss-storage-class")
    private StorageClass storageClass;

    @Header
    @NameInMap("x-oss-tagging")
    private String tagging;

    @Header
    @NameInMap("x-oss-meta-*")
    private java.util.Map < String, String > userMetadata;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;


    private PutObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.forbidOverwrite = builder.forbidOverwrite;
        this.sse = builder.sse;
        this.sseDataEncryption = builder.sseDataEncryption;
        this.sseKeyId = builder.sseKeyId;
        this.acl = builder.acl;
        this.storageClass = builder.storageClass;
        this.tagging = builder.tagging;
        this.userMetadata = builder.userMetadata;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectRequest create() {
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
     * @return forbidOverwrite
     */
    public Boolean forbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return sse
     */
    public String sse() {
        return this.sse;
    }

    /**
     * @return sseDataEncryption
     */
    public String sseDataEncryption() {
        return this.sseDataEncryption;
    }

    /**
     * @return sseKeyId
     */
    public String sseKeyId() {
        return this.sseKeyId;
    }

    /**
     * @return acl
     */
    public ObjectACL acl() {
        return this.acl;
    }

    /**
     * @return storageClass
     */
    public StorageClass storageClass() {
        return this.storageClass;
    }

    /**
     * @return tagging
     */
    public String tagging() {
        return this.tagging;
    }

    /**
     * @return userMetadata
     */
    public java.util.Map < String, String > userMetadata() {
        return this.userMetadata;
    }

    /**
     * @return body
     */
    public java.io.InputStream body() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PutObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private Boolean forbidOverwrite; 
        private String sse; 
        private String sseDataEncryption; 
        private String sseKeyId; 
        private ObjectACL acl; 
        private StorageClass storageClass; 
        private String tagging; 
        private java.util.Map < String, String > userMetadata; 
        private java.io.InputStream body; 

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
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder forbidOverwrite(Boolean forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        /**
         * <p>x-oss-server-side-encryption.</p>
         */
        public Builder sse(String sse) {
            this.putHeaderParameter("x-oss-server-side-encryption", sse);
            this.sse = sse;
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
         * <p>x-oss-server-side-encryption-key-id.</p>
         */
        public Builder sseKeyId(String sseKeyId) {
            this.putHeaderParameter("x-oss-server-side-encryption-key-id", sseKeyId);
            this.sseKeyId = sseKeyId;
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

        /**
         * <p>x-oss-meta-*.</p>
         */
        public Builder userMetadata(java.util.Map < String, String > userMetadata) {
            this.putHeaderParameter("x-oss-meta-*", userMetadata);
            this.userMetadata = userMetadata;
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

        public PutObjectRequest build() {
            return new PutObjectRequest(this);
        } 

    } 

}
