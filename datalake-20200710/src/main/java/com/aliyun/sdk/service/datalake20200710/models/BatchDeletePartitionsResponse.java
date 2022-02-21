// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeletePartitionsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeletePartitionsResponse</p>
 */
public class BatchDeletePartitionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeletePartitionsResponseBody body;

    private BatchDeletePartitionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeletePartitionsResponse create() {
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
    public BatchDeletePartitionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeletePartitionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeletePartitionsResponseBody body);

        @Override
        BatchDeletePartitionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeletePartitionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeletePartitionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeletePartitionsResponse response) {
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
        public Builder body(BatchDeletePartitionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeletePartitionsResponse build() {
            return new BatchDeletePartitionsResponse(this);
        } 

    } 

}
