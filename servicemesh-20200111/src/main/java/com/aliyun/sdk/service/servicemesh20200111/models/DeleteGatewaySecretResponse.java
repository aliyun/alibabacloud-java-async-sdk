// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewaySecretResponse} extends {@link TeaModel}
 *
 * <p>DeleteGatewaySecretResponse</p>
 */
public class DeleteGatewaySecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGatewaySecretResponseBody body;

    private DeleteGatewaySecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGatewaySecretResponse create() {
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
    public DeleteGatewaySecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGatewaySecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGatewaySecretResponseBody body);

        @Override
        DeleteGatewaySecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGatewaySecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGatewaySecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGatewaySecretResponse response) {
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
        public Builder body(DeleteGatewaySecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGatewaySecretResponse build() {
            return new DeleteGatewaySecretResponse(this);
        } 

    } 

}
