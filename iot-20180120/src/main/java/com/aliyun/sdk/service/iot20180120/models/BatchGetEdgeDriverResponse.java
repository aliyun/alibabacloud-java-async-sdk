// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeDriverResponse} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeDriverResponse</p>
 */
public class BatchGetEdgeDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetEdgeDriverResponseBody body;

    private BatchGetEdgeDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetEdgeDriverResponse create() {
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
    public BatchGetEdgeDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetEdgeDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetEdgeDriverResponseBody body);

        @Override
        BatchGetEdgeDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetEdgeDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetEdgeDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetEdgeDriverResponse response) {
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
        public Builder body(BatchGetEdgeDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetEdgeDriverResponse build() {
            return new BatchGetEdgeDriverResponse(this);
        } 

    } 

}
