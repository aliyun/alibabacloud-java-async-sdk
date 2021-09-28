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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("response-content-type")
    private String responseContentType;

    @Query
    @NameInMap("response-content-language")
    private String responseContentLanguage;

    @Query
    @NameInMap("response-expires")
    private String responseExpires;

    @Query
    @NameInMap("response-cache-control")
    private String responseCacheControl;

    @Query
    @NameInMap("response-content-disposition")
    private String responseContentDisposition;

    @Query
    @NameInMap("response-content-encoding")
    private String responseContentEncoding;

    @Header
    @NameInMap("Range")
    private String range;

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

    @Header
    @NameInMap("Accept-Encoding")
    private String acceptEncoding;


    private GetObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.responseContentType = builder.responseContentType;
        this.responseContentLanguage = builder.responseContentLanguage;
        this.responseExpires = builder.responseExpires;
        this.responseCacheControl = builder.responseCacheControl;
        this.responseContentDisposition = builder.responseContentDisposition;
        this.responseContentEncoding = builder.responseContentEncoding;
        this.range = builder.range;
        this.ifModifiedSince = builder.ifModifiedSince;
        this.ifUnmodifiedSince = builder.ifUnmodifiedSince;
        this.ifMatch = builder.ifMatch;
        this.ifNoneMatch = builder.ifNoneMatch;
        this.acceptEncoding = builder.acceptEncoding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectRequest create() {
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
     * @return responseContentType
     */
    public String responseContentType() {
        return this.responseContentType;
    }

    /**
     * @return responseContentLanguage
     */
    public String responseContentLanguage() {
        return this.responseContentLanguage;
    }

    /**
     * @return responseExpires
     */
    public String responseExpires() {
        return this.responseExpires;
    }

    /**
     * @return responseCacheControl
     */
    public String responseCacheControl() {
        return this.responseCacheControl;
    }

    /**
     * @return responseContentDisposition
     */
    public String responseContentDisposition() {
        return this.responseContentDisposition;
    }

    /**
     * @return responseContentEncoding
     */
    public String responseContentEncoding() {
        return this.responseContentEncoding;
    }

    /**
     * @return range
     */
    public String range() {
        return this.range;
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

    /**
     * @return acceptEncoding
     */
    public String acceptEncoding() {
        return this.acceptEncoding;
    }

    public static final class Builder extends Request.Builder<GetObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private String responseContentType; 
        private String responseContentLanguage; 
        private String responseExpires; 
        private String responseCacheControl; 
        private String responseContentDisposition; 
        private String responseContentEncoding; 
        private String range; 
        private String ifModifiedSince; 
        private String ifUnmodifiedSince; 
        private String ifMatch; 
        private String ifNoneMatch; 
        private String acceptEncoding; 

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
         * <p>response-content-type.</p>
         */
        public Builder responseContentType(String responseContentType) {
            this.putQueryParameter("response-content-type", responseContentType);
            this.responseContentType = responseContentType;
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
         * <p>response-expires.</p>
         */
        public Builder responseExpires(String responseExpires) {
            this.putQueryParameter("response-expires", responseExpires);
            this.responseExpires = responseExpires;
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
         * <p>Range.</p>
         */
        public Builder range(String range) {
            this.putHeaderParameter("Range", range);
            this.range = range;
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

        /**
         * <p>Accept-Encoding.</p>
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("Accept-Encoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        public GetObjectRequest build() {
            return new GetObjectRequest(this);
        } 

    } 

}
