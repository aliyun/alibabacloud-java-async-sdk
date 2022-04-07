// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayServiceResponse} extends {@link TeaModel}
 *
 * <p>DeleteGatewayServiceResponse</p>
 */
public class DeleteGatewayServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGatewayServiceResponseBody body;

    private DeleteGatewayServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGatewayServiceResponse create() {
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
    public DeleteGatewayServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGatewayServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGatewayServiceResponseBody body);

        @Override
        DeleteGatewayServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGatewayServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGatewayServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGatewayServiceResponse response) {
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
        public Builder body(DeleteGatewayServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGatewayServiceResponse build() {
            return new DeleteGatewayServiceResponse(this);
        } 

    } 

}
