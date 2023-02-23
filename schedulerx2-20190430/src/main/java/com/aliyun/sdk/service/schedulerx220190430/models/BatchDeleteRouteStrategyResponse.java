// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteRouteStrategyResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteRouteStrategyResponse</p>
 */
public class BatchDeleteRouteStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteRouteStrategyResponseBody body;

    private BatchDeleteRouteStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteRouteStrategyResponse create() {
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
    public BatchDeleteRouteStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteRouteStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteRouteStrategyResponseBody body);

        @Override
        BatchDeleteRouteStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteRouteStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteRouteStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteRouteStrategyResponse response) {
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
        public Builder body(BatchDeleteRouteStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteRouteStrategyResponse build() {
            return new BatchDeleteRouteStrategyResponse(this);
        } 

    } 

}
