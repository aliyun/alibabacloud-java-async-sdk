// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CopyObjectRequest} extends {@link RequestModel}
 *
 * <p>CopyObjectRequest</p>
 */
public class CopyObjectRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Header
    @NameInMap("x-oss-copy-source")
    @Validation(required = true)
    private String copySource;

    @Header
    @NameInMap("x-oss-copy-source-if-match")
    private String copySourceIfMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-modified-since")
    private String copySourceIfModifiedSince;

    @Header
    @NameInMap("x-oss-copy-source-if-none-match")
    private String copySourceIfNoneMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-unmodified-since")
    private String copySourceIfUnmodifiedSince;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String forbidOverwrite;

    @Header
    @NameInMap("x-oss-meta-*")
    private java.util.Map < String, String > metaData;

    @Header
    @NameInMap("x-oss-metadata-directive")
    private String metadataDirective;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

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

    @Header
    @NameInMap("x-oss-tagging-directive")
    private String taggingDirective;

    private CopyObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.copySource = builder.copySource;
        this.copySourceIfMatch = builder.copySourceIfMatch;
        this.copySourceIfModifiedSince = builder.copySourceIfModifiedSince;
        this.copySourceIfNoneMatch = builder.copySourceIfNoneMatch;
        this.copySourceIfUnmodifiedSince = builder.copySourceIfUnmodifiedSince;
        this.forbidOverwrite = builder.forbidOverwrite;
        this.metaData = builder.metaData;
        this.metadataDirective = builder.metadataDirective;
        this.acl = builder.acl;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.sseKeyId = builder.sseKeyId;
        this.storageClass = builder.storageClass;
        this.tagging = builder.tagging;
        this.taggingDirective = builder.taggingDirective;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyObjectRequest create() {
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
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return copySource
     */
    public String getCopySource() {
        return this.copySource;
    }

    /**
     * @return copySourceIfMatch
     */
    public String getCopySourceIfMatch() {
        return this.copySourceIfMatch;
    }

    /**
     * @return copySourceIfModifiedSince
     */
    public String getCopySourceIfModifiedSince() {
        return this.copySourceIfModifiedSince;
    }

    /**
     * @return copySourceIfNoneMatch
     */
    public String getCopySourceIfNoneMatch() {
        return this.copySourceIfNoneMatch;
    }

    /**
     * @return copySourceIfUnmodifiedSince
     */
    public String getCopySourceIfUnmodifiedSince() {
        return this.copySourceIfUnmodifiedSince;
    }

    /**
     * @return forbidOverwrite
     */
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return metaData
     */
    public java.util.Map < String, String > getMetaData() {
        return this.metaData;
    }

    /**
     * @return metadataDirective
     */
    public String getMetadataDirective() {
        return this.metadataDirective;
    }

    /**
     * @return acl
     */
    public String getAcl() {
        return this.acl;
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

    /**
     * @return taggingDirective
     */
    public String getTaggingDirective() {
        return this.taggingDirective;
    }

    public static final class Builder extends Request.Builder<CopyObjectRequest, Builder> {
        private String key; 
        private String bucket; 
        private String copySource; 
        private String copySourceIfMatch; 
        private String copySourceIfModifiedSince; 
        private String copySourceIfNoneMatch; 
        private String copySourceIfUnmodifiedSince; 
        private String forbidOverwrite; 
        private java.util.Map < String, String > metaData; 
        private String metadataDirective; 
        private String acl; 
        private String serverSideEncryption; 
        private String sseKeyId; 
        private String storageClass; 
        private String tagging; 
        private String taggingDirective; 

        private Builder() {
            super();
        } 

        private Builder(CopyObjectRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
            this.copySource = request.copySource;
            this.copySourceIfMatch = request.copySourceIfMatch;
            this.copySourceIfModifiedSince = request.copySourceIfModifiedSince;
            this.copySourceIfNoneMatch = request.copySourceIfNoneMatch;
            this.copySourceIfUnmodifiedSince = request.copySourceIfUnmodifiedSince;
            this.forbidOverwrite = request.forbidOverwrite;
            this.metaData = request.metaData;
            this.metadataDirective = request.metadataDirective;
            this.acl = request.acl;
            this.serverSideEncryption = request.serverSideEncryption;
            this.sseKeyId = request.sseKeyId;
            this.storageClass = request.storageClass;
            this.tagging = request.tagging;
            this.taggingDirective = request.taggingDirective;
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
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * x-oss-copy-source.
         */
        public Builder copySource(String copySource) {
            this.putHeaderParameter("x-oss-copy-source", copySource);
            this.copySource = copySource;
            return this;
        }

        /**
         * x-oss-copy-source-if-match.
         */
        public Builder copySourceIfMatch(String copySourceIfMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-match", copySourceIfMatch);
            this.copySourceIfMatch = copySourceIfMatch;
            return this;
        }

        /**
         * x-oss-copy-source-if-modified-since.
         */
        public Builder copySourceIfModifiedSince(String copySourceIfModifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-modified-since", copySourceIfModifiedSince);
            this.copySourceIfModifiedSince = copySourceIfModifiedSince;
            return this;
        }

        /**
         * x-oss-copy-source-if-none-match.
         */
        public Builder copySourceIfNoneMatch(String copySourceIfNoneMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-none-match", copySourceIfNoneMatch);
            this.copySourceIfNoneMatch = copySourceIfNoneMatch;
            return this;
        }

        /**
         * x-oss-copy-source-if-unmodified-since.
         */
        public Builder copySourceIfUnmodifiedSince(String copySourceIfUnmodifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-unmodified-since", copySourceIfUnmodifiedSince);
            this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
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
         * x-oss-meta-*.
         */
        public Builder metaData(java.util.Map < String, String > metaData) {
            this.putHeaderParameter("x-oss-meta-*", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * x-oss-metadata-directive.
         */
        public Builder metadataDirective(String metadataDirective) {
            this.putHeaderParameter("x-oss-metadata-directive", metadataDirective);
            this.metadataDirective = metadataDirective;
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

        /**
         * x-oss-tagging-directive.
         */
        public Builder taggingDirective(String taggingDirective) {
            this.putHeaderParameter("x-oss-tagging-directive", taggingDirective);
            this.taggingDirective = taggingDirective;
            return this;
        }

        @Override
        public CopyObjectRequest build() {
            return new CopyObjectRequest(this);
        } 

    } 

}
