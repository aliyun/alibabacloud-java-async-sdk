// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchEnableJobsResponse} extends {@link TeaModel}
 *
 * <p>BatchEnableJobsResponse</p>
 */
public class BatchEnableJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchEnableJobsResponseBody body;

    private BatchEnableJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchEnableJobsResponse create() {
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
    public BatchEnableJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchEnableJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchEnableJobsResponseBody body);

        @Override
        BatchEnableJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchEnableJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchEnableJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchEnableJobsResponse response) {
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
        public Builder body(BatchEnableJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchEnableJobsResponse build() {
            return new BatchEnableJobsResponse(this);
        } 

    } 

}
