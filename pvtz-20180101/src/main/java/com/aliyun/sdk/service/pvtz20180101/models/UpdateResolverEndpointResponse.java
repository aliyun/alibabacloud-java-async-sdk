// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResolverEndpointResponse} extends {@link TeaModel}
 *
 * <p>UpdateResolverEndpointResponse</p>
 */
public class UpdateResolverEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResolverEndpointResponseBody body;

    private UpdateResolverEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResolverEndpointResponse create() {
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
    public UpdateResolverEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResolverEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResolverEndpointResponseBody body);

        @Override
        UpdateResolverEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResolverEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResolverEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResolverEndpointResponse response) {
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
        public Builder body(UpdateResolverEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResolverEndpointResponse build() {
            return new UpdateResolverEndpointResponse(this);
        } 

    } 

}
