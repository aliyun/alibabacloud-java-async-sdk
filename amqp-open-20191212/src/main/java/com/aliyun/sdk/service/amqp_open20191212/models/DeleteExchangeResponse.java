// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExchangeResponse} extends {@link TeaModel}
 *
 * <p>DeleteExchangeResponse</p>
 */
public class DeleteExchangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExchangeResponseBody body;

    private DeleteExchangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExchangeResponse create() {
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
    public DeleteExchangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExchangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExchangeResponseBody body);

        @Override
        DeleteExchangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExchangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExchangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExchangeResponse response) {
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
        public Builder body(DeleteExchangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExchangeResponse build() {
            return new DeleteExchangeResponse(this);
        } 

    } 

}
