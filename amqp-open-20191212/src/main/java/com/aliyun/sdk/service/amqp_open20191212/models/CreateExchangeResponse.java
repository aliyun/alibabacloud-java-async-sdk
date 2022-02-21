// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExchangeResponse} extends {@link TeaModel}
 *
 * <p>CreateExchangeResponse</p>
 */
public class CreateExchangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateExchangeResponseBody body;

    private CreateExchangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateExchangeResponse create() {
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
    public CreateExchangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateExchangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateExchangeResponseBody body);

        @Override
        CreateExchangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateExchangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateExchangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateExchangeResponse response) {
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
        public Builder body(CreateExchangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateExchangeResponse build() {
            return new CreateExchangeResponse(this);
        } 

    } 

}
