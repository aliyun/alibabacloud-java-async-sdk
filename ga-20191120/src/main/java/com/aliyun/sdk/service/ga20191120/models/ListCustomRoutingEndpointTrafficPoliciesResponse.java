// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointTrafficPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointTrafficPoliciesResponse</p>
 */
public class ListCustomRoutingEndpointTrafficPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomRoutingEndpointTrafficPoliciesResponseBody body;

    private ListCustomRoutingEndpointTrafficPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomRoutingEndpointTrafficPoliciesResponse create() {
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
    public ListCustomRoutingEndpointTrafficPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomRoutingEndpointTrafficPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomRoutingEndpointTrafficPoliciesResponseBody body);

        @Override
        ListCustomRoutingEndpointTrafficPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomRoutingEndpointTrafficPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomRoutingEndpointTrafficPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomRoutingEndpointTrafficPoliciesResponse response) {
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
        public Builder body(ListCustomRoutingEndpointTrafficPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomRoutingEndpointTrafficPoliciesResponse build() {
            return new ListCustomRoutingEndpointTrafficPoliciesResponse(this);
        } 

    } 

}
