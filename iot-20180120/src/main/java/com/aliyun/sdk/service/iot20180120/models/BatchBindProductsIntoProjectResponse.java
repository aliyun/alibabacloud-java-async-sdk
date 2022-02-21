// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindProductsIntoProjectResponse} extends {@link TeaModel}
 *
 * <p>BatchBindProductsIntoProjectResponse</p>
 */
public class BatchBindProductsIntoProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindProductsIntoProjectResponseBody body;

    private BatchBindProductsIntoProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindProductsIntoProjectResponse create() {
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
    public BatchBindProductsIntoProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindProductsIntoProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindProductsIntoProjectResponseBody body);

        @Override
        BatchBindProductsIntoProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindProductsIntoProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindProductsIntoProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindProductsIntoProjectResponse response) {
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
        public Builder body(BatchBindProductsIntoProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindProductsIntoProjectResponse build() {
            return new BatchBindProductsIntoProjectResponse(this);
        } 

    } 

}
