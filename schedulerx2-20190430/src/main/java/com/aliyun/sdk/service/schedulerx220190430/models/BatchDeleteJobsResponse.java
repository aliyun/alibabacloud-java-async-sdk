// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteJobsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteJobsResponse</p>
 */
public class BatchDeleteJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteJobsResponseBody body;

    private BatchDeleteJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteJobsResponse create() {
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
    public BatchDeleteJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteJobsResponseBody body);

        @Override
        BatchDeleteJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteJobsResponse response) {
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
        public Builder body(BatchDeleteJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteJobsResponse build() {
            return new BatchDeleteJobsResponse(this);
        } 

    } 

}
