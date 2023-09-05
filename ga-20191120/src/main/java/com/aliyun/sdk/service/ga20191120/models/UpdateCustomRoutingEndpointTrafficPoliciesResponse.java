// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointTrafficPoliciesResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointTrafficPoliciesResponse</p>
 */
public class UpdateCustomRoutingEndpointTrafficPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body;

    private UpdateCustomRoutingEndpointTrafficPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCustomRoutingEndpointTrafficPoliciesResponse create() {
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
    public UpdateCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomRoutingEndpointTrafficPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body);

        @Override
        UpdateCustomRoutingEndpointTrafficPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomRoutingEndpointTrafficPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomRoutingEndpointTrafficPoliciesResponse response) {
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
        public Builder body(UpdateCustomRoutingEndpointTrafficPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomRoutingEndpointTrafficPoliciesResponse build() {
            return new UpdateCustomRoutingEndpointTrafficPoliciesResponse(this);
        } 

    } 

}
