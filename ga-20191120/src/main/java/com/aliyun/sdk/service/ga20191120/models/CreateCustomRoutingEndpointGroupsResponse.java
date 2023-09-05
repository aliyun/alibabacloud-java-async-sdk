// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointGroupsResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointGroupsResponse</p>
 */
public class CreateCustomRoutingEndpointGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomRoutingEndpointGroupsResponseBody body;

    private CreateCustomRoutingEndpointGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomRoutingEndpointGroupsResponse create() {
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
    public CreateCustomRoutingEndpointGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomRoutingEndpointGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomRoutingEndpointGroupsResponseBody body);

        @Override
        CreateCustomRoutingEndpointGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomRoutingEndpointGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomRoutingEndpointGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomRoutingEndpointGroupsResponse response) {
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
        public Builder body(CreateCustomRoutingEndpointGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomRoutingEndpointGroupsResponse build() {
            return new CreateCustomRoutingEndpointGroupsResponse(this);
        } 

    } 

}
