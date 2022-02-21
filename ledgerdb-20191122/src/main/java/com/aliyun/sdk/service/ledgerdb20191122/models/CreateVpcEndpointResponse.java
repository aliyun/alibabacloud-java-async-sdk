// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointResponse</p>
 */
public class CreateVpcEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcEndpointResponseBody body;

    private CreateVpcEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpcEndpointResponse create() {
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
    public CreateVpcEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpcEndpointResponseBody body);

        @Override
        CreateVpcEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpcEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcEndpointResponse response) {
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
        public Builder body(CreateVpcEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcEndpointResponse build() {
            return new CreateVpcEndpointResponse(this);
        } 

    } 

}
