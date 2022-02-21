// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreatePartitionsResponse} extends {@link TeaModel}
 *
 * <p>BatchCreatePartitionsResponse</p>
 */
public class BatchCreatePartitionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreatePartitionsResponseBody body;

    private BatchCreatePartitionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreatePartitionsResponse create() {
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
    public BatchCreatePartitionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreatePartitionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreatePartitionsResponseBody body);

        @Override
        BatchCreatePartitionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreatePartitionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreatePartitionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreatePartitionsResponse response) {
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
        public Builder body(BatchCreatePartitionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreatePartitionsResponse build() {
            return new BatchCreatePartitionsResponse(this);
        } 

    } 

}
