// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDriverConfigsResponse} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDriverConfigsResponse</p>
 */
public class BatchGetEdgeInstanceDriverConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetEdgeInstanceDriverConfigsResponseBody body;

    private BatchGetEdgeInstanceDriverConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetEdgeInstanceDriverConfigsResponse create() {
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
    public BatchGetEdgeInstanceDriverConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetEdgeInstanceDriverConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetEdgeInstanceDriverConfigsResponseBody body);

        @Override
        BatchGetEdgeInstanceDriverConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetEdgeInstanceDriverConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetEdgeInstanceDriverConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetEdgeInstanceDriverConfigsResponse response) {
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
        public Builder body(BatchGetEdgeInstanceDriverConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetEdgeInstanceDriverConfigsResponse build() {
            return new BatchGetEdgeInstanceDriverConfigsResponse(this);
        } 

    } 

}
