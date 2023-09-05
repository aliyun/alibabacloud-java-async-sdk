// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointGroupsResponse</p>
 */
public class ListCustomRoutingEndpointGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomRoutingEndpointGroupsResponseBody body;

    private ListCustomRoutingEndpointGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomRoutingEndpointGroupsResponse create() {
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
    public ListCustomRoutingEndpointGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomRoutingEndpointGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomRoutingEndpointGroupsResponseBody body);

        @Override
        ListCustomRoutingEndpointGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomRoutingEndpointGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomRoutingEndpointGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomRoutingEndpointGroupsResponse response) {
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
        public Builder body(ListCustomRoutingEndpointGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomRoutingEndpointGroupsResponse build() {
            return new ListCustomRoutingEndpointGroupsResponse(this);
        } 

    } 

}
