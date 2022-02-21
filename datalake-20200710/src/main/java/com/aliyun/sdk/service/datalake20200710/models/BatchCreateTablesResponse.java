// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateTablesResponse} extends {@link TeaModel}
 *
 * <p>BatchCreateTablesResponse</p>
 */
public class BatchCreateTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreateTablesResponseBody body;

    private BatchCreateTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreateTablesResponse create() {
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
    public BatchCreateTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreateTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreateTablesResponseBody body);

        @Override
        BatchCreateTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreateTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreateTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreateTablesResponse response) {
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
        public Builder body(BatchCreateTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreateTablesResponse build() {
            return new BatchCreateTablesResponse(this);
        } 

    } 

}
