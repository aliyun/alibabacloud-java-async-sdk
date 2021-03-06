// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceVpcEndpointResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceVpcEndpointResponse</p>
 */
public class GetInstanceVpcEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceVpcEndpointResponseBody body;

    private GetInstanceVpcEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceVpcEndpointResponse create() {
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
    public GetInstanceVpcEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceVpcEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceVpcEndpointResponseBody body);

        @Override
        GetInstanceVpcEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceVpcEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceVpcEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceVpcEndpointResponse response) {
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
        public Builder body(GetInstanceVpcEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceVpcEndpointResponse build() {
            return new GetInstanceVpcEndpointResponse(this);
        } 

    } 

}
