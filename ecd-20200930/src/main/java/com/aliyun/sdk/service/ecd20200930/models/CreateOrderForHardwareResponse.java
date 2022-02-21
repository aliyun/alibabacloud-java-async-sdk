// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderForHardwareResponse} extends {@link TeaModel}
 *
 * <p>CreateOrderForHardwareResponse</p>
 */
public class CreateOrderForHardwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrderForHardwareResponseBody body;

    private CreateOrderForHardwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrderForHardwareResponse create() {
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
    public CreateOrderForHardwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrderForHardwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrderForHardwareResponseBody body);

        @Override
        CreateOrderForHardwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrderForHardwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrderForHardwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrderForHardwareResponse response) {
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
        public Builder body(CreateOrderForHardwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrderForHardwareResponse build() {
            return new CreateOrderForHardwareResponse(this);
        } 

    } 

}
