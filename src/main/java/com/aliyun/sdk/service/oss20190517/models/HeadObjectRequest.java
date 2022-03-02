// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link HeadObjectRequest} extends {@link RequestModel}
 *
 * <p>HeadObjectRequest</p>
 */
public class HeadObjectRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
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
    @Validation(required = true)
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

    public static final class Builder extends Request.Builder<HeadObjectRequest, Builder> {
        private String key; 
        private String ifMatch; 
        private String ifModifiedSince; 
        private String ifNoneMatch; 
        private String ifUnmodifiedSince; 
        private String bucket; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(HeadObjectRequest request) {
            super(request);
            this.key = request.key;
            this.ifMatch = request.ifMatch;
            this.ifModifiedSince = request.ifModifiedSince;
            this.ifNoneMatch = request.ifNoneMatch;
            this.ifUnmodifiedSince = request.ifUnmodifiedSince;
            this.bucket = request.bucket;
            this.versionId = request.versionId;
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
         * If-Match.
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * If-Modified-Since.
         */
        public Builder ifModifiedSince(String ifModifiedSince) {
            this.putHeaderParameter("If-Modified-Since", ifModifiedSince);
            this.ifModifiedSince = ifModifiedSince;
            return this;
        }

        /**
         * If-None-Match.
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.putHeaderParameter("If-None-Match", ifNoneMatch);
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * If-Unmodified-Since.
         */
        public Builder ifUnmodifiedSince(String ifUnmodifiedSince) {
            this.putHeaderParameter("If-Unmodified-Since", ifUnmodifiedSince);
            this.ifUnmodifiedSince = ifUnmodifiedSince;
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
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public HeadObjectRequest build() {
            return new HeadObjectRequest(this);
        } 

    } 

}
