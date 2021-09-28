// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CopyObjectRequest} extends {@link RequestModel}
 *
 * <p>CopyObjectRequest</p>
 */
public class CopyObjectRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("source-bucket")
    private String sourceBucket;

    @Header
    @NameInMap("source-key")
    private String sourceKey;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String forbidOverwrite;

    @Header
    @NameInMap("x-oss-copy-source-if-match")
    private String copySourceIfMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-none-match")
    private String copySourceIfNoneMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-unmodified-since")
    private String copySourceIfUnmodifiedSince;

    @Header
    @NameInMap("x-oss-copy-source-if-modified-since")
    private String copySourceIfModifiedSince;

    @Header
    @NameInMap("x-oss-metadata-directive")
    private String metadataDirective;

    @Header
    @NameInMap("x-oss-server-side-encryption")
    private String sse;

    @Header
    @NameInMap("x-oss-server-side-encryption-key-id")
    private String sseKeyId;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

    @Header
    @NameInMap("x-oss-storage-class")
    private String storageClass;

    @Header
    @NameInMap("x-oss-tagging")
    private String tagging;


    private CopyObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.sourceBucket = builder.sourceBucket;
        this.sourceKey = builder.sourceKey;
        this.forbidOverwrite = builder.forbidOverwrite;
        this.copySourceIfMatch = builder.copySourceIfMatch;
        this.copySourceIfNoneMatch = builder.copySourceIfNoneMatch;
        this.copySourceIfUnmodifiedSince = builder.copySourceIfUnmodifiedSince;
        this.copySourceIfModifiedSince = builder.copySourceIfModifiedSince;
        this.metadataDirective = builder.metadataDirective;
        this.sse = builder.sse;
        this.sseKeyId = builder.sseKeyId;
        this.acl = builder.acl;
        this.storageClass = builder.storageClass;
        this.tagging = builder.tagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyObjectRequest create() {
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
     * @return sourceBucket
     */
    public String sourceBucket() {
        return this.sourceBucket;
    }

    /**
     * @return sourceKey
     */
    public String sourceKey() {
        return this.sourceKey;
    }

    /**
     * @return forbidOverwrite
     */
    public String forbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return copySourceIfMatch
     */
    public String copySourceIfMatch() {
        return this.copySourceIfMatch;
    }

    /**
     * @return copySourceIfNoneMatch
     */
    public String copySourceIfNoneMatch() {
        return this.copySourceIfNoneMatch;
    }

    /**
     * @return copySourceIfUnmodifiedSince
     */
    public String copySourceIfUnmodifiedSince() {
        return this.copySourceIfUnmodifiedSince;
    }

    /**
     * @return copySourceIfModifiedSince
     */
    public String copySourceIfModifiedSince() {
        return this.copySourceIfModifiedSince;
    }

    /**
     * @return metadataDirective
     */
    public String metadataDirective() {
        return this.metadataDirective;
    }

    /**
     * @return sse
     */
    public String sse() {
        return this.sse;
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
    public String acl() {
        return this.acl;
    }

    /**
     * @return storageClass
     */
    public String storageClass() {
        return this.storageClass;
    }

    /**
     * @return tagging
     */
    public String tagging() {
        return this.tagging;
    }

    public static final class Builder extends Request.Builder<CopyObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private String sourceBucket; 
        private String sourceKey; 
        private String forbidOverwrite; 
        private String copySourceIfMatch; 
        private String copySourceIfNoneMatch; 
        private String copySourceIfUnmodifiedSince; 
        private String copySourceIfModifiedSince; 
        private String metadataDirective; 
        private String sse; 
        private String sseKeyId; 
        private String acl; 
        private String storageClass; 
        private String tagging; 

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
         * <p>source-bucket.</p>
         */
        public Builder sourceBucket(String sourceBucket) {
            this.putHeaderParameter("source-bucket", sourceBucket);
            this.sourceBucket = sourceBucket;
            return this;
        }

        /**
         * <p>source-key.</p>
         */
        public Builder sourceKey(String sourceKey) {
            this.putHeaderParameter("source-key", sourceKey);
            this.sourceKey = sourceKey;
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
         * <p>x-oss-copy-source-if-match.</p>
         */
        public Builder copySourceIfMatch(String copySourceIfMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-match", copySourceIfMatch);
            this.copySourceIfMatch = copySourceIfMatch;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-none-match.</p>
         */
        public Builder copySourceIfNoneMatch(String copySourceIfNoneMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-none-match", copySourceIfNoneMatch);
            this.copySourceIfNoneMatch = copySourceIfNoneMatch;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-unmodified-since.</p>
         */
        public Builder copySourceIfUnmodifiedSince(String copySourceIfUnmodifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-unmodified-since", copySourceIfUnmodifiedSince);
            this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-modified-since.</p>
         */
        public Builder copySourceIfModifiedSince(String copySourceIfModifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-modified-since", copySourceIfModifiedSince);
            this.copySourceIfModifiedSince = copySourceIfModifiedSince;
            return this;
        }

        /**
         * <p>x-oss-metadata-directive.</p>
         */
        public Builder metadataDirective(String metadataDirective) {
            this.putHeaderParameter("x-oss-metadata-directive", metadataDirective);
            this.metadataDirective = metadataDirective;
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
        public Builder acl(String acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>x-oss-storage-class.</p>
         */
        public Builder storageClass(String storageClass) {
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

        public CopyObjectRequest build() {
            return new CopyObjectRequest(this);
        } 

    } 

}
