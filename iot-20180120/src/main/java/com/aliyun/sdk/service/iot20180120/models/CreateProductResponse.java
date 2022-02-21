// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductResponse} extends {@link TeaModel}
 *
 * <p>CreateProductResponse</p>
 */
public class CreateProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProductResponseBody body;

    private CreateProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProductResponse create() {
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
    public CreateProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProductResponseBody body);

        @Override
        CreateProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProductResponse response) {
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
        public Builder body(CreateProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProductResponse build() {
            return new CreateProductResponse(this);
        } 

    } 

}
