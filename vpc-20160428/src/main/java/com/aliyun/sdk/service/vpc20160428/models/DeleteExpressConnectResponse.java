// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExpressConnectResponse} extends {@link TeaModel}
 *
 * <p>DeleteExpressConnectResponse</p>
 */
public class DeleteExpressConnectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExpressConnectResponseBody body;

    private DeleteExpressConnectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExpressConnectResponse create() {
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
    public DeleteExpressConnectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExpressConnectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExpressConnectResponseBody body);

        @Override
        DeleteExpressConnectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExpressConnectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExpressConnectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExpressConnectResponse response) {
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
        public Builder body(DeleteExpressConnectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExpressConnectResponse build() {
            return new DeleteExpressConnectResponse(this);
        } 

    } 

}
