// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RestoreObjectRequest} extends {@link RequestModel}
 *
 * <p>RestoreObjectRequest</p>
 */
public class RestoreObjectRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("restoreRequest")
    private RestoreRequest restoreRequest;


    private RestoreObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.restoreRequest = builder.restoreRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreObjectRequest create() {
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
     * @return restoreRequest
     */
    public RestoreRequest restoreRequest() {
        return this.restoreRequest;
    }

    public static final class Builder extends Request.Builder<RestoreObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private RestoreRequest restoreRequest; 

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
         * <p>restoreRequest.</p>
         */
        public Builder restoreRequest(RestoreRequest restoreRequest) {
            this.putBodyParameter("restoreRequest", restoreRequest);
            this.restoreRequest = restoreRequest;
            return this;
        }

        public RestoreObjectRequest build() {
            return new RestoreObjectRequest(this);
        } 

    } 

}
