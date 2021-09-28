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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("Origin")
    private String origin;

    @Header
    @NameInMap("AccessControlRequestMethod")
    private String accessControlRequestMethod;

    @Header
    @NameInMap("AccessControlRequestHeaders")
    private String accessControlRequestHeaders;


    private OptionObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.origin = builder.origin;
        this.accessControlRequestMethod = builder.accessControlRequestMethod;
        this.accessControlRequestHeaders = builder.accessControlRequestHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OptionObjectRequest create() {
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
     * @return origin
     */
    public String origin() {
        return this.origin;
    }

    /**
     * @return accessControlRequestMethod
     */
    public String accessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    /**
     * @return accessControlRequestHeaders
     */
    public String accessControlRequestHeaders() {
        return this.accessControlRequestHeaders;
    }

    public static final class Builder extends Request.Builder<OptionObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private String origin; 
        private String accessControlRequestMethod; 
        private String accessControlRequestHeaders; 

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
         * <p>Origin.</p>
         */
        public Builder origin(String origin) {
            this.putHeaderParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>AccessControlRequestMethod.</p>
         */
        public Builder accessControlRequestMethod(String accessControlRequestMethod) {
            this.putHeaderParameter("AccessControlRequestMethod", accessControlRequestMethod);
            this.accessControlRequestMethod = accessControlRequestMethod;
            return this;
        }

        /**
         * <p>AccessControlRequestHeaders.</p>
         */
        public Builder accessControlRequestHeaders(String accessControlRequestHeaders) {
            this.putHeaderParameter("AccessControlRequestHeaders", accessControlRequestHeaders);
            this.accessControlRequestHeaders = accessControlRequestHeaders;
            return this;
        }

        public OptionObjectRequest build() {
            return new OptionObjectRequest(this);
        } 

    } 

}
