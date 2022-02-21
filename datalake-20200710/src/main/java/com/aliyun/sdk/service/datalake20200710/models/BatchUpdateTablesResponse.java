// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateTablesResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdateTablesResponse</p>
 */
public class BatchUpdateTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUpdateTablesResponseBody body;

    private BatchUpdateTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUpdateTablesResponse create() {
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
    public BatchUpdateTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUpdateTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUpdateTablesResponseBody body);

        @Override
        BatchUpdateTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdateTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUpdateTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdateTablesResponse response) {
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
        public Builder body(BatchUpdateTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUpdateTablesResponse build() {
            return new BatchUpdateTablesResponse(this);
        } 

    } 

}
