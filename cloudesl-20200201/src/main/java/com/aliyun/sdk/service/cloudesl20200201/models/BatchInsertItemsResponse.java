// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchInsertItemsResponse} extends {@link TeaModel}
 *
 * <p>BatchInsertItemsResponse</p>
 */
public class BatchInsertItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchInsertItemsResponseBody body;

    private BatchInsertItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchInsertItemsResponse create() {
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
    public BatchInsertItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchInsertItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchInsertItemsResponseBody body);

        @Override
        BatchInsertItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchInsertItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchInsertItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchInsertItemsResponse response) {
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
        public Builder body(BatchInsertItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchInsertItemsResponse build() {
            return new BatchInsertItemsResponse(this);
        } 

    } 

}
