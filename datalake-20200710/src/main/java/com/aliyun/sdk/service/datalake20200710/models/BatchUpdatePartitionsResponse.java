// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdatePartitionsResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdatePartitionsResponse</p>
 */
public class BatchUpdatePartitionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUpdatePartitionsResponseBody body;

    private BatchUpdatePartitionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUpdatePartitionsResponse create() {
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
    public BatchUpdatePartitionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUpdatePartitionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUpdatePartitionsResponseBody body);

        @Override
        BatchUpdatePartitionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdatePartitionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUpdatePartitionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdatePartitionsResponse response) {
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
        public Builder body(BatchUpdatePartitionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUpdatePartitionsResponse build() {
            return new BatchUpdatePartitionsResponse(this);
        } 

    } 

}
