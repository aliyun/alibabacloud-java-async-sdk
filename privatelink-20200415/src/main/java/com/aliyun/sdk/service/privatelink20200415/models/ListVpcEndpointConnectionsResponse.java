// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointConnectionsResponse} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointConnectionsResponse</p>
 */
public class ListVpcEndpointConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcEndpointConnectionsResponseBody body;

    private ListVpcEndpointConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcEndpointConnectionsResponse create() {
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
    public ListVpcEndpointConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcEndpointConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcEndpointConnectionsResponseBody body);

        @Override
        ListVpcEndpointConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcEndpointConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcEndpointConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcEndpointConnectionsResponse response) {
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
        public Builder body(ListVpcEndpointConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcEndpointConnectionsResponse build() {
            return new ListVpcEndpointConnectionsResponse(this);
        } 

    } 

}
