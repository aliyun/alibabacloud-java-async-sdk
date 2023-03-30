// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayAuthConsumerResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteGatewayAuthConsumerResourceResponse</p>
 */
public class DeleteGatewayAuthConsumerResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGatewayAuthConsumerResourceResponseBody body;

    private DeleteGatewayAuthConsumerResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGatewayAuthConsumerResourceResponse create() {
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
    public DeleteGatewayAuthConsumerResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGatewayAuthConsumerResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGatewayAuthConsumerResourceResponseBody body);

        @Override
        DeleteGatewayAuthConsumerResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGatewayAuthConsumerResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGatewayAuthConsumerResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGatewayAuthConsumerResourceResponse response) {
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
        public Builder body(DeleteGatewayAuthConsumerResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGatewayAuthConsumerResourceResponse build() {
            return new DeleteGatewayAuthConsumerResourceResponse(this);
        } 

    } 

}
