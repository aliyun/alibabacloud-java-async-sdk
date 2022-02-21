// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBindingResponse} extends {@link TeaModel}
 *
 * <p>CreateBindingResponse</p>
 */
public class CreateBindingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBindingResponseBody body;

    private CreateBindingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBindingResponse create() {
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
    public CreateBindingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBindingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBindingResponseBody body);

        @Override
        CreateBindingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBindingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBindingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBindingResponse response) {
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
        public Builder body(CreateBindingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBindingResponse build() {
            return new CreateBindingResponse(this);
        } 

    } 

}
