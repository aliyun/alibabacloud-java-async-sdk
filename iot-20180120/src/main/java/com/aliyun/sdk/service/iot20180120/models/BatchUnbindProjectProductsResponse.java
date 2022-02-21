// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindProjectProductsResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindProjectProductsResponse</p>
 */
public class BatchUnbindProjectProductsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUnbindProjectProductsResponseBody body;

    private BatchUnbindProjectProductsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUnbindProjectProductsResponse create() {
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
    public BatchUnbindProjectProductsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindProjectProductsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUnbindProjectProductsResponseBody body);

        @Override
        BatchUnbindProjectProductsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindProjectProductsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUnbindProjectProductsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindProjectProductsResponse response) {
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
        public Builder body(BatchUnbindProjectProductsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindProjectProductsResponse build() {
            return new BatchUnbindProjectProductsResponse(this);
        } 

    } 

}
