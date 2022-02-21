// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddResolverEndpointResponse} extends {@link TeaModel}
 *
 * <p>AddResolverEndpointResponse</p>
 */
public class AddResolverEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddResolverEndpointResponseBody body;

    private AddResolverEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddResolverEndpointResponse create() {
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
    public AddResolverEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddResolverEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddResolverEndpointResponseBody body);

        @Override
        AddResolverEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddResolverEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddResolverEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddResolverEndpointResponse response) {
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
        public Builder body(AddResolverEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddResolverEndpointResponse build() {
            return new AddResolverEndpointResponse(this);
        } 

    } 

}
