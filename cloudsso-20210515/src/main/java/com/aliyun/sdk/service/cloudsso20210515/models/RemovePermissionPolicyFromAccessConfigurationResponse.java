// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    private RemovePermissionPolicyFromAccessConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemovePermissionPolicyFromAccessConfigurationResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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

    public interface Builder extends Response.Builder<RemovePermissionPolicyFromAccessConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemovePermissionPolicyFromAccessConfigurationResponseBody body);

        @Override
        RemovePermissionPolicyFromAccessConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemovePermissionPolicyFromAccessConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemovePermissionPolicyFromAccessConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemovePermissionPolicyFromAccessConfigurationResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RemovePermissionPolicyFromAccessConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemovePermissionPolicyFromAccessConfigurationResponse build() {
            return new RemovePermissionPolicyFromAccessConfigurationResponse(this);
        } 

    } 

}
