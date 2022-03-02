// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link OptionObjectRequest} extends {@link RequestModel}
 *
 * <p>OptionObjectRequest</p>
 */
public class OptionObjectRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Header
    @NameInMap("Access-Control-Request-Headers")
    private String accessControlRequestHeaders;

    @Header
    @NameInMap("Access-Control-Request-Method")
    private String accessControlRequestMethod;

    @Header
    @NameInMap("Origin")
    private String origin;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private OptionObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.accessControlRequestHeaders = builder.accessControlRequestHeaders;
        this.accessControlRequestMethod = builder.accessControlRequestMethod;
        this.origin = builder.origin;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OptionObjectRequest create() {
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
     * @return accessControlRequestHeaders
     */
    public String getAccessControlRequestHeaders() {
        return this.accessControlRequestHeaders;
    }

    /**
     * @return accessControlRequestMethod
     */
    public String getAccessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<OptionObjectRequest, Builder> {
        private String key; 
        private String accessControlRequestHeaders; 
        private String accessControlRequestMethod; 
        private String origin; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(OptionObjectRequest request) {
            super(request);
            this.key = request.key;
            this.accessControlRequestHeaders = request.accessControlRequestHeaders;
            this.accessControlRequestMethod = request.accessControlRequestMethod;
            this.origin = request.origin;
            this.bucket = request.bucket;
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
         * Access-Control-Request-Headers.
         */
        public Builder accessControlRequestHeaders(String accessControlRequestHeaders) {
            this.putHeaderParameter("Access-Control-Request-Headers", accessControlRequestHeaders);
            this.accessControlRequestHeaders = accessControlRequestHeaders;
            return this;
        }

        /**
         * Access-Control-Request-Method.
         */
        public Builder accessControlRequestMethod(String accessControlRequestMethod) {
            this.putHeaderParameter("Access-Control-Request-Method", accessControlRequestMethod);
            this.accessControlRequestMethod = accessControlRequestMethod;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.putHeaderParameter("Origin", origin);
            this.origin = origin;
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

        @Override
        public OptionObjectRequest build() {
            return new OptionObjectRequest(this);
        } 

    } 

}
