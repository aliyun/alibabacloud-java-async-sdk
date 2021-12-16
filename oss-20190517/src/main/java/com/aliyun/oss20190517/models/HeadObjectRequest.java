// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link HeadObjectRequest} extends {@link RequestModel}
 *
 * <p>HeadObjectRequest</p>
 */
public class HeadObjectRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Header
    @NameInMap("If-Modified-Since")
    private String ifModifiedSince;

    @Header
    @NameInMap("If-None-Match")
    private String ifNoneMatch;

    @Header
    @NameInMap("If-Unmodified-Since")
    private String ifUnmodifiedSince;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("versionId")
    private String versionId;


    private HeadObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.ifMatch = builder.ifMatch;
        this.ifModifiedSince = builder.ifModifiedSince;
        this.ifNoneMatch = builder.ifNoneMatch;
        this.ifUnmodifiedSince = builder.ifUnmodifiedSince;
        this.bucket = builder.bucket;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HeadObjectRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return ifModifiedSince
     */
    public String getIfModifiedSince() {
        return this.ifModifiedSince;
    }

    /**
     * @return ifNoneMatch
     */
    public String getIfNoneMatch() {
        return this.ifNoneMatch;
    }

    /**
     * @return ifUnmodifiedSince
     */
    public String getIfUnmodifiedSince() {
        return this.ifUnmodifiedSince;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String ifMatch; 
        private String ifModifiedSince; 
        private String ifNoneMatch; 
        private String ifUnmodifiedSince; 
        private String bucket; 
        private String versionId; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>If-Match.</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * <p>If-Modified-Since.</p>
         */
        public Builder ifModifiedSince(String ifModifiedSince) {
            this.putHeaderParameter("If-Modified-Since", ifModifiedSince);
            this.ifModifiedSince = ifModifiedSince;
            return this;
        }

        /**
         * <p>If-None-Match.</p>
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.putHeaderParameter("If-None-Match", ifNoneMatch);
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * <p>If-Unmodified-Since.</p>
         */
        public Builder ifUnmodifiedSince(String ifUnmodifiedSince) {
            this.putHeaderParameter("If-Unmodified-Since", ifUnmodifiedSince);
            this.ifUnmodifiedSince = ifUnmodifiedSince;
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
         * <p>versionId.</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        public HeadObjectRequest build() {
            return new HeadObjectRequest(this);
        } 

    } 

}
