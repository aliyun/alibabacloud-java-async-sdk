// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OptionObjectRequest} extends {@link RequestModel}
 *
 * <p>OptionObjectRequest</p>
 */
public class OptionObjectRequest extends Request {
    @Path
    @NameInMap("key")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String accessControlRequestHeaders; 
        private String accessControlRequestMethod; 
        private String origin; 
        private String bucket; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>Access-Control-Request-Headers.</p>
         */
        public Builder accessControlRequestHeaders(String accessControlRequestHeaders) {
            this.putHeaderParameter("Access-Control-Request-Headers", accessControlRequestHeaders);
            this.accessControlRequestHeaders = accessControlRequestHeaders;
            return this;
        }

        /**
         * <p>Access-Control-Request-Method.</p>
         */
        public Builder accessControlRequestMethod(String accessControlRequestMethod) {
            this.putHeaderParameter("Access-Control-Request-Method", accessControlRequestMethod);
            this.accessControlRequestMethod = accessControlRequestMethod;
            return this;
        }

        /**
         * <p>Origin.</p>
         */
        public Builder origin(String origin) {
            this.putHeaderParameter("Origin", origin);
            this.origin = origin;
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

        public OptionObjectRequest build() {
            return new OptionObjectRequest(this);
        } 

    } 

}
