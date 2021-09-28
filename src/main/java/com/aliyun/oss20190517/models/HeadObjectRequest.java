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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("If-Modified-Since")
    private String ifModifiedSince;

    @Header
    @NameInMap("If-Unmodified-Since")
    private String ifUnmodifiedSince;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Header
    @NameInMap("If-None-Match")
    private String ifNoneMatch;


    private HeadObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.ifModifiedSince = builder.ifModifiedSince;
        this.ifUnmodifiedSince = builder.ifUnmodifiedSince;
        this.ifMatch = builder.ifMatch;
        this.ifNoneMatch = builder.ifNoneMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HeadObjectRequest create() {
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
     * @return ifModifiedSince
     */
    public String ifModifiedSince() {
        return this.ifModifiedSince;
    }

    /**
     * @return ifUnmodifiedSince
     */
    public String ifUnmodifiedSince() {
        return this.ifUnmodifiedSince;
    }

    /**
     * @return ifMatch
     */
    public String ifMatch() {
        return this.ifMatch;
    }

    /**
     * @return ifNoneMatch
     */
    public String ifNoneMatch() {
        return this.ifNoneMatch;
    }

    public static final class Builder extends Request.Builder<HeadObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private String ifModifiedSince; 
        private String ifUnmodifiedSince; 
        private String ifMatch; 
        private String ifNoneMatch; 

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
         * <p>If-Modified-Since.</p>
         */
        public Builder ifModifiedSince(String ifModifiedSince) {
            this.putHeaderParameter("If-Modified-Since", ifModifiedSince);
            this.ifModifiedSince = ifModifiedSince;
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
         * <p>If-Match.</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
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

        public HeadObjectRequest build() {
            return new HeadObjectRequest(this);
        } 

    } 

}
