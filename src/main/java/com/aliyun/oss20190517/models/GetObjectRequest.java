// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetObjectRequest} extends {@link RequestModel}
 *
 * <p>GetObjectRequest</p>
 */
public class GetObjectRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("Accept-Encoding")
    private String acceptEncoding;

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

    @Header
    @NameInMap("Range")
    private String range;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("response-cache-control")
    private String responseCacheControl;

    @Query
    @NameInMap("response-content-disposition")
    private String responseContentDisposition;

    @Query
    @NameInMap("response-content-encoding")
    private String responseContentEncoding;

    @Query
    @NameInMap("response-content-language")
    private String responseContentLanguage;

    @Query
    @NameInMap("response-content-type")
    private String responseContentType;

    @Query
    @NameInMap("response-expires")
    private String responseExpires;


    private GetObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.acceptEncoding = builder.acceptEncoding;
        this.ifMatch = builder.ifMatch;
        this.ifModifiedSince = builder.ifModifiedSince;
        this.ifNoneMatch = builder.ifNoneMatch;
        this.ifUnmodifiedSince = builder.ifUnmodifiedSince;
        this.range = builder.range;
        this.bucket = builder.bucket;
        this.responseCacheControl = builder.responseCacheControl;
        this.responseContentDisposition = builder.responseContentDisposition;
        this.responseContentEncoding = builder.responseContentEncoding;
        this.responseContentLanguage = builder.responseContentLanguage;
        this.responseContentType = builder.responseContentType;
        this.responseExpires = builder.responseExpires;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return acceptEncoding
     */
    public String getAcceptEncoding() {
        return this.acceptEncoding;
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
     * @return range
     */
    public String getRange() {
        return this.range;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return responseCacheControl
     */
    public String getResponseCacheControl() {
        return this.responseCacheControl;
    }

    /**
     * @return responseContentDisposition
     */
    public String getResponseContentDisposition() {
        return this.responseContentDisposition;
    }

    /**
     * @return responseContentEncoding
     */
    public String getResponseContentEncoding() {
        return this.responseContentEncoding;
    }

    /**
     * @return responseContentLanguage
     */
    public String getResponseContentLanguage() {
        return this.responseContentLanguage;
    }

    /**
     * @return responseContentType
     */
    public String getResponseContentType() {
        return this.responseContentType;
    }

    /**
     * @return responseExpires
     */
    public String getResponseExpires() {
        return this.responseExpires;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String acceptEncoding; 
        private String ifMatch; 
        private String ifModifiedSince; 
        private String ifNoneMatch; 
        private String ifUnmodifiedSince; 
        private String range; 
        private String bucket; 
        private String responseCacheControl; 
        private String responseContentDisposition; 
        private String responseContentEncoding; 
        private String responseContentLanguage; 
        private String responseContentType; 
        private String responseExpires; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>Accept-Encoding.</p>
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("Accept-Encoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
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
         * <p>Range.</p>
         */
        public Builder range(String range) {
            this.putHeaderParameter("Range", range);
            this.range = range;
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
         * <p>response-cache-control.</p>
         */
        public Builder responseCacheControl(String responseCacheControl) {
            this.putQueryParameter("response-cache-control", responseCacheControl);
            this.responseCacheControl = responseCacheControl;
            return this;
        }

        /**
         * <p>response-content-disposition.</p>
         */
        public Builder responseContentDisposition(String responseContentDisposition) {
            this.putQueryParameter("response-content-disposition", responseContentDisposition);
            this.responseContentDisposition = responseContentDisposition;
            return this;
        }

        /**
         * <p>response-content-encoding.</p>
         */
        public Builder responseContentEncoding(String responseContentEncoding) {
            this.putQueryParameter("response-content-encoding", responseContentEncoding);
            this.responseContentEncoding = responseContentEncoding;
            return this;
        }

        /**
         * <p>response-content-language.</p>
         */
        public Builder responseContentLanguage(String responseContentLanguage) {
            this.putQueryParameter("response-content-language", responseContentLanguage);
            this.responseContentLanguage = responseContentLanguage;
            return this;
        }

        /**
         * <p>response-content-type.</p>
         */
        public Builder responseContentType(String responseContentType) {
            this.putQueryParameter("response-content-type", responseContentType);
            this.responseContentType = responseContentType;
            return this;
        }

        /**
         * <p>response-expires.</p>
         */
        public Builder responseExpires(String responseExpires) {
            this.putQueryParameter("response-expires", responseExpires);
            this.responseExpires = responseExpires;
            return this;
        }

        public GetObjectRequest build() {
            return new GetObjectRequest(this);
        } 

    } 

}
