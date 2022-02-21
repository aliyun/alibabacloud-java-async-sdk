// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteTablesResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteTablesResponse</p>
 */
public class BatchDeleteTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteTablesResponseBody body;

    private BatchDeleteTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteTablesResponse create() {
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
    public BatchDeleteTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteTablesResponseBody body);

        @Override
        BatchDeleteTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteTablesResponse response) {
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
        public Builder body(BatchDeleteTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteTablesResponse build() {
            return new BatchDeleteTablesResponse(this);
        } 

    } 

}
