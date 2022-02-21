// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServiceResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServiceResourcesResponse</p>
 */
public class ListVpcEndpointServiceResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcEndpointServiceResourcesResponseBody body;

    private ListVpcEndpointServiceResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcEndpointServiceResourcesResponse create() {
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
    public ListVpcEndpointServiceResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcEndpointServiceResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcEndpointServiceResourcesResponseBody body);

        @Override
        ListVpcEndpointServiceResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcEndpointServiceResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcEndpointServiceResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcEndpointServiceResourcesResponse response) {
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
        public Builder body(ListVpcEndpointServiceResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcEndpointServiceResourcesResponse build() {
            return new ListVpcEndpointServiceResourcesResponse(this);
        } 

    } 

}
