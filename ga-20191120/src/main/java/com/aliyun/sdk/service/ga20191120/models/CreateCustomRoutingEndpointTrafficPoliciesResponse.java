// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointTrafficPoliciesResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointTrafficPoliciesResponse</p>
 */
public class CreateCustomRoutingEndpointTrafficPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomRoutingEndpointTrafficPoliciesResponseBody body;

    private CreateCustomRoutingEndpointTrafficPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomRoutingEndpointTrafficPoliciesResponse create() {
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
    public CreateCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomRoutingEndpointTrafficPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomRoutingEndpointTrafficPoliciesResponseBody body);

        @Override
        CreateCustomRoutingEndpointTrafficPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomRoutingEndpointTrafficPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomRoutingEndpointTrafficPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomRoutingEndpointTrafficPoliciesResponse response) {
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
        public Builder body(CreateCustomRoutingEndpointTrafficPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomRoutingEndpointTrafficPoliciesResponse build() {
            return new CreateCustomRoutingEndpointTrafficPoliciesResponse(this);
        } 

    } 

}
