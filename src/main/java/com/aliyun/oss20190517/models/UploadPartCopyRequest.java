// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UploadPartCopyRequest} extends {@link RequestModel}
 *
 * <p>UploadPartCopyRequest</p>
 */
public class UploadPartCopyRequest extends Request {
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

    @Query
    @NameInMap("partNumber")
    private String partNumber;

    @Query
    @NameInMap("uploadId")
    private String uploadId;

    @Header
    @NameInMap("x-oss-copy-source-range")
    private String xOssCopySourceRange;

    @Header
    @NameInMap("x-oss-copy-source-if-match")
    private String xOssCopySourceIfMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-none-match")
    private String xOssCopySourceIfNoneMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-unmodified-since")
    private String xOssCopySourceIfUnmodifiedSince;

    @Header
    @NameInMap("x-oss-copy-source-if-modified-since")
    private String xOssCopySourceIfModifiedSince;


    private UploadPartCopyRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.sourceBucket = builder.sourceBucket;
        this.sourceKey = builder.sourceKey;
        this.partNumber = builder.partNumber;
        this.uploadId = builder.uploadId;
        this.xOssCopySourceRange = builder.xOssCopySourceRange;
        this.xOssCopySourceIfMatch = builder.xOssCopySourceIfMatch;
        this.xOssCopySourceIfNoneMatch = builder.xOssCopySourceIfNoneMatch;
        this.xOssCopySourceIfUnmodifiedSince = builder.xOssCopySourceIfUnmodifiedSince;
        this.xOssCopySourceIfModifiedSince = builder.xOssCopySourceIfModifiedSince;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartCopyRequest create() {
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
     * @return partNumber
     */
    public String partNumber() {
        return this.partNumber;
    }

    /**
     * @return uploadId
     */
    public String uploadId() {
        return this.uploadId;
    }

    /**
     * @return xOssCopySourceRange
     */
    public String xOssCopySourceRange() {
        return this.xOssCopySourceRange;
    }

    /**
     * @return xOssCopySourceIfMatch
     */
    public String xOssCopySourceIfMatch() {
        return this.xOssCopySourceIfMatch;
    }

    /**
     * @return xOssCopySourceIfNoneMatch
     */
    public String xOssCopySourceIfNoneMatch() {
        return this.xOssCopySourceIfNoneMatch;
    }

    /**
     * @return xOssCopySourceIfUnmodifiedSince
     */
    public String xOssCopySourceIfUnmodifiedSince() {
        return this.xOssCopySourceIfUnmodifiedSince;
    }

    /**
     * @return xOssCopySourceIfModifiedSince
     */
    public String xOssCopySourceIfModifiedSince() {
        return this.xOssCopySourceIfModifiedSince;
    }

    public static final class Builder extends Request.Builder<UploadPartCopyRequest.Builder> {
        private String bucket; 
        private String key; 
        private String sourceBucket; 
        private String sourceKey; 
        private String partNumber; 
        private String uploadId; 
        private String xOssCopySourceRange; 
        private String xOssCopySourceIfMatch; 
        private String xOssCopySourceIfNoneMatch; 
        private String xOssCopySourceIfUnmodifiedSince; 
        private String xOssCopySourceIfModifiedSince; 

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
         * <p>partNumber.</p>
         */
        public Builder partNumber(String partNumber) {
            this.putQueryParameter("partNumber", partNumber);
            this.partNumber = partNumber;
            return this;
        }

        /**
         * <p>uploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>x-oss-copy-source-range.</p>
         */
        public Builder xOssCopySourceRange(String xOssCopySourceRange) {
            this.putHeaderParameter("x-oss-copy-source-range", xOssCopySourceRange);
            this.xOssCopySourceRange = xOssCopySourceRange;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-match.</p>
         */
        public Builder xOssCopySourceIfMatch(String xOssCopySourceIfMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-match", xOssCopySourceIfMatch);
            this.xOssCopySourceIfMatch = xOssCopySourceIfMatch;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-none-match.</p>
         */
        public Builder xOssCopySourceIfNoneMatch(String xOssCopySourceIfNoneMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-none-match", xOssCopySourceIfNoneMatch);
            this.xOssCopySourceIfNoneMatch = xOssCopySourceIfNoneMatch;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-unmodified-since.</p>
         */
        public Builder xOssCopySourceIfUnmodifiedSince(String xOssCopySourceIfUnmodifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-unmodified-since", xOssCopySourceIfUnmodifiedSince);
            this.xOssCopySourceIfUnmodifiedSince = xOssCopySourceIfUnmodifiedSince;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-modified-since.</p>
         */
        public Builder xOssCopySourceIfModifiedSince(String xOssCopySourceIfModifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-modified-since", xOssCopySourceIfModifiedSince);
            this.xOssCopySourceIfModifiedSince = xOssCopySourceIfModifiedSince;
            return this;
        }

        public UploadPartCopyRequest build() {
            return new UploadPartCopyRequest(this);
        } 

    } 

}
