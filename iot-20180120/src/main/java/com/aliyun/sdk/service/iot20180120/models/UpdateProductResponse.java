// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductResponse} extends {@link TeaModel}
 *
 * <p>UpdateProductResponse</p>
 */
public class UpdateProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProductResponseBody body;

    private UpdateProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProductResponse create() {
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
    public UpdateProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProductResponseBody body);

        @Override
        UpdateProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProductResponse response) {
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
        public Builder body(UpdateProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProductResponse build() {
            return new UpdateProductResponse(this);
        } 

    } 

}
