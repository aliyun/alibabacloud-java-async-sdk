// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderForRdsResponse} extends {@link TeaModel}
 *
 * <p>CreateOrderForRdsResponse</p>
 */
public class CreateOrderForRdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrderForRdsResponseBody body;

    private CreateOrderForRdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrderForRdsResponse create() {
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
    public CreateOrderForRdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrderForRdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrderForRdsResponseBody body);

        @Override
        CreateOrderForRdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrderForRdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrderForRdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrderForRdsResponse response) {
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
        public Builder body(CreateOrderForRdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrderForRdsResponse build() {
            return new CreateOrderForRdsResponse(this);
        } 

    } 

}
