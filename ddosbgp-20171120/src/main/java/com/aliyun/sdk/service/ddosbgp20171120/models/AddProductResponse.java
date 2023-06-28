// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProductResponse} extends {@link TeaModel}
 *
 * <p>AddProductResponse</p>
 */
public class AddProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddProductResponseBody body;

    private AddProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddProductResponse create() {
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
    public AddProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddProductResponseBody body);

        @Override
        AddProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProductResponse response) {
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
        public Builder body(AddProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProductResponse build() {
            return new AddProductResponse(this);
        } 

    } 

}
