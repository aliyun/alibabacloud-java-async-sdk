// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcEndpointServiceAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetVpcEndpointServiceAttributeResponse</p>
 */
public class GetVpcEndpointServiceAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVpcEndpointServiceAttributeResponseBody body;

    private GetVpcEndpointServiceAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVpcEndpointServiceAttributeResponse create() {
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
    public GetVpcEndpointServiceAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVpcEndpointServiceAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVpcEndpointServiceAttributeResponseBody body);

        @Override
        GetVpcEndpointServiceAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVpcEndpointServiceAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVpcEndpointServiceAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVpcEndpointServiceAttributeResponse response) {
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
        public Builder body(GetVpcEndpointServiceAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVpcEndpointServiceAttributeResponse build() {
            return new GetVpcEndpointServiceAttributeResponse(this);
        } 

    } 

}
