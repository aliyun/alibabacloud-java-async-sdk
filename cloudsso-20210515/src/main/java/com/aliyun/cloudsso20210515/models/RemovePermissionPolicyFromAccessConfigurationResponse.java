// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RemovePermissionPolicyFromAccessConfigurationResponse} extends {@link TeaModel}
 *
 * <p>RemovePermissionPolicyFromAccessConfigurationResponse</p>
 */
public class RemovePermissionPolicyFromAccessConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemovePermissionPolicyFromAccessConfigurationResponseBody body;


    private RemovePermissionPolicyFromAccessConfigurationResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePermissionPolicyFromAccessConfigurationResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public RemovePermissionPolicyFromAccessConfigurationResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private RemovePermissionPolicyFromAccessConfigurationResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(RemovePermissionPolicyFromAccessConfigurationResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(RemovePermissionPolicyFromAccessConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        public RemovePermissionPolicyFromAccessConfigurationResponse build() {
            return new RemovePermissionPolicyFromAccessConfigurationResponse(this);
        } 

    } 

}
