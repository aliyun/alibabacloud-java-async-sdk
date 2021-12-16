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
    @Path
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Header
    @NameInMap("x-oss-copy-source")
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
    private String sse;

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
    private String xOssTaggingDirective;


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
        this.sse = builder.sse;
        this.sseKeyId = builder.sseKeyId;
        this.storageClass = builder.storageClass;
        this.tagging = builder.tagging;
        this.xOssTaggingDirective = builder.xOssTaggingDirective;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyObjectRequest create() {
        return builder().build();
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
     * @return sse
     */
    public String getSse() {
        return this.sse;
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
     * @return xOssTaggingDirective
     */
    public String getXOssTaggingDirective() {
        return this.xOssTaggingDirective;
    }

    public static final class Builder extends Request.Builder<Builder> {
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
        private String sse; 
        private String sseKeyId; 
        private String storageClass; 
        private String tagging; 
        private String xOssTaggingDirective; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
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
         * <p>x-oss-copy-source.</p>
         */
        public Builder copySource(String copySource) {
            this.putHeaderParameter("x-oss-copy-source", copySource);
            this.copySource = copySource;
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
         * <p>x-oss-copy-source-if-modified-since.</p>
         */
        public Builder copySourceIfModifiedSince(String copySourceIfModifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-modified-since", copySourceIfModifiedSince);
            this.copySourceIfModifiedSince = copySourceIfModifiedSince;
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
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
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
         * <p>x-oss-metadata-directive.</p>
         */
        public Builder metadataDirective(String metadataDirective) {
            this.putHeaderParameter("x-oss-metadata-directive", metadataDirective);
            this.metadataDirective = metadataDirective;
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

        /**
         * <p>x-oss-tagging-directive.</p>
         */
        public Builder xOssTaggingDirective(String xOssTaggingDirective) {
            this.putHeaderParameter("x-oss-tagging-directive", xOssTaggingDirective);
            this.xOssTaggingDirective = xOssTaggingDirective;
            return this;
        }

        public CopyObjectRequest build() {
            return new CopyObjectRequest(this);
        } 

    } 

}
